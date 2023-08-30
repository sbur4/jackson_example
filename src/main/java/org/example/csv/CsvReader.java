package org.example.csv;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
    public static void main(String[] args) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = csvMapper.schemaFor(Dto.class).withHeader().withColumnSeparator('/');

        MappingIterator<Dto> dtosIterator = csvMapper.readerFor(Dto.class).with(schema)
                .readValues(Paths.get("examples/output_data.csv").toFile());

        List<Dto> dtos = dtosIterator.readAll();
        System.out.println(dtos);
        // todo read to dto
    }
}