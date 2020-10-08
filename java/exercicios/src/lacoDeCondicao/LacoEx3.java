package lacoDeCondicao;

import java.util.Scanner;

public class LacoEx3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Qual sua idade? ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("Você se encontra na categoria infantil.");
		}
		else if (idade >= 15 && idade <=17) {
			System.out.println("Você se encontra na categoria juvenil.");
		}
		else if (idade >= 18 && idade <=25) {
			System.out.println("Você se encontra na categoria adulto.");
		}
		else {
			System.out.println("Você não se encontra em nenhuma categoria descrita.");
		}
		
	}
}
