/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class MinNumber {
    
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    
    public int minNumber(int a, int b, int c, int d, int e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        
      if(a < b && a < c && a < d && a < e){
          return a;
      } else if( b < a && b < c && b < d && b < e){
          return b;
      } else if( c < a && c < b && c < d && c < e){
            return c;
      } else if( d < a && d < b && d < c && d < e){
            return d;
      } else if( e < a && e < b && e < c && e < d){
            return e;
      } 
     return -1;
    }
    
}
