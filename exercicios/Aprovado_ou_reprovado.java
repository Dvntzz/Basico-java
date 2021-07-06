package exercicios;
/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
aluno é aprovado). Escrever também a média calculada.   */ 

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aprovado_ou_reprovado {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	DecimalFormat formatador = new DecimalFormat("0");
	System.out.print("nota 1a: ");
	double n1 = sc.nextInt();
	
	System.out.print("nota 2a: ");
	double n2 = sc.nextInt();
	double media = ( (n1+n2) /2);
	
	if(media>=6) {
	System.out.print("Você foi aprovado, parabens! pelo " + (formatador.format(media)) );
	} else {
		System.out.print("Você foi reprovado, sua nota foi " + (formatador.format(media)) );
	}
	
	sc.close();
	
	
	}

}
