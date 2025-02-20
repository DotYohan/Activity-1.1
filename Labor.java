/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

/**
 *
 * @author BRIONES_CpE121
 */
public class Labor {

    private int n;
    private int nn;

    public Labor() {
        this.n = 0;
        this.nn = 0;
    }

    public void calculateFac(int input) {
        nn = input;
        for (int i = 1; i < input; i++) {
            System.out.println("i value; " + i);
            input *= i;
            n = input;
        }
       System.out.println("The factorial of " + nn + "is " + n);
    }

    public void displayResult() {
        System.out.println("The factorial of " + nn + "is " + n);
        System.out.println("n value: " + n);
        System.out.println("nn value: " + nn);
    }
}
