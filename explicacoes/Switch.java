package explicacoes;
/*usar switch pra cada mes do ano uma msg para o signo*/

import java.util.Scanner;

public class Switch {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero do m�s: ");
		int num = sc.nextInt();
		
		switch(num){
		case 1:
			System.out.print("Janeiro: Capric�rnio");
		break;
		 case 2:
			System.out.print("Fevereiro: Aqu�rio");
		break;
		 case 3:
			 System.out.print("Mar�o: Peixes");
		break;
		 case 4:
			 System.out.print("Abril: �ries");
		break;
		 case 5:
			 System.out.print("Maio: Touro");
		break;
		 case 6:
			 System.out.print("Junho: G�meos");
		break;
		 case 7:
			 System.out.print("Julho: C�ncer");
		break;
		 case 8:
			 System.out.print("Agosto: Le�o");
		break;
		 case 9:
			 System.out.print("Setembro: Virgem");
		break;
		 case 10:
			 System.out.print("Outubro: Libra");
		break;
		 case 11:
			 System.out.print("Novembro: Escorpi�o");
		break;
		 case 12:
			 System.out.print("Dezembro: Sagit�rio");
		break;
		}	
		sc.close();
	}
	
}
