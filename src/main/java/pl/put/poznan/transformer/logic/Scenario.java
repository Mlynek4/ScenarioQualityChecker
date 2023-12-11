package pl.put.poznan.transformer.logic;

import java.util.List;

public class Scenario implements IElement {
    public int stepCount;
    public int stepsIncludingKeywords;
    public List<String> stepsStartingWithKeywords;

    @Override
    public void accept(IVisitor visitor) {

    }
}
