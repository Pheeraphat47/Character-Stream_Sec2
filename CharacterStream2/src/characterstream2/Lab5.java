/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream2;

import java.util.Scanner;

/**
 *
 * @author P
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your weight: ");
        double w = s.nextDouble();
        System.out.println("Enter your height: ");
        double h = s.nextDouble();
        System.out.println(w * h);
    }

}
