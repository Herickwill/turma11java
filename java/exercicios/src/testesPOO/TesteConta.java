package testesPOO;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.agencia = "1222-0";
		conta1.numeroConta = "555434";
		conta1.especial= true;
		conta1.limiteEspecial = 500;
		conta1.saldo = -10;
		
		conta1.fazerSaque(10);

	}

}
