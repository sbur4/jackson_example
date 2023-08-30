package org.example.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.models.Car;
import org.example.models.Dto;
import org.example.models.Engine;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XmlWriter {
    public static void main(String[] args) {
        try {
            Dto dto = Dto.builder().car(Car.builder().brand("Tesla").model("Y").speed(250.0).tank((short) 0).hybrid(false).build())
                    .engine(Engine.builder().type(new String[]{"electric", "eco"}).power(Stream.of(5L, 7L)
                            .collect(Collectors.toList())).build()).build();

            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(Paths.get("examples/output_data.xml").toFile(), dto);

            System.out.println("XML written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}