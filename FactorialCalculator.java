
package factorialcalculator;

import java.util.Scanner;
/**
 *
 * @author BRIONES_CpE121
 */
public class FactorialCalculator {

    static void main(String[] args) {
        Labor ins = new Labor();
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number:");
         int n = scan.nextInt();
         if (n < 0) {
             System.out.println("Invalid number, enter a positive integer only!");   
         }
         else {
             ins.displayResult();
         }
         
    }

    
}
