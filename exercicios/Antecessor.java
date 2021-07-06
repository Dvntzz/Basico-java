package exercicios;

//escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

import java.util.Scanner;

public class Antecessor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero= sc.nextInt();
		
		sc.close();
		
		System.out.println("Esse é o antecessor do numero digitado: "+( numero - 1));
	}
	
}
