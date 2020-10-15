package classes;

public class Aviao {
	private String cor;
	public String modelo;
	public int potencia;
	public int capacidadePessoas;
	public double capacidadeCombustivel;
	public double consumoCombustivel;
	
	//M�todo sem retorno, vai printar o que est� escrito abaixo;
	public void exibirAutonomia() {
		System.out.println("A autonomia do avi�o � "+(capacidadeCombustivel * consumoCombustivel)+"km");
	}
	//M�todo com retorno e com par�metros, para usar em outras variaveis e etc;
	public double exibirAutonomia(double consumo, double capacidade) {
		return consumo * capacidade;
	}
	//M�todo com retorno e sem par�metros, para usar em outras variaveis e etc;
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
