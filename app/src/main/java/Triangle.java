/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Triangle {
    
    private int size;
    
    public void triangle(int size){
        this.size = size;
        if( size > 0){
            for(int i = 1; i <= size; i++){
                for( int j = i; j>=1; j--){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Invalid number. Your number must be greater than 0.");
        }
    }
}
