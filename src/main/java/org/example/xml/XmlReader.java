package org.example.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Paths;

public class XmlReader {
    public static void main(String[] args) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            Dto dto = xmlMapper.readValue(Paths.get("examples/output_data.xml").toFile(), Dto.class);

            System.out.println(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}