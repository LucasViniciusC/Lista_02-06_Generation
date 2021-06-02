package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double n1, n2, n3, p1, p2, p3, media;

		System.out.println("====Calculo de média:====\n");

		System.out.println("Informe a primiera nota: ");
		n1 = entrada.nextDouble();

		System.out.println("Informe o peso: ");
		p1 = entrada.nextDouble();

		System.out.println("Informe a segunda nota: ");
		n2 = entrada.nextDouble();

		System.out.println("Informe o segunda peso: ");
		p2 = entrada.nextDouble();

		System.out.println("Informe a terceira nota: ");
		n3 = entrada.nextDouble();

		System.out.println("Informe o terceiro peso: ");
		p3 = entrada.nextDouble();

		media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

		System.out.println("Sua média é de: " + media);

		if (media >= 7) {
			System.out.println("\nVocê foi aprovado");
		} else {
			System.out.println("\nVocê está de recuperação");
		}
		entrada.close();
	}

}
