package exercicios;

/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem 
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o custo total da compra.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calcula_valor_maçãs {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0");
		  System.out.print("quantas maças foram comprada: ");
		  int n1 = sc.nextInt();
		  formatador.format(n1);
		  
		  
		  if(n1>12) {
			System.out.print("Total: " + (formatador.format(n1*1)) + " reais");
			
		  } else {
			  System.out.print("Total: " + (formatador.format(n1*1.30)) + " real(is)");
		  }
		  
		  
		  
		  
		  sc.close();
		  
		 
	}

}
