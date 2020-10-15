package classesExerciciosPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		Pessoa herick = new Pessoa("Herick","SP","1170707070");
		Pessoa junior = new Fornecedor("Junior","SP","1180808080",500,300);
		Fornecedor pedro = new Fornecedor("Pedro","SP","1190909090",600,300);
		
		System.out.println("Nomes: "+herick.getNome()+" "+junior.getNome()+" "+pedro.getNome());
		System.out.println("Enderecos: "+herick.getEndereco()+" "+junior.getEndereco()+" "+pedro.getEndereco());
		System.out.println("Telefones: "+herick.getTelefone()+" "+junior.getTelefone()+" "+pedro.getTelefone());
		System.out.println("Credito: "+pedro.getValorCredito()+ " "+pedro.getValorDivida());	
	}

}
