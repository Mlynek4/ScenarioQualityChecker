package pl.put.poznan.transformer.logic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import pl.put.poznan.transformer.rest.StepDTO;

public class Step implements IElement {
    private static final Logger logger = LoggerFactory.getLogger(Step.class);
    public String content;
    @Nullable
    public Subscenario subscenario;

    public Step() {
    }

    public Step(StepDTO stepDTO) {
        this.content = stepDTO.content();
        if (stepDTO.subscenario() != null) {
            this.subscenario = new Subscenario(stepDTO.subscenario());
        }
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitStep(this);
        logger.trace("Visiting step: " + content);
        if (subscenario != null) {
            subscenario.accept(visitor);
        }
    }
}
