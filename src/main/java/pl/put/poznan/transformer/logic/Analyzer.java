package pl.put.poznan.transformer.logic;

public class Analyzer implements IVisitor {
    @Override
    public void visitScenario(Scenario scenario) {

    }

    @Override
    public void visitSubscenario(Subscenario subscenario) {

    }

    public int getNumberOfStepsInWholeScenario() {
        return 0;
    }

    public int getNumberOfKeywords() {
        return 0;
    }

    public int getNumberOfStepsNotStartingWithActor() {
        return 0;
    }
}
