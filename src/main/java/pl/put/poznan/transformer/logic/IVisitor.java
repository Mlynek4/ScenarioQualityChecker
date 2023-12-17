package pl.put.poznan.transformer.logic;

/**
 * Interface used iterate through steps of a scenario.
 * @see Scenario
 */
public interface IVisitor {
    /**
     * Method used for visiting a scenario.
     * @param scenario Scenario being visited.
     */
    void visitScenario(Scenario scenario);

    /**
     * Method used for visiting a subscenario during iteration through scenario's steps.
     * @param subscenario Subscenario being visited.
     */
    void visitSubscenario(Subscenario subscenario);

    /**
     * Method used for visiting a step during iteration through scenario's steps.
     * @param step Step being visited.
     */
    void visitStep(Step step);
}
