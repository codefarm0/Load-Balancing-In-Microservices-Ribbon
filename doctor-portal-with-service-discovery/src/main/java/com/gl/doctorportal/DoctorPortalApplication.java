package com.gl.doctorportal;

import com.gl.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name = "doctor-service-app", configuration = RibbonConfiguration.class)
@EnableDiscoveryClient
public class DoctorPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorPortalApplication.class, args);
    }

    @Bean
	@LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
