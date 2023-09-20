import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private String sign;
    private boolean decision = true;
    private String quit;
    Scanner scanner = new Scanner(System.in);
    
    public void start() {
        this.a = a;
        this.b = b;
        this.sign = sign;
        this.decision = decision;
        this.quit = quit;
        
        while(decision){
           
            System.out.println("Pass the first number: ");
            a = getNumberFromUser(Double.parseDouble(scanner.next()));
            System.out.println("Pass the second number: ");
            b = getNumberFromUser(Double.parseDouble(scanner.next()));
            System.out.println("What do you want to do? Choose the sign: + | - | * | / ");
            sign = getOperationFromUser(scanner.next());
        
        checkOperationFromUser(sign);
      
            System.out.println("Do you want calculate? Write: yes or no ");
            quit = scanner.next();
            if("no".equals(quit)){
            System.out.println("Thanks for use our app");
            return;
           } 
        }
  }
  
  private String getOperationFromUser(String sign) {
    return sign;
  }
  
  private void checkOperationFromUser(String sign){
      
      while(!"+".equals(sign) || !"-".equals(sign) || !"*".equals(sign) || !"/".equals(sign)){
          System.out.println("Pass the correct sign: + | - | * | /");
            sign = getOperationFromUser(scanner.next());
            if("+".equals(sign)){
                System.out.println(add(a, b));
                return;
            } else if("-".equals(sign)){
                System.out.println(subtract(a, b));
                return;
            } else if("*".equals(sign)){
                System.out.println(multiply(a, b));
                return;
            } else if("/".equals(sign)){
                if(!isMoreThan0(b)){
                    System.out.println("It's not possible to divide to 0.");
                } else {
                    System.out.println(divide(a,b));
                    return;
                }
             }
       }  
  }
      
  
  
  private double getNumberFromUser(double a) {
    return a;
  }
  
  private boolean isMoreThan0(double b) {
      if(b > 0){
          return true;
      } else {
          return false;
      }
  }
  
  private double add(double a, double b) {
    return a + b;
  }
  
  private double subtract(double a, double b) {
    return a - b;
  }
  
  private double divide(double a, double b) {
    return a / b;
  }
  
  private double multiply(double a, double b) {
    return a * b;
  }

    
}
