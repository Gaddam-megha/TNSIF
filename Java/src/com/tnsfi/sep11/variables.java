package com.tnsfi.sep11;

public class variables {
	static int globalCount = 100;
    String name = "Java";

    public void showVariables() {
        int localNumber = 50;

        System.out.println("Local variable: " + localNumber);
        System.out.println("Instance variable: " + name);
        System.out.println("Global (static) variable: " + globalCount);
    }

    public static void main(String[] args) {
        variables obj = new variables();
        obj.showVariables();
    }

}
