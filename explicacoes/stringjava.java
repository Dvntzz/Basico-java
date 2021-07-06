package explicacoes;
public class stringjava {
public static void main(String[]args) {
	/*Scanner sc = new Scanner(System.in);
	System.out.print("Digite o seu nome: ");
	*/


	//=================================================================================================
	//length() resulta em quantos caracteres tem dentro da String
	//toLowerCase() coloca o conteudo da String toda em minusculo
	String nome1 = "Felipe";
	System.out.println("Olá " + nome1.toLowerCase() +" seu nome tem "+ nome1.length() + " letras ");
	
	//==================================================================================================
	//toUpperCase() coloca o conteudo da String toda em maisculo
	System.out.println("Olá " + nome1.toUpperCase() +" seu nome tem "+ nome1.length() + " letras ");
	
	
	//===================================================================================================
	String txt = "Carrefour oferece 15 mil bolsas gratuitas em curso de tecnologia"
			+ " e promete contratar os participantes que se destacarem no programa";
	
	//indexOf resulta em quantos caracteres tem antes da palavra dentro do ()
	System.out.println("Existem "+ txt.indexOf("programa")+" caracteres antes da palavra programa");
	//===================================================================================================
	//.concat() serve para concatenar uma ou mais strings/textos da forma certa
	String nome2 = "Barack";
	String sobrenome = "Obama";;
	System.out.print("Esse é um jeito de concatenar Strings"+nome2.concat(" ").concat(sobrenome));
			
	
	//sc.close();
}
}
