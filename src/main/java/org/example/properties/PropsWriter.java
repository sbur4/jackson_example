package org.example.properties;

import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import lombok.var;
import org.example.models.Car;
import org.example.models.Dto;
import org.example.models.Engine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PropsWriter {
    public static void main(String[] args) {
        Dto dto = Dto.builder().car(Car.builder().brand("Tesla").model("Y").speed(250.0).tank((short) 0).hybrid(false).build())
                .engine(Engine.builder().type(new String[]{"electric", "eco"}).power(Stream.of(5L, 7L)
                        .collect(Collectors.toList())).build()).build();

        JavaPropsMapper mapper = new JavaPropsMapper();

        try {
            Properties properties = mapper.writeValueAsProperties(dto);

            Path outputPath = Paths.get("examples/dto.properties");
            Files.createDirectories(outputPath.getParent()); // Create parent directories if not exist

            try (var writer = Files.newBufferedWriter(outputPath)) {
                properties.store(writer, null);
            }

            System.out.println("Properties written to: " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}