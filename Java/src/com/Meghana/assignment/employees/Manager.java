package com.Meghana.assignment.employees;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, String employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    /** Override protected label from base class */
    @Override
    protected String roleLabel() {
        return "Manager";
    }
}

