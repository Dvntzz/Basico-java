package explicacoes;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");

		int numero= sc.nextInt();
		
		sc.close();
		
		System.out.println("O valor digitado pela pessoa corresponde a: "+numero);
		
	}
	
	
}
 