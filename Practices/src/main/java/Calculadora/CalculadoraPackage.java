package Calculadora;

import Division.Division;
import Multiplicacion.Multiplicacion;
import Resta.Resta;
import Suma.Suma;

import java.util.Scanner;

public class CalculadoraPackage {

    public static void main(String[] args) {
        System.out.println("Choice the operation you want: ");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        switch (scan) {
            case 1 -> {
                Suma s = new Suma();
                s.sum();
            }
            case 2 -> {
                Resta r = new Resta();
                r.res();
            }
            case 3 -> {
                Multiplicacion m = new Multiplicacion();
                m.mul();
            }
            case 4 -> {
                Division d = new Division();
                d.div();
            }
            default -> System.out.println("Invalid choice\n");
        }
    }
}
