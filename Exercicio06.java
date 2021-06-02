package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		double x1, x2, y1, y2;
		double d,raiz;

		System.out.println("Digite o valor de x no 1º Pontos: ");
		x1 = entrada.nextDouble();
		System.out.println("Digite o valor de x no 1º Pontos: ");
		y1 = entrada.nextDouble();

		
		System.out.println("Digite o valor de x no 2º Pontos: ");
		x2 = entrada.nextDouble();
		System.out.println("Digite o valor de x no 2º Pontos: ");
		y2 = entrada.nextDouble();
		
		d = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
		raiz = Math.sqrt(d);
		
		System.out.println("Potência de X e Y: " + d);
		System.out.println("Raiz de X e Y: " + raiz);
		
		entrada.close();
	}

}
