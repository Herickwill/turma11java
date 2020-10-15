package classesExerciciosPOO;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Herick","SP","40028922",123, 600, 50);
		
		System.out.println("-------Dados empregado 1 -------");
		System.out.println("Nome: "+empregado1.getNome());
		System.out.println("Local: "+empregado1.getEndereco());
		System.out.println("Telefone: "+empregado1.getTelefone());
		System.out.println("Codigo setor: "+empregado1.getCodigoSetor());
		System.out.println("Salario bruto: R$"+empregado1.getSalarioBase());
		System.out.println("Salario liquido: R$"+empregado1.calcularSalario()+" com imposto de "+empregado1.getImposto()+"%");
	}

}
