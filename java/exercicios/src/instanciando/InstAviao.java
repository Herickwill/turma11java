package instanciando;

import java.util.Scanner;
import classes.Aviao;

public class InstAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		
		System.out.println("Qual a cor do avião?");
		aviao1.cor = leia.next();
		System.out.println("Qual o modelo do avião?");
		aviao1.modelo = leia.next();
		System.out.println("Qual a potencia, em numero inteiro, do avião?");
		aviao1.potencia = leia.nextInt();
		System.out.println("Qual a capacidade max de pessoas no avião?");
		aviao1.capacidade = leia.nextInt();
		
		System.out.println("O avião 1 é da cor "+aviao1.cor+", do modelo "+aviao1.modelo+", com potencia de "+aviao1.potencia+" e com capacidade maxima de "+aviao1.capacidade+" pessoas.");

	}

}
