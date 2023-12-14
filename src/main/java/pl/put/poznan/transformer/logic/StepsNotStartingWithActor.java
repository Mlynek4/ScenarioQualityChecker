package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StepsNotStartingWithActor implements IVisitor{
    private static final List<String> keywords = List.of("IF", "ELSE", "FOR EACH");
    private List<String> actors;
    private final List<String> found = new ArrayList<>();

    @Override
    public void visitScenario(Scenario scenario) {
        actors = Stream.concat(
                scenario.actors.stream(),
                scenario.systemActors.stream()
        ).map(String::toLowerCase).collect(Collectors.toList());
    }

    @Override
    public void visitSubscenario(Subscenario subscenario) {

    }

    @Override
    public void visitStep(Step step) {
        if (keywords.stream().anyMatch(step.content::startsWith)) {
            return;
        }

        var lowerCaseContent = step.content.toLowerCase();
        if (actors.stream().noneMatch(lowerCaseContent::startsWith)) {
            found.add(step.content);
        }
    }

    public List<String> getStepsNotStartingWithActor() {
        return found;
    }
}
