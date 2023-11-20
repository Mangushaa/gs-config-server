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
        SpringApplication.run(GsConfigServer.class);
    }
}
