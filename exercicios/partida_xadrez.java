package exercicios;

/* Ler a hora de in�cio e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os  
minutos) e calcule a dura��o do jogo em horas, sabendo-se que o tempo m�ximo de dura��o do jogo � 
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

import java.util.Scanner;

public class partida_xadrez {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hora de inic�o: ");
		int inicio = sc.nextInt();
		
		System.out.print("Hora de t�rmino: ");
		int term = sc.nextInt(); 
		
		if(term>inicio) {
		System.out.print("O jogo durou " + (term-inicio) +" horas");
		} else if(inicio>term) {
			System.out.print("O jogo durou "+ ((24-inicio)+term)+" horas");
		} else {
			System.out.print("erro");
		}
		
		sc.close();
	} 
	

}
