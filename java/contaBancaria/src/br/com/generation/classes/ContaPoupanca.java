package br.com.generation.classes;

public class ContaPoupanca extends ContaBancaria {
	//atributos
	private final double JUROS = 0.02;
	//private final double CORR_MONETARIA = 0.05;
	private int mesAniversario;
	
	//construtor
	public ContaPoupanca(String nomeCliente, String numConta, int mesAniversario) {
		super.setNomeCliente(nomeCliente);
		super.setNumConta(numConta);
		this.mesAniversario = mesAniversario;
	}

	
	//metodos
	
	public void correcaoAniversario(int mesAtual) {
		if (mesAtual == this.mesAniversario) {
			System.out.println("O sistema detectou que esse é seu mês de aniversário, então haverá correção monetária com juros de 2%.");
			super.setSaldoConta(super.getSaldoConta() + (super.getSaldoConta()*(this.JUROS)));
			System.out.println("Seu novo saldo: R$"+super.getSaldoConta());
		} else {
			System.out.println("Não é seu mês de aniversário. Não haverá correção monetaria.");
		}
	}

	//get e set
	public int getMesAniversario() {
		return mesAniversario;
	}


	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}


	public double getJUROS() {
		return JUROS;
	}


}
