package com.balachandar.assignment.utilites;
import com.balachandar.assignment.employees.*;
import com.balachandar.assignment.utilites.*;

/**
 * Main class for demonstrating Employee functionality.
 */
public class AssignmentMain {

    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("Alice", 101, 90000.0, "Sales");
        Developer developer = new Developer("Bob", 102, 80000.0, "Java");

        // Create an instance of EmployeeUtilities
        EmployeeUtilities utilities = new EmployeeUtilities();

        // Print details of Manager and Developer
        System.out.println("Manager Details:");
        utilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        utilities.printEmployeeDetails(developer);

        // Update salaries
        System.out.println("\nUpdating Salaries:");
        utilities.updateSalary(manager, 95000.0);
        utilities.updateSalary(developer, 85000.0);

        // Check bonus eligibility
        System.out.println("\nBonus Eligibility:");
        boolean isManagerEligible = utilities.isEligibleForBonus(manager, 85000.0);
        System.out.println("Manager eligible for bonus: " + isManagerEligible);

        boolean isDeveloperEligible = utilities.isEligibleForBonus(developer, 85000.0);
        System.out.println("Developer eligible for bonus: " + isDeveloperEligible);
    }
}
