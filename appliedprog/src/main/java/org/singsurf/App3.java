package org.singsurf;

/**
 * Hello world!
 */
public class App3 {
    String message; // Define a field 
    public App3(String txt) { // A constructor
        this.message = txt;
    }

    public void welcome(String name) { // A method
        System.out.println(message+name);
    }

    public static void main(String[] args) {
        App3 myapp = new App3("Hello "); // build the app
        myapp.welcome("Rich"); // call the method
    }
}