/**
 *
 */
package com.sparkys.app.flyway.config;

import com.sparkys.app.flyway.core.entities.Employee;
import com.sparkys.app.flyway.core.repository.EmployeeRepository;
import com.sparkys.app.flyway.core.utils.EmployeeUtils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tim
 *
 */
@Configuration
public class RunnerConfig {

    @Bean
    public CommandLineRunner runner(final EmployeeRepository repository) {

	// creating an employee
	final Employee employee = repository.findByLogonid("mylogonid");
	if (employee == null) {
	    repository.save(EmployeeUtils.createEmployee());
	}

	return args -> System.out.println(repository.findAll());
    }

}
