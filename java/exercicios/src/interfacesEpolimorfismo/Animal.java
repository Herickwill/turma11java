package interfacesEpolimorfismo;

public class Animal {
		
	//atributos
		private String nome;
		private int idade;
		
	//construtor	
		public Animal(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		
	//metodos e get/set
		
		public String emitirSom() {
			return "Emitindo som...";
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}
		
}
