package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double nota1,nota2,nota3 = 0;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		double mediafinal = 0;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = tec.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = tec.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = tec.nextDouble();
		mediafinal = (((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3));
		System.out.println("Sua média final é: "+mediafinal);
				
		
		tec.close();
				
	}
}
