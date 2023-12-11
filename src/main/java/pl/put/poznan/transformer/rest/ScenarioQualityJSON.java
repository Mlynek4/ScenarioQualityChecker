package pl.put.poznan.transformer.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/analyzeFromJSON")
public class ScenarioQualityJSON {
    private static final Logger logger = LoggerFactory.getLogger(ScenarioQualityJSON.class);

    @RequestMapping(path = "/full", method = RequestMethod.POST, produces = "application/json")
    public void analyzeFull(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the full analysis of the scenario");
        logger.debug(scenario.title);
        logger.debug(scenario.actors.toString());
        logger.debug(scenario.systemActors.toString());
    }

    @RequestMapping(path = "/actors", method = RequestMethod.POST, produces = "application/json")
    public void analyzeActors(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the actors in the scenario");
        logger.debug(scenario.actors.toString());
    }

    @RequestMapping(path = "/systemActors", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSystemActors(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the system actors in the scenario");
        logger.debug(scenario.systemActors.toString());
    }

    @RequestMapping(path = "/title", method = RequestMethod.POST, produces = "application/json")
    public void analyzeTitle(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the title in the scenario");
        logger.debug(scenario.title);
    }

    @RequestMapping(path = "/steps", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSteps(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the steps in the scenario");
        logger.debug(scenario.title);
    }

    @RequestMapping(path = "/stepsCount", method = RequestMethod.POST, produces = "application/json")
    public void analyzeStepsCount(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the steps count in the scenario");
        logger.debug(scenario.title);
    }

    @RequestMapping(path = "/actorsCount", method = RequestMethod.POST, produces = "application/json")
    public void analyzeActorsCount(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the actors count in the scenario");
        logger.debug(scenario.title);
    }

    @RequestMapping(path = "/systemActorsCount", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSystemActorsCount(@RequestBody ScenarioDTO scenario) {
        logger.debug("User requested to give the analysis of the system actors count in the scenario");
        logger.debug(scenario.title);
    }
}
