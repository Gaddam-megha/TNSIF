package com.Meghana.assignment.utilities;
import com.Meghana.assignment.employees.Employee;

public final class EmployeeUtilities {
	private EmployeeUtilities() {} // prevent instantiation

    /** Print a one-line public summary using only public API. */
    public static String summary(Employee e) {
        return e.toString(); // uses public toString() which uses protected roleLabel via override
    }

    /** Public method to apply a percentage raise. */
    public static void giveRaise(Employee e, double percent) {
        if (percent <= -100.0) {
            throw new IllegalArgumentException("Percent cannot reduce salary below zero");
        }
        double newSalary = e.getSalary() * (1 + percent / 100.0);
        e.setSalary(newSalary);
    }

    /** Determine if employee is a high earner using only public getter. */
    public static boolean isHighEarner(Employee e, double threshold) {
        return e.getSalary() >= threshold;
    }
}


