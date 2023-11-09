package miPrincipal;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double op1, op2;
        Calculadora c = new Calculadora();

        System.out.println("CALCULADORA BASICA");
        System.out.println("------------------");

        System.out.print("Operando 1: ");
        op1 = teclado.nextDouble();

        System.out.print("Operando 2: ");
        op2 = teclado.nextDouble();

        System.out.println("2+3="+c.suma(2, 3));
        System.out.println("Op1+Op2="+c.suma(op1, op2));

        teclado.close();
    }
}