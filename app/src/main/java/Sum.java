/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Sum {
    
    private int number;
    
        public int sumOfNumbers(int number){
            this.number = number;
            int sum = 0;
            for(int i = 0; i <= number; i++){
                sum += i;
            }
         return sum;
    }
    
}
