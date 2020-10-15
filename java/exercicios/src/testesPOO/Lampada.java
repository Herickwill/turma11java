package testesPOO;

public class Lampada {
		private int tensao;
		public double corrente;
		public String marca;
		private String cor;
		public boolean lampadaLigada = false;
		public boolean lampadaDesligada = true;
		
		
	void ligarLampada() {
		System.out.println("Voc� ligou a l�mpada...");
		lampadaLigada = true;
		lampadaDesligada = false;
	}
	void desligarLampada() {
		System.out.println("Voc� desligou a l�mpada...");
		lampadaLigada = false;
		lampadaDesligada = true;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
		
}
