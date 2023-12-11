package pl.put.poznan.transformer.rest;

import java.util.List;

public class ScenarioDTO {
    public String title;
    public List<String> actors;
    public List<String> systemActors;

    public List<StepDTO> steps;

    public class StepDTO {
        public String content;
        public List<StepDTO> substeps;
    }
}

