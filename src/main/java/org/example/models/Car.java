package org.example.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("car")
@JsonPropertyOrder({"brand", "model", "year", "speed", "hybrid", "tank", "features"})
public class Car {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonProperty("brand")
    private String brand;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonProperty("model")
    private String model;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("speed")
    private Double speed;
    @JsonFormat(shape = JsonFormat.Shape.BOOLEAN)
    @JsonProperty("hybrid")
    private Boolean hybrid;
    @JsonProperty("tank")
    private Short tank;
    @JsonProperty("features")
    private Map<String, Boolean> features;
}