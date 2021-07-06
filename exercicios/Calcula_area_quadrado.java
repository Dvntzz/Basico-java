package exercicios;

import java.util.Scanner;

// Escreva um algoritmo para ler as dimensões de um quadrado, calcular e escrever a área do quadrado.

public class Calcula_area_quadrado {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a altura do quadrado: ");
		
		int h = sc.nextInt();
		
		int resultado = (h*h);
		
		System.out.println("Esta é a ârea do quadrado: " + resultado + ("cm2"));
		
		sc.close();
	
	}
	

}
