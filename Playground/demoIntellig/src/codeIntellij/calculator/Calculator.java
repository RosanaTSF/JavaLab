package codeIntellij.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

    int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nexInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nexInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);
    }


    public static int somar(int a, int b) {
        return a + b;
    }public static int subtrair(int a, int b) {
        return a - b;
    }public static int multiplicar(int a, int b) {
        return a * b;
    }public static int dividir(int a, int b) {
        return a / b;
    }

}
