package exercicios;

//fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
//a idade dessa pessoa expressa em dias, considerar ano com 365 dias e m�s comm 30 dias.

import java.util.Scanner;

public class Dias_de_vida {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos anos voc� tem: ");
		int anos = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite quantos quantos meses se passaram desde seu ultimo aniversario(sem contar no qual voc� est�): ");
		int meses = sca.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia do mes em que voc� est�: ");
		int dias = scan.nextInt();
		
		System.out.println("Voc� j� viveu " + (((anos*365) + (meses*30)) + dias) + (" dias"));
		
		sc.close();
		sca.close();
		scan.close();
		
		
		
	}
	
		
}
