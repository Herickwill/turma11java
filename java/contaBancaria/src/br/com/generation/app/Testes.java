package br.com.generation.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.generation.classes.ContaCorrente;

public class Testes {

	public static void main(String[] args) {
		//ContaCorrente [] conta = new ContaCorrente[10]; //cria um array para armazenar 10 clientes
		Scanner leia = new Scanner(System.in);
		List<ContaCorrente> contas = new ArrayList<>(); //como monta a lista
			
		
		contas.add(new ContaCorrente ("Herick","0006"));
		contas.add(new ContaCorrente ("Teste","0007"));
		
		for (ContaCorrente conta : contas) {
			System.out.println(conta.getNomeCliente() +", bem vindo, o que deseja?");
			
		}
		
		//contas.indexOf();
		System.out.println();
		

	}

}
