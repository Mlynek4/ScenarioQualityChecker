package pl.put.poznan.transformer.logic;

/**
 * Used to count a total amount of keywords appearing in a Scenario.
 */
public class KeyWordsCounter implements IVisitor{
    private int numberOfKeyWordsInWholeScenario = 0;

    @Override
    public void visitScenario(Scenario scenario) {

    }

    @Override
    public void visitSubscenario(Subscenario subscenario) {

    }

    /**
     * Checks if passed step contains a keyword and increases internal keyword counter if it does.
     */
    @Override
    public void visitStep(Step step) {
        if(step.content.split(" ")[0].matches("IF:?")||step.content.split(" ")[0].matches("ELSE:?") || (step.content.split(" ")[0].matches("FOR") && step.content.split("\\s+")[1].matches("EACH:?"))){
            numberOfKeyWordsInWholeScenario++;
        }
    }

    /**
     * Returns amount of keywords in a scenario.
     *
     * @return Total amount of keywords in analysed scenario.
     */
    public int getNumberOfKeyWordsInWholeScenario() {
        return numberOfKeyWordsInWholeScenario;
    }
}
