package exercicios;

/* Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso 
contr�rio escrever N�O � MAIOR QUE 10! */

import java.util.Scanner;

public class �_maior_que_10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o numero: ");
		 int n1 = sc.nextInt();
		 
		 if(n1>10) {
			 System.out.print("� MAIOR QUE 10!");
		 } else {
			 System.out.print("N�O � MAIOR QUE 10!");
		 } 
		 sc.close();
	} 
}

