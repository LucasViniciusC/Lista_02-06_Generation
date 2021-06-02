package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		int d, r, s;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe A: ");
		a = entrada.nextInt();

		System.out.println("Informe B: ");
		b = entrada.nextInt();

		System.out.println("Infome C: ");
		c = entrada.nextInt();

		r = (a + b) * (a +b);
		s = (b + c) * (b + c);

		d = (r + s) / 2;
		
		System.out.println("O resultado da expressão é: " + d);
		
		entrada.close();
	}

}
