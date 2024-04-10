package estruturacondiconal;

import java.util.Scanner;
public class Composta {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n;
		
		System.out.println("Informe o numero:");
		n = ler.nextInt();
		
		if (n > 0) {
			System.out.println("O numero é positivo");
		}
			
			else if (n == 0) {
				System.out.println("o numero é zero");
			}
			else {
				System.out.println("O numero é negativo");
			}
			
		}

	}

