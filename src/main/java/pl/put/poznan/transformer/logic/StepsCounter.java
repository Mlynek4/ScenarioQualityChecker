package pl.put.poznan.transformer.logic;

/**
 * Used to count a total amount of steps appearing in a Scenario.
 */
public class StepsCounter implements IVisitor {
    private int numberOfStepsInWholeScenario = 0;
    private int numberOfStepsInScenario = 0;

    @Override
    public void visitScenario(Scenario scenario) {
        numberOfStepsInScenario = scenario.steps.size();
        numberOfStepsInWholeScenario += numberOfStepsInScenario;
    }

    @Override
    public void visitSubscenario(Subscenario subscenario) {
        numberOfStepsInWholeScenario += subscenario.steps.size();
    }

    @Override
    public void visitStep(Step step) {
    }

    public int getStepCountInMainScenario() {
        return numberOfStepsInScenario;
    }
    public int getStepCountInWholeScenario() {
        return numberOfStepsInWholeScenario;
    }
}
