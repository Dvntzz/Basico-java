package exercicios;
/* Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever 
uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o 
aluno � aprovado). Escrever tamb�m a m�dia calculada.   */ 

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
	System.out.print("Voc� foi aprovado, parabens! pelo " + (formatador.format(media)) );
	} else {
		System.out.print("Voc� foi reprovado, sua nota foi " + (formatador.format(media)) );
	}
	
	sc.close();
	
	
	}

}
