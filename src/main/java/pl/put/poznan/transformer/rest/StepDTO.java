package pl.put.poznan.transformer.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize
public record StepDTO(
        @JsonProperty("Krok") String content,
        @JsonProperty("Podscenariusz") List<StepDTO> subscenario
) {
}
