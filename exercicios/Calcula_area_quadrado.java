package exercicios;

import java.util.Scanner;

// Escreva um algoritmo para ler as dimens�es de um quadrado, calcular e escrever a �rea do quadrado.

public class Calcula_area_quadrado {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a altura do quadrado: ");
		
		int h = sc.nextInt();
		
		int resultado = (h*h);
		
		System.out.println("Esta � a �rea do quadrado: " + resultado + ("cm2"));
		
		sc.close();
	
	}
	

}
