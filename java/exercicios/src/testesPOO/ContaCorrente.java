package testesPOO;

public class ContaCorrente {
		public String numeroConta;
		public String agencia;
		public boolean especial;
		public double limiteEspecial;
		double saldo;
		
		
		void fazerSaque(double valorDesejado) {
			if (saldo >=valorDesejado ) {
				saldo -= valorDesejado; //vou pegar o saldo e subtrair pelo valor desejado, ou seja, se vc tem 20 reais de saldo e sacou 10, vai ficar 10
				System.out.println("Saque de R$"+valorDesejado+" realizado com sucesso. Seu novo saldo é R$"+saldo);
			}
			else {
				System.out.println("Você não tem saldo para sacar.");
			}
			
		}
}
