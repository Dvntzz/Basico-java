package exercicios;

/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor. */

import java.util.Scanner;
public class Calcula_custo_consumidor {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Custo de fabrica: ");
		int custo1 = sc.nextInt();
		
		int dis = custo1*28/100;
		int imp = custo1*45/100;
		
		System.out.print("Valor final: " + (dis + imp + custo1) + " reais");
		
		sc.close();
		
	}
}
