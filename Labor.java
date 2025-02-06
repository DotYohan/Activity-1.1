/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialcalculator;

/**
 *
 * @author BRIONES_CpE121
 */
public class Labor {
    private int nonneg;
    
    public static long Factorial(int n){
    long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
