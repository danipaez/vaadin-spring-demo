package org.a2lpo.vemo;

import org.a2lpo.vemo.model.Customer;
import org.a2lpo.vemo.repos.CustomerRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VemoApplication {
    private static final Logger log = LoggerFactory.getLogger(VemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(VemoApplication.class, args);
    }

}
