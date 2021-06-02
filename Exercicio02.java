package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int dias, anosVividos = 0, mesesVividos = 0, diasAno = 365, diasMes = 30;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos dias que você já viveu: ");
		dias  = entrada.nextInt();
		
		
		anosVividos = dias / diasAno;
		mesesVividos = dias / diasMes;
		
		System.out.println("Você já viveu: " + anosVividos + " anos de vida, " + mesesVividos + " meses e " + dias + " dias.");
		
		entrada.close();
	}
}
