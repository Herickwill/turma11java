package portugol;
import java.util.Scanner;
public class Exercicio2Aula2 {
	public static void main(String[] args) {
		//grupo 7: yago, bruno costa e joão
		Scanner leia = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if ((num > 0) && ((num % 2) ==0 )) {
		System.out.println("O número "+ num + " é par!");
		
		}
		
		else if ((num > 0) && ((num % 2) == 1 )) {
			System.out.println("O número "+ num + " é ímpar!");
			
			}
		else if (num < 0) {
			System.out.println("O número é negativo.");
		}
		else {
			System.out.println("Você digitou zero, que é nulo.");
		}
		
		/*
		 * Scanner leia = new Scanner(System.in);
		
		int valor=0;
		
		System.out.print("Digite um numero positivo acima de 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"VC DIGITOU ZERO OU NEGATIVO!!!":((valor%2)==0)?"VALOR "+valor+" É PAR":"VALOR "+valor+" É IMPAR");
		
		leia.close();
		 */
		
		leia.close();
	}
}