package instanciando;

import java.util.Scanner;
import classes.ProdutoEletronico;

public class InstProdutoEletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		System.out.println("Qual a tensão desse produto eletronico?");
		celular.tensao = leia.nextInt();
		System.out.println("Qual a corrente desse produto eletronico?");
		celular.corrente = leia.nextDouble();
		System.out.println("Qual o preço desse produto eletronico?");
		celular.preco = leia.nextDouble();
		
		System.out.println("A tensão do celular é "+celular.tensao+"V, tem corrente de "+celular.corrente+"A e custa "+celular.preco+"R$");
		
	}

}
