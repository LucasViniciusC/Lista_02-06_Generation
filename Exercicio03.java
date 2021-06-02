package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int segundos, horas= 3600, minutos= 60; 
		int horasTotal, minutosTotal;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos segundos foi o evento ");
		segundos = entrada.nextInt();
		
		horasTotal = segundos / horas;
		minutosTotal = segundos / minutos;
		
		System.out.println("O evento durou " + horasTotal + " horas, " + minutosTotal + " minutos e " + segundos + " segundos.");
		entrada.close();
	}

}
