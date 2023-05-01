/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null) {
                System.out.print(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
