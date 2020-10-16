package interfacesEpolimorfismo;

public class Cachorro extends Animal {
	
//atributos	
	private String raca;
	
//construtor
	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}
	
//metodos/get/set	
	
	public String pegarNome() {
		return "Nome do cachorro: " + super.getNome()+" idade: "+super.getIdade()+" raça: "+this.raca;
	}
	@Override
	public String emitirSom() {
		return super.emitirSom()+"au au!";
	}
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
