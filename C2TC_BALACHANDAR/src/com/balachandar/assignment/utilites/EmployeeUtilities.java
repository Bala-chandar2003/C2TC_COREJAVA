package com.balachandar.assignment.utilites;

import com.balachandar.assignment.employees.*;

/**
 * Utility class for handling Employee-related operations.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an Employee.
     *
     * @param employee The Employee object to print details for.
     */
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
        if (employee instanceof Manager) {
            System.out.println("Department: " + ((Manager) employee).getDepartment());
        } else if (employee instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
        }
    }

    /**
     * Updates the salary of an Employee.
     *
     * @param employee The Employee object to update.
     * @param newSalary The new salary to set.
     */
    public void updateSalary(Employee employee, double newSalary) {
        employee.setSalary(newSalary);
        System.out.println("Updated salary for " + employee.getName() + " to " + newSalary);
    }

    /**
     * Checks if an Employee is eligible for a bonus based on a minimum salary.
     *
     * @param employee The Employee object to check.
     * @param minSalary The minimum salary to be eligible for a bonus.
     * @return true if eligible, false otherwise.
     */
    public boolean isEligibleForBonus(Employee employee, double minSalary) {
        return employee.getSalary() > minSalary;
    }
}
