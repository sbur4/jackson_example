package org.example.json;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonReader {
    public static void main(String[] args) {
//        ObjectMapper objectMapper = new JsonMapper();
        JsonMapper objectMapper = new JsonMapper();
        try {
            Path inputPath = Paths.get("examples/output_data.json");
            byte[] jsonData = Files.readAllBytes(inputPath);
            Dto dto = objectMapper.readValue(jsonData, Dto.class);

            System.out.println(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}