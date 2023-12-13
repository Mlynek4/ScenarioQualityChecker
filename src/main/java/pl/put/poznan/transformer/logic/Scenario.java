package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.transformer.rest.ScenarioDTO;

import java.util.List;

public class Scenario implements IElement {
    private static final Logger logger = LoggerFactory.getLogger(Scenario.class);

    public String title;
    public List<String> actors;
    public List<String> systemActors;
    public List<Step> steps;

    public Scenario() {
    }

    public Scenario(ScenarioDTO scenarioDTO) {
        this.title = scenarioDTO.title();
        this.actors = scenarioDTO.actors();
        this.systemActors = scenarioDTO.systemActors();
        this.steps = scenarioDTO.steps().stream().map(Step::new).toList();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitScenario(this);
        logger.trace("Visiting scenario: " + title);
        for (Step step : steps) {
            step.accept(visitor);
        }
    }
}
