package estruturacondiconal;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double v1,v2,v3,v4,media;
		
		System.out.println("Informe o primeiro valor: ");
		v1 = ler.nextDouble ();
		System.out.println("Informe o segundo valor: ");
		v2 = ler.nextDouble ();
		System.out.println("Informe o terceiro valor: ");
		v3 = ler.nextDouble ();
		System.out.println("inform o quarto valor: ");
		v4= ler.nextDouble ();
		
		media= (v1+v2+v3+v4)/4;
		
		if (media >= 7) {
			System.out.println("Você foi aprovado, sua média foi de "+media);
		}
		else {
			System.out.println("Você foi reprovado, sua média foi de "+media);
		}

	}

}
