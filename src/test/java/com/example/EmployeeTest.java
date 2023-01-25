package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employeeDummy = new Employee("1", 100_000);

    @Test
    void getEmployeeID() {
        assertEquals("1", employeeDummy.getId());
    }

    @Test
    void setEmployeeId() {
        employeeDummy.setId("2");
        assertEquals("2", employeeDummy.getId());
    }

    @Test
    void getEmployeeSalaryWithGetSalaryGetter() {
        assertEquals(100_000, employeeDummy.getSalary());
    }

    @Test
    void setNewSalaryWithEmployeeSetSalarySetter() {
        employeeDummy.setSalary(150_000);
        assertEquals(150_000, employeeDummy.getSalary());
    }

    @Test
    void setEmployeeToTrueAndGetIsPaidToTestBothIsPaidSetterAndGetter() {
         employeeDummy.setPaid(true);
         assertTrue(employeeDummy.isPaid());
    }


    @Test
    void testEmployeeToStringMethod() {
        assertEquals("Employee [id=1, salary=100000.0]", employeeDummy.toString());
    }


}