package org.example.json;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.models.Car;
import org.example.models.Dto;
import org.example.models.Engine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonWriter {
    public static void main(String[] args) {
        Dto dto = Dto.builder().car(Car.builder().brand("Tesla").model("Y").speed(250.0).tank((short) 0).hybrid(false).build())
                .engine(Engine.builder().type(new String[]{"electric", "eco"}).power(Stream.of(5L, 7L)
                        .collect(Collectors.toList())).build()).build();

//        ObjectMapper objectMapper = new JsonMapper();
        JsonMapper objectMapper = new JsonMapper();
        try {
            String json = objectMapper.writeValueAsString(dto);

            Path outputPath = Paths.get("examples/output_data.json");
            Files.write(outputPath, json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}