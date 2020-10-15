package testesPOO;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada();
		
		lamp1.setTensao(127);
		lamp1.setCor("Amarelo");
		lamp1.corrente = 1.50;
		lamp1.marca = "Eletrolux";
		
		lamp1.ligarLampada();
		System.out.println("Lampada ligada? "+lamp1.lampadaLigada);
		lamp1.desligarLampada();
		System.out.println("Lampada desligada? "+lamp1.lampadaDesligada);
		System.out.println("A tensão da lampada é "+lamp1.getTensao()+"V");
		System.out.println("A lampada tem cor "+lamp1.getCor());

		

	}

}
