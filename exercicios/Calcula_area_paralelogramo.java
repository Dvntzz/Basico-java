package exercicios;

import java.util.Scanner;

// Escreva um algoritmo para ler as dimens�es de um paralelogramo, calcular e escrever a �rea do paralelogramo.

public class Calcula_area_paralelogramo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a baixo do valor da base do paralelogramo: ");
		
		int b = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Agora digite o valor da altura do paralelogramo: ");
		
		int h = sca.nextInt();
		
		System.out.println("Essa � a �rea do paralelogramo: " + (b*h)+("cm�"));
		
		sc.close();
		sca.close();
			
	}
	
}
