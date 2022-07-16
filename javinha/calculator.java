package crepusculo.java;

import java.io.InputStream;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		 int soma = soma(a, b);
		 int subtracao = subtracao(a, b);
		 int divisao = divisao(a, b);
		 int multiplicacao = multiplicacao(a, b);
		 
		 System.out.println("soma " + soma);
		 System.out.println("sub " + subtracao);
		 System.out.println("div " + divisao);
		 System.out.println("mult " + multiplicacao);
	}

	private static Readable System(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
