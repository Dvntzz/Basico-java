package exercicios;

/*Escreva um algoritmo para ler o n�mero total de eleitores* de um munic�pio, o n�mero de votos 
brancos*, nulos* e v�lidos*. Calcular e escrever o percentual que cada um representa em rela��o ao total 
de eleitores. 
 * 
 * */

import java.util.Scanner;

public class quantidade_eleitores {

		public static void main(String[]args) {
			Scanner elei = new Scanner(System.in);
			System.out.println("Quantidade de eleitores: ");
			double eleitores = elei.nextInt();
			
			Scanner bran = new Scanner(System.in);
			System.out.println("Votos em brancos: ");
		    double branco = bran.nextInt();
			
			Scanner nul = new Scanner(System.in);
			System.out.println("Votos nulos: ");
			double nulo = nul.nextInt();
			
			Scanner val = new Scanner(System.in);
			System.out.println("votos validos: ");
			double valido = val.nextInt();
			
			System.out.println("De " + eleitores + (" eleitores"));
			System.out.println("tivemos " + branco/eleitores*100 + ("% de votos em branco") );
			System.out.println("com " + nulo/eleitores*100 + ("% de votos nulos") );
			System.out.println("e tamb�m " + valido/eleitores*100 + ("% de votos validos") );
			
			
			elei.close();
			bran.close();  
			nul.close();
			val.close();
			
			
		}
		
}
