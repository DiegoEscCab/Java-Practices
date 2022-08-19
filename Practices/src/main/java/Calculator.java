import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double a;
        double b;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        a = scanner.nextDouble();

        System.out.println("Input the second number:");
        b = scanner.nextDouble();

        System.out.println("Input the operator + - * /:");
        operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                result = a + b;
                System.out.println("The result is equal to " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("The result is equal to " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("The result is equal to " + result);
                break;
            case '/':
                result = a / b;
                System.out.println("The result is equal to " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

}
