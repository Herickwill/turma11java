package instanciando;

import java.util.Scanner;
import classes.ProdutoEletronico;

public class InstProdutoEletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		System.out.println("Qual a tens�o desse produto eletronico?");
		celular.tensao = leia.nextInt();
		System.out.println("Qual a corrente desse produto eletronico?");
		celular.corrente = leia.nextDouble();
		System.out.println("Qual o pre�o desse produto eletronico?");
		celular.preco = leia.nextDouble();
		
		System.out.println("A tens�o do celular � "+celular.tensao+"V, tem corrente de "+celular.corrente+"A e custa "+celular.preco+"R$");
		
	}

}
