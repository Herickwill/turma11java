package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double custoCarro,custoFabrica,imposto = 0.45, distribuidor = 0.28;
		
		System.out.println("Digite o preço de fábrica do carro: ");
		custoFabrica = tec.nextDouble();
		
		custoCarro = (custoFabrica + (custoFabrica*imposto)+(custoFabrica*distribuidor));
		System.out.println("O preço final do carro será "+custoCarro+" reais");
		
				
				
		
		
		tec.close();
	}
}
