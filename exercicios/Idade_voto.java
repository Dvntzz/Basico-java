package exercicios;
/* Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela  
poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu). */

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
		System.out.print("A voc� tem " + resul + " anos, voc� pode votar, vai la sentir culpa pelo Brasil piorar(ou melhorar)");
		} else {
			System.out.print("Que bom voc� inda tem " + resul +" anos, voc� ainda nao pode votar, alegre-se :D");
		} 
		
		sc.close();
		
	}
	
	
	
	
}
