package com.gl.deseasesservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */
@Service
public class DiseaseServiceApiImpl implements DiseaseServiceApi {
    private static Logger logger = LoggerFactory.getLogger(DiseaseServiceApiImpl.class);

    @Autowired
    private RestTemplateBuilder builder;

    @Override
    public String getDiseases(String germs) {
        logger.info("fetching diseases list from db for germ -{}", germs);

        RestTemplate template = builder.build();
        template.getForObject("http://localhost:5081/notify/diseases", String.class);

        return "List of diseases for germ - " + germs;
    }
}
