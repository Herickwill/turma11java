package br.com.generation.classes;

public class ContaEmpresa extends ContaBancaria {
	//atributos
	private double emprestimoEmpresa = 3000;
	
	//construtor
	public ContaEmpresa(String nomeCliente, String numConta) {
		super.setNomeCliente(nomeCliente);
		super.setNumConta(numConta);
	}

	
	//metodos
	@Override
	public void emiteExtrato(){
		System.out.println("******** EXTRATO ********");
		System.out.println("Nome da empresa: "+super.getNomeCliente());
		System.out.println("Numero da conta da empresa: "+super.getNumConta());
		System.out.println("Saldo da empresa: R$ "+super.getSaldoConta());
		System.out.println("Empréstimo disponível para a empresa: "+this.emprestimoEmpresa);
		System.out.println("Data do extrato: "+java.time.LocalDate.now()+" Hora: "+java.time.LocalTime.now());
		
	}
	
	public void emprestimo(double valorEmprestimo) {
		if ((this.emprestimoEmpresa - valorEmprestimo) < 0) {
			System.out.println("Seu valor de emprestimo é maior que o permitido! Ação negada.");
		} else {
		this.emprestimoEmpresa = this.emprestimoEmpresa - valorEmprestimo;
		super.setSaldoConta(super.getSaldoConta() + valorEmprestimo);
		}
		
	}
	
	
	
	
	//get e set
	public double getLimiteEmpresa() {
		return emprestimoEmpresa;
	}


	public void setLimiteEmpresa(double limiteEmpresa) {
		this.emprestimoEmpresa = limiteEmpresa;
	}
	
	
	
}
