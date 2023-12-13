package pl.put.poznan.transformer.logic;

public class KeyWordsCounter implements IVisitor{
    private int numberOfKeyWordsInWholeScenario = 0;

    @Override
    public void visitScenario(Scenario scenario) {

    }

    @Override
    public void visitSubscenario(Subscenario subscenario) {

    }

    @Override
    public void visitStep(Step step) {
        if(step.content.split(" ")[0].matches("IF:?")||step.content.split(" ")[0].matches("ELSE:?") || (step.content.split(" ")[0].matches("FOR") && step.content.split(" ")[1].matches("EACH:?"))){
            numberOfKeyWordsInWholeScenario++;
        }
    }

    public int getNumberOfKeyWordsInWholeScenario() {
        return numberOfKeyWordsInWholeScenario;
    }
}
