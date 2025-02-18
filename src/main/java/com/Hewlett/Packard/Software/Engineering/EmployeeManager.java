package com.Hewlett.Packard.Software.Engineering;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager{

    private Employees employees;

    public EmployeeManager(){
        employees = new Employees();
        employees.getEmployeeList().add(new Employee(1, "Riddhes", "Rajwadkar", "riddheshrajwadkar@gmail.com", "Software Developer"));
        employees.getEmployeeList().add(new Employee(2, "Yash", "Sawant", "yashsawant@gmail.com", "Web Developer"));
        employees.getEmployeeList().add(new Employee(3, "Jaswant", "Soni", "jaswantsoni@gmail.com", "UI Developer"));
    }

    public Employees getAllEmployees(){
        return employees;
    }
}