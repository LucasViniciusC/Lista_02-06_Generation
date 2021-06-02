package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica,  custoConsumidor, distribuidor;
		
		System.out.println("Informe o custo do carro: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica * 0.28);
		custoConsumidor = distribuidor + (distribuidor * 0.45);
		
		System.out.println("O custo final é de: " + custoConsumidor);
		
		leia.close();
	}

}
