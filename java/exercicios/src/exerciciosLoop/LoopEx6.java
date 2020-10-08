package exerciciosLoop;

import java.util.Scanner;

public class LoopEx6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int contadorMultiplo = 0;
		int somaMultiplos = 0;
		double mediaMultiplos = 0;
		
		do {
			System.out.print("\nDigite um valor: ");
			num = leia.nextInt();
			if ((num%3)==0 && num>0) {
				contadorMultiplo++;
				somaMultiplos = somaMultiplos + num;
				mediaMultiplos = (somaMultiplos/contadorMultiplo);
				}
			if (num<0) {
				System.out.println("Voce digitou um numero negativo, ele nao sera considerado.");
			}
		} while(num!=0);
		System.out.printf("A média dos multiplos de 3 é %.2f",mediaMultiplos);
	}
}
