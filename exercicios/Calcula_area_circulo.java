package exercicios;

//Escreva um programa para ler o raio de um c�rculo, calcular e escrever a sua �rea. (pR2)

import java.util.Scanner;

public class Calcula_area_circulo {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui o valor do diametro da circuferencia: ");
		
		int d = sc.nextInt();
		
		sc.close();
		
		System.out.println("Esse � o valor do raio: " + (d/2) + ("cm"));
	}

}
