package instanciando;

import java.util.Scanner;
import classes.Aviao;

public class InstAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao("Amarelo", "A01");
		
		System.out.println("Qual a cor do avi�o?");
		aviao1.setCor(leia.next()) ;
		System.out.println("Qual o modelo do avi�o?");
		aviao1.modelo = leia.next();
		System.out.println("Qual a potencia, em numero inteiro, do avi�o?");
		aviao1.potencia = leia.nextInt();
		System.out.println("Qual a capacidade max de pessoas no avi�o?");
		aviao1.capacidadePessoas = leia.nextInt();
		aviao1.capacidadeCombustivel = 500;
		aviao1.consumoCombustivel = 100;
		
		System.out.println("O avi�o 1 � da cor "+aviao1.getCor()+", do modelo "+aviao1.modelo+", com potencia de "+aviao1.potencia+" e com capacidade maxima de "+aviao1.capacidadePessoas+" pessoas.");
		aviao1.exibirAutonomia();
		//double x = aviao1.exibirAutonomia(100,500);
		//System.out.println(x); comando para exibir s� que com retorno e parametros
		//double y = aviao1.obterAutonomia();
		//System.out.println(y); comando para exibir com retorno e sem parametros, estou usando as variaveis daqui
	
	
	}

}
