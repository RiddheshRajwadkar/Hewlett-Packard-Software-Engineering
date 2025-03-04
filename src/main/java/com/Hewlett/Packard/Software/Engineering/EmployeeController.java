package com.Hewlett.Packard.Software.Engineering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    public EmployeeManager employeeManager;

    @GetMapping("/allEmployee")
    public List<Employee> getEmployees(){
        return employeeManager.getAllEmployees();
    }

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee){
        System.out.println("Received Employee Data: " + employee);
        employeeManager.addEmployee(employee);
    }
}
