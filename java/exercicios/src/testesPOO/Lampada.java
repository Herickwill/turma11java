package testesPOO;

public class Lampada {
		private int tensao;
		public double corrente;
		public String marca;
		private String cor;
		public boolean lampadaLigada = false;
		public boolean lampadaDesligada = true;
		
		
	void ligarLampada() {
		System.out.println("Você ligou a lâmpada...");
		lampadaLigada = true;
		lampadaDesligada = false;
	}
	void desligarLampada() {
		System.out.println("Você desligou a lâmpada...");
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
