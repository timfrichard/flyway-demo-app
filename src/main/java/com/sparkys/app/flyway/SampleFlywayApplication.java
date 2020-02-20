package com.sparkys.app.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleFlywayApplication {

    public static void main(final String[] args) {
	SpringApplication.run(SampleFlywayApplication.class, args);
    }

    // @Bean
    // public FlywayMigrationStrategy repair() {
    // return flyway -> {
    // // repair each script checksum
    // flyway.repair();
    // // before migration is executed
    // flyway.migrate();
    // };
    // }
}
