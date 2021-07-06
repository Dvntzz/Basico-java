package exercicios;
/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */

import java.util.Scanner;
public class Qual_o_maior {

	public static void main(String[]args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int n1 = sc.nextInt();
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o segundo valor: ");
		int n2 = scn.nextInt();
		
		if(n1 > n2) {
		System.out.print("o maior valor é: "+n1);
		} else {
			System.out.print("o maior valor é: "+n2);
		}
		
		sc.close();
		scn.close();
		
	}
	
	
}
