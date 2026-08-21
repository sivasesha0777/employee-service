package com.example.employee;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "John", "IT"));
        employees.add(new Employee(2L, "David", "HR"));
        employees.add(new Employee(3L, "Smith", "Finance"));
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        if (id == null) {
            return null;
        }
        for (Employee employee : getEmployees()) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
