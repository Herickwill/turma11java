package utilidades;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b=0;
		
		System.out.println("Digite o número A: ");
		a = ler.nextInt();
		System.out.println("Digite o número B: ");
		b = ler.nextInt();
		if (a > b){
			System.out.println((a+b));
		}
				
	}

}
