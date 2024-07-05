package com.tall.servicedonfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServicedonfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicedonfigurationApplication.class, args);
    }

}
