import java.util.Scanner;

public class Module2 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pass the number: ");
//        int number = Integer.parseInt(scanner.next());
//        checkNumber(number);
//      
//        System.out.println("Pass the first number: ");
//        double num1 = Integer.parseInt(scanner.next());
//        System.out.println("Pass the second number: ");
//        double num2 = Integer.parseInt(scanner.next());
//        System.out.println("Pass the third number: ");
//        double num3 = Integer.parseInt(scanner.next());
//        averageOfThreeNumbers(num1, num2, num3);
        
//        System.out.println("Pass the first number: ");
//        int a = Integer.parseInt(scanner.next());
//        System.out.println("Pass the second number: ");
//        int b = Integer.parseInt(scanner.next());
//        System.out.println("Pass the third number: ");
//        int c = Integer.parseInt(scanner.next());
//        System.out.println("Pass the fourth number: ");
//        int d = Integer.parseInt(scanner.next());
//        System.out.println("Pass the fifth number: ");
//        int e = Integer.parseInt(scanner.next());
//        System.out.println(minNumber(a,b,c,d,e));

//          System.out.println("Pass the size: ");
//          int size = Integer.parseInt(scanner.next());
//          triangle(size);
//          System.out.println("Enter the number: ");
//          int number = Integer.parseInt(scanner.next());
//          choosenNumber(number);

//          System.out.println("Enter the number: ");
//          int number = Integer.parseInt(scanner.next());
//          System.out.println(sumOfNumbers(number));
          
//          System.out.print("Enter the number: ");
//          int number = Integer.parseInt(scanner.next());
//          fibonacci(number);
//          
          System.out.print("Enter the number: ");
          int number = Integer.parseInt(scanner.next());
          System.out.println(factorialCalculation(number));
    }
    
    public static void checkNumber(int number){
        if(number > 0){
             System.out.println("Positive");
          } else {
            System.out.println("Negative");
        }
    }
    
    public static void averageOfThreeNumbers(double num1, double num2, double num3){
        if(num1 > 0 && num2 > 0 && num3 >0){
            double sum = (num1 + num2 + num3) / 3;
            System.out.println(sum);
        } else {
            System.out.println("Invalid Value");
        }
    }
       
    public static int minNumber(int a, int b, int c, int d, int e){
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
    
    public static void triangle(int size){
        if( size > 0){
            for(int i = 1; i <= size; i++){
                for( int j = i; j>=1; j--){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
    
    public static void choosenNumber(int number){
        if(number >= 0){
            for(int i =0; i <= number; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid Number");
        }
    }
     
    public static int sumOfNumbers(int number){
        int sum = 0;
        for(int i = 0; i <= number; i++){
            sum += i;
        }
        return sum;
    }
    
    public static void fibonacci(int number){
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
    
    public static int factorialCalculation(int number){
        int counter = 1;
        int factorial = 1;
        while(counter <= number){
            factorial *= counter;
            counter++;
        }
        return factorial;
    }
    
    }
        
  
