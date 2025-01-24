package com.Hewlett.Packard.Software.Engineering;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    public Employee getEmployeeById(String id){
        Optional<Employee> optionalEmployee = employeeList.stream().filter(employee -> employee.getId().equals(id)).findFirst();
        return optionalEmployee.orElse(null);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void updateEmployee(String id, Employee employee){
        for (int i=0; i< employeeList.size(); i++) {
            Employee existingEmployee = employeeList.get(i);
            if (existingEmployee.getId().equals(employeeList.get(i))){
                existingEmployee.setFirstName(employee.getFirstName());
                existingEmployee.setLastName(employee.getLastName());
                existingEmployee.setEmail(employee.getEmail());
                existingEmployee.setTitle(employee.getTitle());
                break;
            }
        }
    }

    public void deleteEmployee(String id){
        employeeList.removeIf(employee -> employee.getId().equals(id));
    }
}
