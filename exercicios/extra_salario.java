package exercicios;
/*A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais  
de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. 
Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva 
o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o m�s possua 4 semanas exatas). */

import java.util.Scanner;
public class extra_salario {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Horas trabalhadas em um m�s: ");
		int horas = sc.nextInt();
		
		System.out.print("Salario por hora: ");
		double sala = sc.nextInt();
				
		if(horas<=160) {
			double salaFinal = horas*sala;
			System.out.print("Salario final "+ salaFinal);
		} else if(horas>160) {
			double extra1 = (((horas-160)) * sala*50/100)+horas*sala;
			System.out.print("Salario final " + extra1);
		}
		sc.close();
	}
	

}
