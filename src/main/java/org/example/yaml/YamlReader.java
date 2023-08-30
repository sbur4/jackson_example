package org.example.yaml;

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Paths;

public class YamlReader {
    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        YAMLMapper objectMapper = new YAMLMapper(new YAMLFactory());
        Dto dto = objectMapper.readValue(Paths.get("examples/output_data.yml").toFile(), Dto.class);
        System.out.println(dto);
    }
}