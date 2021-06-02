package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, d, e, f, x, y;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o 1º número: ");
		a = entrada.nextDouble();
		System.out.println("Informe o 2º número: ");
		b = entrada.nextDouble();
		System.out.println("Informe o 3º número: ");
		c = entrada.nextDouble();
		System.out.println("Informe o 4º número: ");
		d = entrada.nextDouble();
		System.out.println("Informe o 5º número: ");
		e = entrada.nextDouble();
		System.out.println("Informe o 6º número: ");
		f = entrada.nextDouble();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);

		entrada.close();
	}
}
