package com.Hewlett.Packard.Software.Engineering;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {

    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        System.out.println("Adding Employee: " + employee);
        employees.add(employee);
    }
}
