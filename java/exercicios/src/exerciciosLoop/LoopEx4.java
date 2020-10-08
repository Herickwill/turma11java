package exerciciosLoop;

import java.util.Scanner;

public class LoopEx4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		char sexo;
		int opcao = 0;
		int totalPessoas=3;
		int contadorPessoas=0;
		int contadorPessoasCalmas = 0;
		int contadorMulheresNervosas = 0;
		int contadorHomensAgressivos = 0;
		int contadorOutrosCalmos = 0;
		int contadorPessoasNervosasMais40 = 0;
		int contadorPessoasCalmasMenos18 = 0;
				
		
		while(contadorPessoas<totalPessoas) {
			contadorPessoas = contadorPessoas + 1;
			System.out.println("Qual sua idade? ");
			idade = leia.nextInt();
			System.out.println("Qual seu sexo? Feminina, Masculino ou Outros? ");
			sexo = leia.next().toUpperCase().charAt(0);
			System.out.println("Você se considera: 1 - Calmx 2 - Nervosx ou 3 - Agressivx? ");
			opcao = leia.nextInt();
			if (idade>0 && (opcao == 1 || opcao == 2 || opcao == 3) && (sexo =='M' || sexo =='F' || sexo == 'O')) {
				if (idade > 40 && opcao == 2) {
					contadorPessoasNervosasMais40 = contadorPessoasNervosasMais40 + 1;
				}
				if (idade < 18 && opcao == 1) {
					contadorPessoasCalmasMenos18 = contadorPessoasCalmasMenos18 + 1;
				}
				if (opcao==1) {
					contadorPessoasCalmas = contadorPessoasCalmas + 1;
				}
				if (sexo=='M') {
					if (opcao==3) {
						contadorHomensAgressivos = contadorHomensAgressivos + 1;
					}
				}
				if (sexo=='F') {
					if (opcao==2) {
						contadorMulheresNervosas = contadorMulheresNervosas + 1;
					}
				}
				if (sexo=='O') {
					if (opcao==1) {
						contadorOutrosCalmos = contadorOutrosCalmos + 1;
					}
				}
				else {
					System.out.println("Você digitou um dado inválido, tente novamente.");

				}
			}else {
				System.out.println("Você digitou um dado inválido, tente novamente.");
			}
		}
		System.out.println("O número de pessoas calmas é "+contadorPessoasCalmas);
		System.out.println("O número de mulheres nervosas é "+contadorMulheresNervosas);
		System.out.println("O número de homens agressivos é "+contadorHomensAgressivos);
		System.out.println("O número de outros calmos é "+contadorOutrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é "+contadorPessoasNervosasMais40);
		System.out.println("O número de pessoas calmas com menos de 18 é "+contadorPessoasCalmasMenos18 );
		
	}
}
