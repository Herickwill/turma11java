package portugol;
import java.util.Scanner;
public class Exercicio2Aula2 {
	public static void main(String[] args) {
		//grupo 7: yago, bruno costa e jo�o
		Scanner leia = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		
		if ((num > 0) && ((num % 2) ==0 )) {
		System.out.println("O n�mero "+ num + " � par!");
		
		}
		
		else if ((num > 0) && ((num % 2) == 1 )) {
			System.out.println("O n�mero "+ num + " � �mpar!");
			
			}
		else if (num < 0) {
			System.out.println("O n�mero � negativo.");
		}
		else {
			System.out.println("Voc� digitou zero, que � nulo.");
		}
		
		/*
		 * Scanner leia = new Scanner(System.in);
		
		int valor=0;
		
		System.out.print("Digite um numero positivo acima de 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"VC DIGITOU ZERO OU NEGATIVO!!!":((valor%2)==0)?"VALOR "+valor+" � PAR":"VALOR "+valor+" � IMPAR");
		
		leia.close();
		 */
		
		leia.close();
	}
}