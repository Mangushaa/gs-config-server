package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableConfigServer
public class GsConfigServer {
    public static void main(String[] args) {
        System.out.println("Starting");
        System.out.println("Starting true2");
        SpringApplication.run(GsConfigServer.class);
    }
}
