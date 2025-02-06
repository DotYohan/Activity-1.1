
package factorialcalculator;



/**
 *
 * @author BRIONES_CpE121
 */
public class FactorialCalculator {

    /**
     * @param args the command line arguments
     */
    static void main(String[] args) {
        Labor ins = new Labor();

        System.out.print("Enter a number to calculate its factorial: ");
        int number = 2;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + ins.Factorial(number));
        }
    }

    
}
