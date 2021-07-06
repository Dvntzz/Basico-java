package exercicios;
/*Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. */
import java.util.Scanner;
public class Ordem_crescente {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int n1 = sc.nextInt();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o segundo valor: ");
		int n2 = scn.nextInt();
		
		if(n1>n2) {
			System.out.print(n2 + "\n" + n1);
		} else if(n2>n1){
			System.out.print(n1 + "\n" + n2);
		} else {
			System.out.print("Erro:os valores não podem ser iguais");
		}
		sc.close();
		scn.close();
		
	}	
}
