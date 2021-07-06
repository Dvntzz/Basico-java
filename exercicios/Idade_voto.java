package exercicios;
/* Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela  
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). */

import java.util.Scanner;


public class Idade_voto {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Em que ano estamos?: ");
		int anoat = sc.nextInt();
		
		System.out.print("Digite o seu ano de nascimento: ");
		int ano = sc.nextInt();
		int resul = (anoat-ano);
		
		if(resul>=18) {
		System.out.print("A você tem " + resul + " anos, você pode votar, vai la sentir culpa pelo Brasil piorar(ou melhorar)");
		} else {
			System.out.print("Que bom você inda tem " + resul +" anos, você ainda nao pode votar, alegre-se :D");
		} 
		
		sc.close();
		
	}
	
	
	
	
}
