package exercicios;

import java.util.Scanner;

//Escreva um algoritmo para ler as dimensões de um triângulo, calcular e escrever a área do triângulo (b*h/2).

public class Calcula_area_triangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a seguir a base do triângulo: ");
		
		int b = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite agora a altura do seu triângulo: ");
		
		int h = sca.nextInt();
		
		System.out.println("Este é a área do triâgulo: ");
		
		System.out.println("o a ârea do tringulo é: " + (b*h)/2);
		
		sc.close();
		sca.close();
	}
	
	
	
}
