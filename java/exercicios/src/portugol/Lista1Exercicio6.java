package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double total,d,x1,x2,y1,y2 = 0;
		
		
		System.out.println("Digite x1: ");
		x1 = tec.nextDouble();
		System.out.println("Digite x2: ");
		x2 = tec.nextDouble();
		System.out.println("Digite y1: ");
		y1 = tec.nextDouble();
		System.out.println("Digite y2: ");
		y2 = tec.nextDouble();
		total = (Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)); 
		
		d = Math.sqrt(total);
		
		System.out.println("A distância entre os pontos é:"+d);
		
		
		tec.close();
		
		
				
	}
}
