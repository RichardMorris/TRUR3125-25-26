package org.singsurf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public class App2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        try {
            System.out.println("Enter your name");
            String name = br.readLine();
            System.out.println("Hello "+name);
        } catch(IOException ex) {
            System.err.println("Error "+ ex.toString());
        }
    }
}