/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author BRIONES_CpE121
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Labor ins = new Labor();
         int input = 15;
         if (input < 0) {
             System.out.println("Invalid number, enter a positive integer only!");   
         }
         else {
             
             ins.calculateFac(input);
             ins.displayResult();
         }
    }
    
}
