package com.gl.deseasesservice;

import com.gl.deseasesservice.api.DiseaseServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {

    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private DiseaseServiceApi doctorsServiceApi;
    @GetMapping("/allDiseases/{germs}")
    public String diseases(@PathVariable String germs){
        logger.info("got hit on /allDiseases/"+germs);
        return doctorsServiceApi.getDiseases(germs);
    }
}
