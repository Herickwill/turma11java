package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a,b,c = 0;
		double d,r,s = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = tec.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = tec.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		c = tec.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println(d);
		
		
		
		
		tec.close();
		
	}

}
