import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter First Operand.");
        int a = sc.nextInt();
      
        System.out.println("Enter Operator.");
        String op = sc.next();
      
        System.out.println("Enter Second Operand.");
        int b = sc.nextInt();
      
        int result;
      
        switch(op) {
            case "+":
                result = a + b;
                System.out.println(a + " + " + b + " = " + result + " .");
                break;
            
            case "-":
                result = a - b;
                System.out.println(a + " - " + b + " = " + result + " .");
                break;
            
            case "*":
                result = a * b;
                System.out.println(a + " * " + b + " = " + result + " .");
                break;
            
            case "/":
                if(b != 0) {
                result = (a / b);
                System.out.println(a + " / " + b + " = " + result + " .");
                }
                else
                    System.out.println("Error: Cannot divide by zero.");
                break;
            
            case "%":
                result = a % b;
                System.out.println(a + " % " + b + " = " + result + " .");
                break;
            
            default:
                System.out.println("Enter operators only (+ , - , * , / , %)");
        }
        sc.close();
    }
}
