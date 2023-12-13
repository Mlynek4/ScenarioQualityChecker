package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import pl.put.poznan.transformer.rest.StepDTO;

import java.util.List;

public class Subscenario implements IElement {
    public static final Logger logger = org.slf4j.LoggerFactory.getLogger(Subscenario.class);
    public List<Step> steps;

    public Subscenario() {
    }

    public Subscenario(List<StepDTO> subscenario) {
        this.steps = subscenario.stream().map(Step::new).toList();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitSubscenario(this);
        logger.trace("Visiting subscenario");
        for (Step step : steps) {
            step.accept(visitor);
        }
    }
}
