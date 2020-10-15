package classesExerciciosPOO;

public class Administrador extends Pessoa {
	private double ajudaCusto;
	
	public Administrador(String nome, String endereco, String telefone, double ajudaCusto)
	{
		super(nome,endereco,telefone);
		this.ajudaCusto = ajudaCusto;
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
}
