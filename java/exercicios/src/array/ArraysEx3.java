package array;

import java.util.Scanner;

public class ArraysEx3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int valorLido = 0;
		int contador = 0;
		
		for (int linha = 0; linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				System.out.println("Digite um numero: ");
				valorLido = leia.nextInt();
				matriz[linha][coluna] = valorLido;
				if (matriz[linha][coluna] > 10) {
					contador++;
				}
				
			}
		}
		
		System.out.println("\n A matriz:");
		
		for (int linha = 0; linha<3;linha++) {
			System.out.println("\n");
			for (int coluna=0;coluna<3;coluna++) {
				System.out.printf("\t [ %d ]\t", matriz[linha][coluna]);
			}
		}
		
		System.out.printf("\nHá %d valores maiores que 10 nessa matriz.",contador);
		
		
	}	
}
