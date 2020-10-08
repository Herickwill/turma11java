package exerciciosLoop;

import java.util.Scanner;

public class LoopEx2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;
		int somapar = 0;
		int somaimpar = 0;
			
		for (int x=1;x<=10;x++) {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if (num%2 == 0) 
			{
				somapar = somapar + 1;
			}else 
				{
				somaimpar = somaimpar +1;
				}
		}
		System.out.println("Você digitou "+somapar+" numeros pares e "+somaimpar+" numeros impares");						
	}
}
