package com.Hewlett.Packard.Software.Engineering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@GetMapping("/employees")
public class EmployeeController {
    public EmployeeService getEmployees(){
        return getEmployees();
    }
}
