package estruturacondiconal;
import java.util.Scanner;
public class ConverterMes {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dia;
		System.out.println("Informe o dia da semana:");
		dia=ler.nextInt();
		if(dia == 1)
			System.out.println("Janeiro");
		else if (dia == 2)
			System.out.println("Fevereiro");
		else if (dia == 3)
			System.out.println("Março");
		else if (dia == 4)
			System.out.println("Abril");
		else if (dia == 5)
			System.out.println("Junho");
		else if (dia == 6)
			System.out.println("Julho");
		else if (dia == 7)
			System.out.println("Agosto");
		else if (dia == 8)
			System.out.println("Setembro");
		else if (dia == 9)
			System.out.println("Outubro");
		else if (dia == 10)
			System.out.println("Novembro");
		else if (dia ==11)
			System.out.println("Dezembro");
		
	}
}