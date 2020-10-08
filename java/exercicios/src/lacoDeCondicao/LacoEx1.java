package lacoDeCondicao;

import java.util.Scanner;

public class LacoEx1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1,numero2,numero3,maiorNumero = 0;
		
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
		
		System.out.println(maiorNumero);
	}

}
