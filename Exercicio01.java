package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, meses, dias, anos = 365, diasMes = 30;
		int diasAno, totalDias;
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe quantos anos: ");
		idade = leia.nextInt();

		System.out.println("Informe quantos meses: ");
		meses = leia.nextInt();
		
		System.out.println("Informe quantos dias: ");
		dias = leia.nextInt(); 
		
		
		diasAno = idade * anos;
		diasMes = diasMes * meses;
		
		totalDias = diasAno + diasMes + dias;

		System.out.println("O seu total de dias vividos é de " + totalDias);
		
		leia.close();
	}

}
