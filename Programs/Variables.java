package com.GithubFiles;



public class Variables {

	 // Instance variable (belongs to each object)
    int a = 1;

    // Static variable (shared by all objects)
    static int b = 10;

    public static void main(String[] args) {

        // Local variable (exists only inside the method)
        int c = 30;

        // Creating an object of Demo class
        Variables d1 = new Variables();

        // Accessing static variable using class name
        System.out.println(Variables.b);

        // Accessing instance variable using object reference
        System.out.println(d1.a);

        // Accessing local variable directly
        System.out.println(c);
    }
}
