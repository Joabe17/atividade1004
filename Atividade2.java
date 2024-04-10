package estruturacondiconal;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String palavra1,palavra2;
		
	System.out.println("Informa a primeira palavra:");
	palavra1 = ler.nextLine ();
	
	System.out.println("informe a segunda palavra");
	palavra2 =ler.nextLine ();
	
	if (palavra1.equals(palavra2)); {
	System.out.println("As palavras são iguais");
	}
	
	else {
		System.out.println("As palavras são diferentes");
	}
	}

}
