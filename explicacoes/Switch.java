package explicacoes;
/*usar switch pra cada mes do ano uma msg para o signo*/

import java.util.Scanner;

public class Switch {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero do mês: ");
		int num = sc.nextInt();
		
		switch(num){
		case 1:
			System.out.print("Janeiro: Capricórnio");
		break;
		 case 2:
			System.out.print("Fevereiro: Aquário");
		break;
		 case 3:
			 System.out.print("Março: Peixes");
		break;
		 case 4:
			 System.out.print("Abril: Áries");
		break;
		 case 5:
			 System.out.print("Maio: Touro");
		break;
		 case 6:
			 System.out.print("Junho: Gêmeos");
		break;
		 case 7:
			 System.out.print("Julho: Câncer");
		break;
		 case 8:
			 System.out.print("Agosto: Leão");
		break;
		 case 9:
			 System.out.print("Setembro: Virgem");
		break;
		 case 10:
			 System.out.print("Outubro: Libra");
		break;
		 case 11:
			 System.out.print("Novembro: Escorpião");
		break;
		 case 12:
			 System.out.print("Dezembro: Sagitário");
		break;
		}	
		sc.close();
	}
	
}
