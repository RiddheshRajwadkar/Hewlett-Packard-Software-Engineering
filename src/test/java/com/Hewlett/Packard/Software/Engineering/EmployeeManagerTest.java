package com.Hewlett.Packard.Software.Engineering;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    void testAddEmployee() {
        Employee emp = new Employee("1", "Alice", "Smith", "alice@example.com", "Engineer");

        employeeManager.addEmployee(emp);
        List<Employee> employees = employeeManager.getAllEmployees();

        assertEquals(1, employees.size());
        assertEquals("Alice", employees.get(0).getFirstName());
    }

    @Test
    void testEmptyEmployeeListInitially() {
        List<Employee> employees = employeeManager.getAllEmployees();
        assertTrue(employees.isEmpty(), "Employee list should be empty initially");
    }
}
