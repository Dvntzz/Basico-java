package exercicios;

//Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.

import java.util.Scanner;

public class Calcula_area_retangulo {
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite a base do retangulo: ");

		int base= sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite a altura do retangulo: ");
		
		int altura= sca.nextInt();
		
		sc.close();
		sca.close();
		
		System.out.println("Essa � a area do seu retangulo: " + (base*altura));
	}
}
