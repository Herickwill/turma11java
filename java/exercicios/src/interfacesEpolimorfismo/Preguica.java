package interfacesEpolimorfismo;

public class Preguica extends Animal {

	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	
	public String pegarNome() {
		return "Nome da pregui�a: " + super.getNome()+" idade: "+super.getIdade();
	}
	
	@Override
	public String emitirSom() {
		return super.emitirSom()+"*Som de pregui�a*";
	}
	
	public void subirArvore() {
		System.out.println("Subindo na �rvore...");
	}
}
