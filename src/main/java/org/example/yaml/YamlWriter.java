package org.example.yaml;

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.example.models.Car;
import org.example.models.Dto;
import org.example.models.Engine;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YamlWriter {
    public static void main(String[] args) throws IOException {
        Dto dto = Dto.builder().car(Car.builder().brand("Tesla").model("Y").speed(250.0).tank((short) 0).hybrid(false).build())
                .engine(Engine.builder().type(new String[]{"electric", "eco"}).power(Stream.of(5L, 7L)
                        .collect(Collectors.toList())).build()).build();

//        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        YAMLMapper objectMapper = new YAMLMapper(new YAMLFactory());

        objectMapper.writeValue(Paths.get("examples/output_data.yml").toFile(), dto);
    }
}