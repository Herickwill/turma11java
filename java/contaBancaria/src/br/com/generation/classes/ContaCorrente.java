package br.com.generation.classes;

public class ContaCorrente extends ContaBancaria {
	//atributos
	private double chequeEspecial = 500;
	private int talonario = 1;
	
	
	//construtor
	public ContaCorrente(String nomeCliente, String numConta) {
		this.setNomeCliente(nomeCliente);
		this.setNumConta(numConta);
		
	}
	
	//metodos
	@Override
	public void emiteExtrato() {
		System.out.println("******** EXTRATO ********");
		System.out.println("Nome do cliente: "+super.getNomeCliente());
		System.out.println("Numero da conta do cliente: "+super.getNumConta());
		System.out.println("Saldo do cliente: R$ "+super.getSaldoConta());
		System.out.println("Quantidade disponível no cheque especial: R$"+this.chequeEspecial);
		System.out.println("Data do extrato: "+java.time.LocalDate.now()+" Hora: "+java.time.LocalTime.now());
	
		
	}

	@Override
	public void sacar(double valorSacar) {
		double x = super.getSaldoConta() - valorSacar;
		if (x < -500) {
			System.out.println("Você ultrapassou o limite do cheque! Operação negada.");
		}
		else {
		if((super.getSaldoConta() - valorSacar) < 0 && (super.getSaldoConta() >= 0)) {
			System.out.println("Atenção: Seu saldo foi insuficiente para realizar este saque. \nVocê está utilizando o cheque especial!");
			super.setSaldoConta(super.getSaldoConta() - valorSacar);
			this.chequeEspecial = this.chequeEspecial + (super.getSaldoConta()); 
			System.out.println("Você ainda tem R$ "+this.chequeEspecial+" no cheque especial. Seu novo saldo: R$ "+super.getSaldoConta());
			
		}
		else if (super.getSaldoConta() < 0) {
			super.setSaldoConta(super.getSaldoConta() - valorSacar);
			this.chequeEspecial = this.chequeEspecial - valorSacar;
			System.out.println("Atenção: Seu saldo foi insuficiente para realizar este saque. \nVocê está utilizando o cheque especial!");
			System.out.println("Você ainda tem R$ "+this.chequeEspecial+" no cheque especial. Seu novo saldo: R$ "+super.getSaldoConta());
		}
		else {
			super.setSaldoConta(super.getSaldoConta() - valorSacar);
			System.out.println("Você realizou um saque de R$ "+valorSacar+". Seu novo saldo é: "+super.getSaldoConta());
		}
		}
	}
	
		@Override
	public void depositar(double valorDepositar){
			double x = super.getSaldoConta();
		super.setSaldoConta(super.getSaldoConta()+valorDepositar);
		System.out.println("Você depositou R$ "+valorDepositar+" em sua conta. Seu novo saldo: R$ "+super.getSaldoConta());
		if (this.chequeEspecial < 500 && x < 0) {
			//double y = this.chequeEspecial - 500;
			this.chequeEspecial = this.chequeEspecial+(valorDepositar - super.getSaldoConta());
			System.out.println("seu cheque: "+this.chequeEspecial);
		}
	}
		
	public void emitirTalonario(double valorTalonario, String numTrans) {
		//System.out.println("Você está emitindo o talonário número "+this.talonario+", na data "+ java.time.LocalDate.now()+" aguarde impressão.");
		System.out.println("O talonário número "+this.talonario+" será creditado para o beneficiario "+numTrans+" no valor de R$"+valorTalonario+" na data "+java.time.LocalDate.now());
		sacar(valorTalonario);
		this.talonario = this.talonario + 1;
	}
	
	
	//get e set
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	
	

}
