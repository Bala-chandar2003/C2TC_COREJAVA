package com.balachandar.assignment.employees;

public class Employee {

    // Private attributes
    private String name;
    private int employeeId;
    private double salary;

    /**
     * Default constructor for Employee class.
     */
    public Employee() {
        this.name = "";
        this.employeeId = 0;
        this.salary = 0.0;
    }

    /**
     * Parameterized constructor for Employee class.
     *
     * @param name       The employee's name.
     * @param employeeId The employee's ID.
     * @param salary     The employee's salary.
     */
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter and setter methods (same as before)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


