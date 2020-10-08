package lacoDeCondicao;

import java.util.Scanner;

public class LacoEx4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		String resposta;
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		resposta = ((num%2) == 0)? "Seu número é par, a raiz dele é "+Math.sqrt(num):"Seu número é impar, o quadrado dele é "+Math.pow(num, 2);
		System.out.println(resposta);		
	}
}
