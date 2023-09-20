/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Fibonacci {
    private int number;
    
      public void fibonacci(int number){
        this.number = number;
        int counter = 0;
        int x = 0;
        int y = 1;
        while(counter <= number ){
            System.out.print(x + " ");
            int z = x + y;
            x= y;
            y = z;
            counter++;
        }
       //0, 1, 1, 2, 3, 5, 8, 13, 21
    }
    
}
