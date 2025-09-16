package com.Meghana.assignment.employees;

public class Developer extends Employee {

    private String primaryLanguage;

    public Developer(String name, String employeeId, double salary, String primaryLanguage) {
        super(name, employeeId, salary);
        this.primaryLanguage = primaryLanguage;
    }

    public String getPrimaryLanguage() { return primaryLanguage; }
    public void setPrimaryLanguage(String primaryLanguage) { this.primaryLanguage = primaryLanguage; }

    @Override
    protected String roleLabel() {
        return "Developer";
    }
}

