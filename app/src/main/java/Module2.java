import java.util.Scanner;

public class Module2 {
    
    public static void main(String[] args){
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CHECK NUMBER");
        System.out.println("Pass the number: ");
        CheckNumber n1Obj = new CheckNumber();
        n1Obj.checkNumber(Integer.parseInt(scanner.next()));
        System.out.println("---------------"); 
        
        System.out.println("AVERAGE");
        System.out.println("Pass the first number: ");
        double num1 = Integer.parseInt(scanner.next());
        System.out.println("Pass the second number: ");
        double num2 = Integer.parseInt(scanner.next());
        System.out.println("Pass the third number: ");
        double num3 = Integer.parseInt(scanner.next());
        Average n2Obj = new Average();   
        n2Obj.averageOfThreeNumbers(num1, num2, num3);
        System.out.println("---------------"); 

        System.out.println("MINIMAL NUMBER");
        System.out.println("Pass the first number: ");
        int a = Integer.parseInt(scanner.next());
        System.out.println("Pass the second number: ");
        int b = Integer.parseInt(scanner.next());
        System.out.println("Pass the third number: ");
        int c = Integer.parseInt(scanner.next());
        System.out.println("Pass the fourth number: ");
        int d = Integer.parseInt(scanner.next());
        System.out.println("Pass the fifth number: ");
        int e = Integer.parseInt(scanner.next());
        MinNumber n3Obj = new MinNumber();
        System.out.println(n3Obj.minNumber(a,b,c,d,e));
        System.out.println("---------------"); 

        System.out.println("TRIANGLE");
        System.out.println("Pass the size: ");
        int size = Integer.parseInt(scanner.next());
        Triangle n4Obj = new Triangle();
        n4Obj.triangle(size);
        System.out.println("---------------"); 
        
        System.out.println("CHOOSEN NUMBER");
        System.out.println("Enter the number: ");
        int number1 = Integer.parseInt(scanner.next());
        NumberFromUser n5Obj = new NumberFromUser();
        n5Obj.choosenNumber(number1);
        System.out.println("---------------"); 

        System.out.println("SUM");
        System.out.println("Enter the number: ");
        int number2 = Integer.parseInt(scanner.next());
        Sum n6Obj = new Sum();
        System.out.println(n6Obj.sumOfNumbers(number2));
        System.out.println("---------------"); 
          
        System.out.println("FIBONACCI");
        System.out.println("Enter the number: ");
        int number3 = Integer.parseInt(scanner.next());
        Fibonacci n7Obj = new Fibonacci();
        n7Obj.fibonacci(number3);
        System.out.println("---------------"); 
          
        System.out.println("FACTORIAL");
        System.out.print("Enter the number: ");
        int number4 = Integer.parseInt(scanner.next());
        Factorial n8Obj = new Factorial();
        System.out.println(n8Obj.factorialCalculation(number4));
        System.out.println("---------------"); 

        System.out.println("CALCULATOR");
        Calculator calc = new Calculator();
        calc.start();
    }
    
 }
        
  
