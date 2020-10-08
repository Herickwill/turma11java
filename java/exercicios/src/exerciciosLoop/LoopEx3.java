package exerciciosLoop;

import java.util.Scanner;

public class LoopEx3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int totalMenos21 = 0;
		int totalMais50 = 0;
		int idade = 0;
		int restoIdade = 0;
		
		while(idade!=-99) {
			System.out.println("Qual sua idade?");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0) {
				totalMenos21 = totalMenos21 + 1;
			}
			else if (idade > 50) {
				totalMais50 = totalMais50 + 1;
			}
			else if (idade > 21 && idade <50 && idade>0) {
				restoIdade = restoIdade +1;
			}	
		}
		System.out.println("Há um total de "+totalMenos21+" pessoas com menos de 21 anos, "+totalMais50+" pessoas com mais de 50 anos e "+restoIdade+" pessoas com idade entre 21 e 50");	
	}
}
