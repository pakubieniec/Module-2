/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Factorial {
    
    private int number;
    
      public int factorialCalculation(int number){
        this.number = number;
        int counter = 1;
        int factorial = 1;
        while(counter <= number){
            factorial *= counter;
            counter++;
        }
        return factorial;
    }
    
}
