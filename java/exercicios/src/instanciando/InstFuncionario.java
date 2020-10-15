package instanciando;

import java.util.Scanner;

import classes.Funcionario;

public class InstFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario("Herick",850,"Eletricista");
		
		
		/*System.out.println("Qual o nome do funcionario 1?");
		funcionario1.nome = leia.next();
		System.out.println("Qual o salario do funcionario 1?");
		funcionario1.salario = leia.nextDouble();
		System.out.println("Qual a função do funcionario 1?");
		funcionario1.funcao = leia.next();*/
		
		System.out.println("O funcionario 1 se chama "+funcionario1.nome+", ganha "+funcionario1.salario+" reais por mês e trabalha como "+funcionario1.funcao);
		

	}

}
