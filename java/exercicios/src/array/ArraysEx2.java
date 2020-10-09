package array;

import java.util.Scanner;

public class ArraysEx2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pares[] = new int[6];
		int impares[] = new int[6];
		int numeroLido = 0;
		int soma = 0;
		int contadorImpares = 0;
		
		for (int x = 0;x<6;x++) {
		System.out.println("Digite um numero:");
		numeroLido = leia.nextInt();
			if ((numeroLido%2)==0) {
				pares[x] = numeroLido;
			}
			else if ((numeroLido%2)!=0) {
				impares[x] = numeroLido;
				contadorImpares++;
			}
		
		}
		//Os números pares digitados; 
		for (int x = 0; x<pares.length;x++) {
			if (pares[x] > 0) {
				System.out.println("Numero par digitado: "+pares[x]);
			}
		}
		
		//A soma dos números pares digitados; 
		
		for (int x = 0;x<pares.length;x++) {
			soma = soma + pares[x];
		}
		if (soma == 0) {
			System.out.println("Você não digitou pares :(");
		}
		else {
			System.out.println("Soma dos pares: "+soma);
		}
		
		//Os números ímpares digitados; 
		for (int x = 0; x<impares.length;x++) {
			if (impares[x] > 0) {
				System.out.println("Numero impar digitado: "+impares[x]);
			}
		}
		//A quantidade de números ímpares digitados.
		if (contadorImpares > 1)
		{
			System.out.printf("Você digitou %d numeros impares", contadorImpares);
		}
		else if (contadorImpares == 1) {
			System.out.printf("Você digitou %d numero impar", contadorImpares);
		}
		else {
			System.out.printf("Você não digitou numeros impares");
		}
	}	
}
