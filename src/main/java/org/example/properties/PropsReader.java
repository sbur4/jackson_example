package org.example.properties;

import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PropsReader {
    public static void main(String[] args) {
        JavaPropsMapper mapper = new JavaPropsMapper();
        try {
            Dto dto = mapper.readValue(Files.newInputStream(Paths.get("examples/dto.properties")), Dto.class);
            System.out.println(dto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}