package exercicios;

/* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
Calcular e escrever o valor do novo salário.*/

import java.util.Scanner;

public class Salario_e_percentual {
    
	public static void main(String[]args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("O valor atual do salario: ");
		double salario = sc.nextInt();
		System.out.print("O valor do reajuste: ");
		double reajuste = sc.nextInt();
		
		System.out.print("com o reajuste o salario ficará: " + (salario*reajuste/100+salario) + " reais");
		
		sc.close();
	}
	
	
	
}
