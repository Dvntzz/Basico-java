package exercicios;

import java.util.Scanner;

//Escreva um algoritmo para ler as dimens�es de um tri�ngulo, calcular e escrever a �rea do tri�ngulo (b*h/2).

public class Calcula_area_triangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a seguir a base do tri�ngulo: ");
		
		int b = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite agora a altura do seu tri�ngulo: ");
		
		int h = sca.nextInt();
		
		System.out.println("Este � a �rea do tri�gulo: ");
		
		System.out.println("o a �rea do tringulo �: " + (b*h)/2);
		
		sc.close();
		sca.close();
	}
	
	
	
}
