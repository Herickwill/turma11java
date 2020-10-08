package exerciciosLoop;

import java.util.Scanner;

public class LoopEx5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		int numeroLido = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numeroLido = leia.nextInt();
			numero = (numeroLido + numero);	
		} while(numeroLido!=0);
		System.out.println("A soma dos numeros digitados é: "+numero);
	}
}
