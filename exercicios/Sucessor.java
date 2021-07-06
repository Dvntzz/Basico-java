package exercicios;

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu suecessor.

import java.util.Scanner; 

public class Sucessor {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui seu numero: ");
		
		int numero= sc.nextInt();
		
		sc.close();
		
		System.out.println("O antecessor o seu numero é: " +(++numero));
	}
		

}
