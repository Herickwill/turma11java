package instanciando;

import java.util.Scanner;
import classes.Cliente;

public class InstCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		String sexo;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o nome do cliente 1?");
		cliente1.nome = leia.next();
		System.out.println("Qual o ano de nascimento do cliente 1?");
		cliente1.idade = (2020 - leia.nextInt());
		System.out.println("Qual o sexo do cliente 1? M- Masculino F - Feminino ou O- Outro?");
		cliente1.sexo = leia.next().toUpperCase().charAt(0);
		sexo = (cliente1.sexo == 'M')? "Masculino":(cliente1.sexo=='F')?"Feminina":"Outros";
		System.out.println("Qual o banco do cliente 1?");
		cliente1.bancoUsado = leia.next();
		
		
		System.out.println("Cliente 1: "+cliente1.nome+", tem "+cliente1.idade+" anos, se identifica como "+sexo+" e usa o banco "+cliente1.bancoUsado);
		
		
		
		
		leia.close();
		
	}
	
}
