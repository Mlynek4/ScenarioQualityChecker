package pl.put.poznan.transformer.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize
public record ScenarioDTO(
        @JsonProperty("Tytuł") String title,
        @JsonProperty("Aktorzy") List<String> actors,
        @JsonProperty("Aktor systemowy") List<String> systemActors,
        @JsonProperty("Kroki") List<StepDTO> steps
) {
}

