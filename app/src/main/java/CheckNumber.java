/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class CheckNumber {
    
    private int number;
    
    public void checkNumber(int number){
        this.number = number;
        if(number > 0){
             System.out.println("Positive");
          } else {
            System.out.println("Negative");
        }
    }
    
}
