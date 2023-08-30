package org.example.csv;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.example.models.Car;
import org.example.models.Dto;
import org.example.models.Engine;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvWriter {
    public static void main(String[] args) throws IOException {
        Dto dto = Dto.builder().car(Car.builder().brand("Tesla").model("Y").speed(250.0).tank((short) 0).hybrid(false).build())
                .engine(Engine.builder().type(new String[]{"electric", "eco"}).power(Stream.of(5L, 7L)
                        .collect(Collectors.toList())).build()).build();

        CsvMapper csvMapper = new CsvMapper();
//        csvMapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);

        CsvSchema schema = csvMapper.schemaFor(Dto.class)
//                .withColumnSeparator('/')
//                .withNullValue("NULL")
                .withoutEscapeChar()
                .withHeader();
//        CsvSchema schema = csvMapper.schemaFor(Dto.class).withHeader();

        List<Dto> dtos = new ArrayList<>();
        dtos.add(dto);

        // add annotation @JsonUnwrapped to work with nested objects
        csvMapper.writerFor(Dto.class).with(schema).writeValues(Paths.get("examples/output_data.csv").toFile())
                .writeAll(dtos);
        // or
//        csvMapper.writer(schema).writeValue(Paths.get("examples/output_data.csv").toFile(), dtos);

    }
}