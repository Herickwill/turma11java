package lacoDeCondicao;

import java.util.Scanner;

public class LacoEx4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		String resposta;
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		resposta = ((num%2) == 0)? "Seu n�mero � par, a raiz dele � "+Math.sqrt(num):"Seu n�mero � impar, o quadrado dele � "+Math.pow(num, 2);
		System.out.println(resposta);		
	}
}
