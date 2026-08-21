package com.example.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private final EmployeeService employeeService = new EmployeeService();

    @Test
    void shouldReturnEmployee() {
        Employee employee = employeeService.getEmployeeById(1L);
        assertNotNull(employee);
        assertEquals("John", employee.getName());
    }

    @Test
    void shouldReturnNullForUnknownEmployee() {
        Employee employee = employeeService.getEmployeeById(999L);
        assertNull(employee);
    }
}
