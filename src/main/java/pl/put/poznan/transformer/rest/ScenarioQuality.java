package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.KeyWordsCounter;
import pl.put.poznan.transformer.logic.Scenario;
import pl.put.poznan.transformer.logic.StepsCounter;

import java.util.HashMap;


@RestController
@RequestMapping("/api/analyze")
public class ScenarioQuality {
    private static final Logger logger = LoggerFactory.getLogger(ScenarioQuality.class);

    @RequestMapping(path = "/full", method = RequestMethod.POST, produces = "application/json")
    public void analyzeFull(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the full analysis of the scenario");
        logger.debug(scenario.title());
        logger.debug(scenario.actors().toString());
        logger.debug(scenario.systemActors().toString());
    }

    @RequestMapping(path = "/actors", method = RequestMethod.POST, produces = "application/json")
    public void analyzeActors(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the actors in the scenario");
        logger.debug(scenario.actors().toString());
    }

    @RequestMapping(path = "/systemActors", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSystemActors(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the system actors in the scenario");
        logger.debug(scenario.systemActors().toString());
    }

    @RequestMapping(path = "/title", method = RequestMethod.POST, produces = "application/json")
    public void analyzeTitle(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the title in the scenario");
        logger.debug(scenario.title());
    }

    @RequestMapping(path = "/steps", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSteps(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the steps in the scenario");
        logger.debug(scenario.title());
    }

    @RequestMapping(path = "/stepsCount", method = RequestMethod.POST, produces = "application/json")
    public HashMap<String, Integer> analyzeStepsCount(@RequestBody ScenarioDTO scenario) {
        var scen = new Scenario(scenario);
        var stepsCounter = new StepsCounter();
        scen.accept(stepsCounter);
        logger.debug("Steps count: " + stepsCounter.getStepCountInWholeScenario());

        var map = new HashMap<String, Integer>();
        map.put("liczbaKrokówWCałymScenariuszu", stepsCounter.getStepCountInWholeScenario());
        map.put("liczbaKrokówWGłownymScenariuszu", stepsCounter.getStepCountInMainScenario());

        return map;
    }
    @RequestMapping(path = "/KeyWordsCount", method = RequestMethod.POST, produces = "application/json")
    public HashMap<String, Integer> analyzeKeyWordsCount(@RequestBody ScenarioDTO scenario) {
        var scen = new Scenario(scenario);
        var keyWordsCounter = new KeyWordsCounter();
        scen.accept(keyWordsCounter);
        logger.debug("Key Words count: " + keyWordsCounter.getNumberOfKeyWordsInWholeScenario());

        var map = new HashMap<String, Integer>();
        map.put("liczbaSłówKluczowych", keyWordsCounter.getNumberOfKeyWordsInWholeScenario());

        return map;
    }

    @RequestMapping(path = "/actorsCount", method = RequestMethod.POST, produces = "application/json")
    public void analyzeActorsCount(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the actors count in the scenario");
        logger.debug(scenario.title());
    }

    @RequestMapping(path = "/systemActorsCount", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSystemActorsCount(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the system actors count in the scenario");
        logger.debug(scenario.title());
    }
}
