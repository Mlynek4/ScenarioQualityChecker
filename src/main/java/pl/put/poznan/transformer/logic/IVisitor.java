package pl.put.poznan.transformer.logic;

public interface IVisitor {
    void visitScenario(Scenario scenario);
    void visitSubscenario(Subscenario subscenario);
}
