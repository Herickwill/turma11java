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
		//Os n�meros pares digitados; 
		for (int x = 0; x<pares.length;x++) {
			if (pares[x] > 0) {
				System.out.println("Numero par digitado: "+pares[x]);
			}
		}
		
		//A soma dos n�meros pares digitados; 
		
		for (int x = 0;x<pares.length;x++) {
			soma = soma + pares[x];
		}
		if (soma == 0) {
			System.out.println("Voc� n�o digitou pares :(");
		}
		else {
			System.out.println("Soma dos pares: "+soma);
		}
		
		//Os n�meros �mpares digitados; 
		for (int x = 0; x<impares.length;x++) {
			if (impares[x] > 0) {
				System.out.println("Numero impar digitado: "+impares[x]);
			}
		}
		//A quantidade de n�meros �mpares digitados.
		if (contadorImpares > 1)
		{
			System.out.printf("Voc� digitou %d numeros impares", contadorImpares);
		}
		else if (contadorImpares == 1) {
			System.out.printf("Voc� digitou %d numero impar", contadorImpares);
		}
		else {
			System.out.printf("Voc� n�o digitou numeros impares");
		}
	}	
}
