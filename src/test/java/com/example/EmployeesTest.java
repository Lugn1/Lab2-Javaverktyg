package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class EmployeesTest {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    BankService bankService = Mockito.mock(BankService.class);
    Employees employees = new Employees(employeeRepository, bankService);

    @Test
    void payEmployees() {

    }




}