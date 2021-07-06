package exercicios;

/*Escreva um algoritmo para ler o número total de eleitores* de um município, o número de votos 
brancos*, nulos* e válidos*. Calcular e escrever o percentual que cada um representa em relação ao total 
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
			System.out.println("e também " + valido/eleitores*100 + ("% de votos validos") );
			
			
			elei.close();
			bran.close();  
			nul.close();
			val.close();
			
			
		}
		
}
