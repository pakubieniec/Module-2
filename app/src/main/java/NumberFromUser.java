/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class NumberFromUser {
    
    private int number;
    
    public void choosenNumber(int number){
        this.number = number;
        if(number >= 0){
            for(int i =0; i <= number; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid Number. Your number must be greater or equal 0.");
        }
    }  
}
