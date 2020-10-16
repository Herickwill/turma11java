package interfacesEpolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal dog1 = new Cachorro("Spyke", 3, "Labrador");
		Animal cav1 = new Cavalo("Marcelo",3,"Preto");
		Animal preg1 = new Preguica("Junior",4);
		
		/*System.out.println(cav1.pegarNome());
		System.out.println(preg1.pegarNome());
		System.out.println(dog1.pegarNome());*/
		
		System.out.println(dog1.emitirSom());
		System.out.println(cav1.emitirSom());
		System.out.println(preg1.emitirSom());
		

	}

}
