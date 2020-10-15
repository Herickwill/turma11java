package classesExerciciosPOO;

public class Operario extends Pessoa {
		private double valorProducao;
		private double comissao;
		
		public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
			this.valorProducao = valorProducao;
			this.comissao = comissao;
		}
		
}
