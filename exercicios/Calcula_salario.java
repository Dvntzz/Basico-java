package exercicios;

/*Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s, 
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas 
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do 
vendedor.*/

import java.util.Scanner;

public class Calcula_salario {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Carros vendidos: ");
			int quantCarros = sc.nextInt();
			
	        System.out.print("Valor das vendas: ");
	        int vendas = sc.nextInt();
	        
	        System.out.print("Salario fixo: ");
	        int fixo = sc.nextInt();
	        
	        System.out.print("Comiss�o por carro vendido: ");
	        int valCarros = sc.nextInt();
	        
	        System.out.print("O salario final �: " + ((quantCarros*valCarros)+(vendas*5/100)+fixo) + " reais");
	        sc.close();
	        
	}

}
