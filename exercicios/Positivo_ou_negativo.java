package exercicios;
/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */

import java.util.Scanner;

public class Positivo_ou_negativo {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor: ");
    int n1 = sc.nextInt();
    
    if(n1>=0) {
    	System.out.print("Este numero é positivo ");
    } else {
    	System.out.print("Este numero é negativo ");
    }

    sc.close();
    }
}
