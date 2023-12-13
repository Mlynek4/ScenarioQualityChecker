package pl.put.poznan.transformer.logic;

public class StepsCounter implements IVisitor {
    private int numberOfStepsInWholeScenario = 0;

    @Override
    public void visitScenario(Scenario scenario) {
    }

    @Override
    public void visitSubscenario(Subscenario subscenario) {
    }

    @Override
    public void visitStep(Step step) {
        numberOfStepsInWholeScenario++;
    }

    public int getNumberOfStepsInWholeScenario() {
        return numberOfStepsInWholeScenario;
    }
}
