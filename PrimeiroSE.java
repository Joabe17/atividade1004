package estruturacondiconal;

import java.util.Scanner;

public class PrimeiroSE {

	public static void main(String[] args) { 
		Scanner: ler = new Scanner (System.in);
		int numero;

		System.out.println("Digite um valor");
		numero = ler.nextInt ();
		if(numero >=10 ) {
			System.out.println("o numero é maior que 10");
		}


		else {
			System.out.println("O numero é maior que 10");
		}
		ler.close ();

	}
}

