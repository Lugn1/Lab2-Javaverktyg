package com.example;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class EmployeesTest {

    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    BankService bankService = Mockito.mock(BankService.class);
    Employees employees = new Employees(employeeRepository, bankService);

    Employee employee = new Employee("1", 30_000);
    Employee employee2 = new Employee("2", 45_000);

    @BeforeEach
    void initialize() {
        employeeRepository.save(employee);
        employeeRepository.save(employee2);
    }

    @Test
    void payEmployeeShouldReturnTrue() {
        employees.payEmployees();
        assertTrue(employee2.isPaid());
    }

    @Test
    void payEmployeeShouldReturnFalse() {
        assertFalse(employee2.isPaid());
    }

    @Test
    void payEmployeesShouldReturnTwo() {
        assertThat(employees.payEmployees()).isEqualTo(2);

    }

    @Test
    void ifRuntimeExceptionOccursDuringPaymentCatchErrorAndEmployeeShouldNotBePaid(){
        Mockito.doThrow(RuntimeException.class).when(bankService).pay(employee.getId(), employee.getSalary());
        employees.payEmployees();
        assertFalse(employee.isPaid());

    }

}