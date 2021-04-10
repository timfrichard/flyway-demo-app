package com.sparkys.app.flyway;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"unitTest", "buildTest"})
public class FlywayDemoTestConfig {
}
