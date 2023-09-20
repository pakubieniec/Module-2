
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Average {
    
    private double num1;
    private double num2;
    private double num3;
    
    public void averageOfThreeNumbers(double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        if(num1 > 0 && num2 > 0 && num3 >0){
            double sum = (num1 + num2 + num3) / 3;
            System.out.println("The Average of three numbers: " + sum);
        } else {
            System.out.println("Invalid Value. Your number must be greater then 0.");
        }
    }
 }
    

