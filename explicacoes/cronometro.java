package explicacoes;


import java.util.Scanner;
public class cronometro {
	public static void main(String[]args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tempo: ");
		int time = sc.nextInt();
		
		for(int i=0;i<=time;i++) {
		System.out.println(i);	
		Thread.sleep(1000);
	} 
		sc.close();
}
}