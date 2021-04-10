package com.sparkys.app.flyway.repository;

import com.sparkys.app.flyway.core.entities.Employee;
import com.sparkys.app.flyway.core.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindbyId() {
        Employee employee = employeeRepository.findById(1L).get();

        assertAll("Asserting all of the values needed",
                () -> assertNotNull(employee),
                () -> assertEquals("nfreehafer", employee.getLogonid()),
                () -> assertEquals("Northwind Traders", employee.getBusInfo().getCompany()),
                () -> assertEquals("(123)555-0100", employee.getBusInfo().getBusinessPhone()),
                () -> assertEquals("nancy@northwindtraders.com", employee.getBusInfo().getEmailAddress()),
                () -> assertEquals("Nancy", employee.getBusInfo().getFirstName()),
                () -> assertEquals("Nancy Freehafer", employee.getBusInfo().getFullName()),
                () -> assertEquals("Sales Representative", employee.getBusInfo().getJobTitle()),
                () -> assertEquals("Freehafer", employee.getBusInfo().getLastName())
        );
    }

}
