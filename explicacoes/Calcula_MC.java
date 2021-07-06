package explicacoes;

import java.util.Scanner;
public class Calcula_MC {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Altura: ");
		int alt = sc.nextInt(); 
		System.out.print("Peso: ");
		int peso = sc.nextInt();
		
		int imc = peso / (alt*alt);
		System.out.print("Seu IMC é: "+ imc);
		
		
		sc.close();
	}
}
