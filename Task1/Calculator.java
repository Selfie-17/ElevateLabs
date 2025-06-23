package ElevateLabs.Task1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float result = 0;
        Calculator calculator = new Calculator();
        int choice = 0;
        do{
            printOptions();
            choice = sc.nextInt();
            
            if(choice == 0) {
                System.out.println("Exiting...");
                break;
            }
            
            System.out.print("Enter first number: ");
            float num1 = sc.nextFloat();
            System.out.print("Enter second number: ");
            float num2 = sc.nextFloat();
            
            switch(choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    try {
                        result = calculator.divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");

                    continue;
            }
            
            System.out.println("Result: " + result);
        }
        while(choice!=0);
        
        sc.close();
        System.out.println("Calculator closed.");
    }
    float add(float a , float b){
        return  a+b;
    }
    float subtract(float a , float b){
        return a-b;
    }
    float multiply(float a , float b){
        return a*b;
    }

    float divide(float a , float b){
        if(b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a/b;
    }
    static void printOptions(){
        System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
    }
}
