package io.pivotal.cf.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//some comment to trigger a build


@SpringBootApplication
public class CfWorkshopSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfWorkshopSpringBootApplication.class, args);
    }
}
