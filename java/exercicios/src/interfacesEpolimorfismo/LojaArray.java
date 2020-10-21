package interfacesEpolimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LojaArray {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Collection<String> produtos = new ArrayList();
		int opc = 0;
		do {
		System.out.println("\nO que você deseja? \n1-Adicionar Produto na Lista \n2-Remover produto da lista \n3-Ver lista \n4-Sair");
		opc = leia.nextInt();
		
		if (opc == 1) {
			System.out.println("Digite o nome de um produto para adicionar na lista: ");
			String nomeProdutoAdd = leia.next();
			produtos.add(nomeProdutoAdd);
			System.out.println("Produto"+nomeProdutoAdd+" adicionado.");
		}	
		else if (opc ==2) {
			System.out.println("Digite o nome de um produto para remover da lista: ");
			String nomeProdutoRmv = leia.next();
			produtos.remove(nomeProdutoRmv);
			System.out.println("Produto "+nomeProdutoRmv+" removido.");
		}
		else if (opc == 3) {
			System.out.println("*LISTA DE PRODUTOS*");
			for (String produto:produtos) {
				System.out.println("Nome do produto: "+produto);
			}
		}else if (opc==4) {
			System.out.println("Finalizado.");
		} else {
			System.out.println("Você digitou um número inválido.");
		}
		
		}while(opc!=4);
		
		
		
		
		
	}
	
	

}
