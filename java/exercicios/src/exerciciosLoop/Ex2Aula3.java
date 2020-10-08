package exerciciosLoop;

import java.util.Scanner;

public class Ex2Aula3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 1;
		char resposta;
		
		do {
			System.out.println(numero++);
			System.out.print("Quer continuar? S ou N?");
			resposta = leia.next().toUpperCase().charAt(0);
		} while (resposta == 'S');
		
		leia.close();
		
	}
}
