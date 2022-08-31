package Suma;

import java.util.Scanner;

public class Suma {

    double result;

    public void sum() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        double x = scanner.nextDouble();

        System.out.println("Input the second number:");
        double y = scanner.nextDouble();

        result = x + y;
        System.out.println("Result is: " + result);
    }


}
