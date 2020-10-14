package classes;
import java.util.Scanner;
public class Processamento {
	public static void main(String[] args) {
		Professor prof1 = new Professor();
		Aluno aluno1 = new Aluno();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Qual o nome do 1o professor?");
		prof1.nome = entrada.next();
		System.out.printf("Qual idade do 1o professor?");
		prof1.idade = entrada.nextInt();
		System.out.printf("Qual sexo do 1o professor?");
		prof1.sexo = entrada.next().charAt(0);
		System.out.printf("Qual especialidade do 1o professor?");
		prof1.especialidade = entrada.next();
		System.out.println();
		
		
		System.out.println("Qual o nome do aluno?");
		aluno1.nome = entrada.next();
		System.out.println("Qual o ano de nascimento");
		aluno1.anoDeNascimento = entrada.nextInt();
		aluno1.idade = 2020 - aluno1.anoDeNascimento;
		System.out.println("Qual o curso do aluno?");
		aluno1.curso = entrada.next();
		System.out.println("Qual o seu sexo?");
		aluno1.sexo = entrada.next().charAt(0);
		System.out.println("Qual a nota geral do aluno?");
		aluno1.notaGeral = entrada.nextDouble();
		System.out.println();
		
		
		entrada.close();
		System.out.println(prof1.nome +" "+ prof1.idade +" "+ prof1.sexo +" "+ prof1.especialidade);
		System.out.println(aluno1.nome +" "+ aluno1.idade +" "+ aluno1.sexo +" "+ aluno1.notaGeral);
	}
}