package com.Meghana.assignment.employees;

	public class Employee {

	    private String name;
	    private String employeeId;
	    private double salary;

	    public Employee(String name, String employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    /** Public getters/setters — accessible from any package */
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getEmployeeId() { return employeeId; }
	    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }

	    /** Protected: visible to subclasses and same-package classes */
	    protected String roleLabel() {
	        return "Employee";
	    }

	    /** Package-private: ONLY visible within com.tejaswini.assignment.employees */
	    String internalCode() {
	        return employeeId + "-INT";
	    }

	    @Override
	    public String toString() {
	        return roleLabel() + " {name='" + name + "', id='" + employeeId + "', salary=" + salary + "}";
	    }
	}



