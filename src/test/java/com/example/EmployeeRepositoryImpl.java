package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    List<Employee> employeesArray = new ArrayList<>();


    @Override
    public List<Employee> findAll() {
        return employeesArray;
    }

    @Override
    public Employee save(Employee e) {
        employeesArray.add(e);
        return e;
    }
}
