package br.com.generation.classes;

public class ContaEspecial extends ContaCorrente {
	
	public ContaEspecial(String nomeCliente, String numConta) {
		super(nomeCliente, numConta);
		// TODO Auto-generated constructor stub
	}

	//atributos
	private double chequeEspecial = 5000;
	
	
	//construtor
	
	
	
	//metodos
	@Override
	public void sacar(double valorSacar) {
		if((super.getSaldoConta() - valorSacar) < 0 && (super.getSaldoConta() >= 0)) {
			System.out.println("Aten��o: Seu saldo foi insuficiente para realizar este saque. \nVoc� est� utilizando o cheque especial!");
			super.setSaldoConta(super.getSaldoConta() - valorSacar);
			this.chequeEspecial = this.chequeEspecial + (super.getSaldoConta()); 
			System.out.println("Voc� ainda tem R$ "+this.chequeEspecial+" no cheque especial. Seu novo saldo: R$ "+super.getSaldoConta());
			
		}
		else if (super.getSaldoConta() < 0) {
			super.setSaldoConta(super.getSaldoConta() - valorSacar);
			this.chequeEspecial = this.chequeEspecial - valorSacar;
			System.out.println("Aten��o: Seu saldo foi insuficiente para realizar este saque. \nVoc� est� utilizando o cheque especial!");
			System.out.println("Voc� ainda tem R$ "+this.chequeEspecial+" no cheque especial. Seu novo saldo: R$ "+super.getSaldoConta());
		}
		else {
			super.setSaldoConta(super.getSaldoConta() - valorSacar);
			System.out.println("Voc� realizou um saque de R$ "+valorSacar+". Seu novo saldo �: "+super.getSaldoConta());
		}
	}
	
	public void depositar(double valorDepositar){
		double x = super.getSaldoConta();
	super.setSaldoConta(super.getSaldoConta()+valorDepositar);
	System.out.println("Voc� depositou R$ "+valorDepositar+" em sua conta. Seu novo saldo: R$ "+super.getSaldoConta());
	if (this.chequeEspecial < 5000 && x < 0) {
		//double y = this.chequeEspecial - 500;
		this.chequeEspecial = this.chequeEspecial+(valorDepositar - super.getSaldoConta());
		System.out.println("seu cheque: "+this.chequeEspecial);
	}
}


	//get e set
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	
}
