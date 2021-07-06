package exercicios;
/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais  
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas). */

import java.util.Scanner;
public class extra_salario {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Horas trabalhadas em um mês: ");
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
