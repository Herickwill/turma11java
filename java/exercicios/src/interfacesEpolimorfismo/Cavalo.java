package interfacesEpolimorfismo;

public class Cavalo extends Animal{
	//atributos
	private String cor;
	
	//construtor
	public Cavalo(String nome, int idade, String cor) {
		super(nome, idade);
		this.cor = cor;
		
	}
	//metodos/get/set
	
	public String pegarNome() {
		return "Nome do cavalo: " + super.getNome()+" idade: "+super.getIdade()+" cor: "+this.cor;
	}
	
	@Override
	public String emitirSom() {
		return super.emitirSom()+"*Som de cavalo*";
	}
	
	public void correr() {
		System.out.println("Cavalo correndo...");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
