/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo.consoleDemo;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author phanthivy
 */
public class ConsoleDemo {

    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }
}
