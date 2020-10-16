package interfacesEpolimorfismo;

public class Preguica extends Animal {

	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	
	public String pegarNome() {
		return "Nome da preguiça: " + super.getNome()+" idade: "+super.getIdade();
	}
	
	@Override
	public String emitirSom() {
		return super.emitirSom()+"*Som de preguiça*";
	}
	
	public void subirArvore() {
		System.out.println("Subindo na árvore...");
	}
}
