package exercicios;

/* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso 
contrário escrever NÃO É MAIOR QUE 10! */

import java.util.Scanner;

public class É_maior_que_10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o numero: ");
		 int n1 = sc.nextInt();
		 
		 if(n1>10) {
			 System.out.print("É MAIOR QUE 10!");
		 } else {
			 System.out.print("NÃO É MAIOR QUE 10!");
		 } 
		 sc.close();
	} 
}

