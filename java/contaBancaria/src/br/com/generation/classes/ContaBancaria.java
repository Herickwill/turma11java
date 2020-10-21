package br.com.generation.classes;

public abstract class ContaBancaria {
	//atributos
	private String nomeCliente;
	private String numConta;
	private double saldoConta;
	
	//construtor
	public ContaBancaria (){
		
	}

	//metodos
	
	public void emiteExtrato(){
		System.out.println("******** EXTRATO ********");
		System.out.println("Nome do cliente: "+this.nomeCliente);
		System.out.println("Numero da conta do cliente: "+this.numConta);
		System.out.println("Saldo do cliente: R$ "+this.saldoConta);
		System.out.println("Data do extrato: "+java.time.LocalDate.now()+" Hora: "+java.time.LocalTime.now());
	}
	
	public void sacar(double valorSacar) {
		if ((this.saldoConta - valorSacar ) < 0) {
			System.out.println("Você não tem saldo para sacar R$ "+valorSacar+". Seu saldo é: R$ "+this.saldoConta);
		} else {
			this.saldoConta = this.saldoConta - valorSacar;
			System.out.println("Você sacou R$ "+valorSacar+" com sucesso.");
			System.out.println("Seu novo saldo: R$ "+this.saldoConta);
		}
	}
		
	
	public void depositar(double valorDepositar){
		
		this.saldoConta = this.saldoConta + valorDepositar;
		System.out.println("Você depositou R$ "+valorDepositar+" em sua conta. Seu novo saldo: R$ "+this.saldoConta);
	}
		
	//get e set
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumConta() {
		return numConta;
	}


	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	public double getSaldoConta() {
		return saldoConta;
	}


	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
}
