package array;

import java.util.Scanner;

public class ArraysEx1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorA[]= new int [6];
		int valorLido;
		int soma;
		
		// Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		
		for (int x = 0;x<6;x++) {
			System.out.println("Digite os valores: ");
			valorLido = leia.nextInt();
			vetorA[x] = valorLido;
		}
		soma = vetorA[0] + vetorA[1] + vetorA[5];
		System.out.printf("Soma: %d", soma);
		vetorA[4] = 100;
		
		for (int i:vetorA) {
			System.out.println(i);
		}

		
		
	}	
}
