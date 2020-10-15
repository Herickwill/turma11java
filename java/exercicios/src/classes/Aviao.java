package classes;

public class Aviao {
	private String cor;
	public String modelo;
	public int potencia;
	public int capacidadePessoas;
	public double capacidadeCombustivel;
	public double consumoCombustivel;
	
	//Método sem retorno, vai printar o que está escrito abaixo;
	public void exibirAutonomia() {
		System.out.println("A autonomia do avião é "+(capacidadeCombustivel * consumoCombustivel)+"km");
	}
	//Método com retorno e com parâmetros, para usar em outras variaveis e etc;
	public double exibirAutonomia(double consumo, double capacidade) {
		return consumo * capacidade;
	}
	//Método com retorno e sem parâmetros, para usar em outras variaveis e etc;
	public double obterAutonomia() {
		return capacidadeCombustivel*consumoCombustivel;
	}
	// Construtor para dar esses parametros;
	public Aviao(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}
	// metodo get e set, get para visualizar, set para alterar
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
