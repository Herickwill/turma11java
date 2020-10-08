package lacoDeCondicao;

import java.util.Scanner;

public class LacoEx2 {
		public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1,numero2,numero3, maiorNumero = 0,menorNumero = 0,intermediarioNumero = 0;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		if (numero1 > maiorNumero) {
			maiorNumero = numero1;
		}
		if (numero2 > maiorNumero) {
			maiorNumero = numero2;
		}
		if (numero3 > maiorNumero) {
			maiorNumero = numero3;
		}
		
		if (numero1 < maiorNumero && numero1 > menorNumero && numero1 > intermediarioNumero) {
			intermediarioNumero = numero1;
		}
		if (numero2 < maiorNumero && numero2 > menorNumero && numero2 > intermediarioNumero) {
			intermediarioNumero = numero2;
		}
		if (numero3 < maiorNumero && numero3 > menorNumero && numero3 > intermediarioNumero) {
			intermediarioNumero = numero3;
		}
		
		if (numero1 < maiorNumero && numero1 < intermediarioNumero && numero1 > menorNumero) {
			menorNumero = numero1;
		}
		if (numero2 < maiorNumero && numero2 < intermediarioNumero && numero2 > menorNumero) {
			menorNumero = numero2;
		}
		if (numero3 < maiorNumero && numero3 < intermediarioNumero && numero3 > menorNumero) {
			menorNumero = numero3;	
		}
		
		System.out.printf("Em ordem crescente: %d,%d,%d",menorNumero,intermediarioNumero,maiorNumero);
		
		
		
		}
		
}
