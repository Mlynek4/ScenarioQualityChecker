package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/analyzeFromString")
public class ScenarioQualityString {

    private static final Logger logger = LoggerFactory.getLogger(ScenarioQualityString.class);

    @RequestMapping(path = "/full", method = RequestMethod.POST, produces = "application/json")
    public void analyzeFull(@RequestBody String content) {
        logger.debug("User requested to give the full analysis of the scenario");
        logger.debug(content);
    }

    @RequestMapping(path = "/actors", method = RequestMethod.POST, produces = "application/json")
    public void analyzeActors(@RequestBody String content) {
        logger.debug("User requested to give the analysis of the actors in the scenario");
        logger.debug(content);
    }

    @RequestMapping(path = "/systemActors", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSystemActors(@RequestBody String content) {
        logger.debug("User requested to give the analysis of the system actors in the scenario");
        logger.debug(content);
    }

    @RequestMapping(path = "/title", method = RequestMethod.POST, produces = "application/json")
    public void analyzeTitle(@RequestBody String content) {
        logger.debug("User requested to give the analysis of the title in the scenario");
        logger.debug(content);
    }

    @RequestMapping(path = "/steps", method = RequestMethod.POST, produces = "application/json")
    public void analyzeSteps(@RequestBody String content) {
        logger.debug("User requested to give the analysis of the steps in the scenario");
        logger.debug(content);
    }

    @RequestMapping(path = "/stepsCount", method = RequestMethod.POST, produces = "application/json")
    public void analyzeStepsCount(@RequestBody String content) {
        logger.debug("User requested to give the analysis of the steps count in the scenario");
        logger.debug(content);
    }
}


