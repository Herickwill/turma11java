programa
{
	
	funcao inicio()
	{
		/*
		 * sistema que leia as variáveis C e N, respectivamente código e 
		 * número de horas trabalhadas de um operário. 
		 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o número de horas exceder a 50 
		 * calcule o excesso de pagamento armazenando-o na variável E, 
		 * caso contrário zerar tal variável. 
		 * A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o salário total e o salário excedente.

		 */

		 //Variaveis
		 real C = 0 //salario inicial
		 inteiro N = 0 //horas
		 inteiro E = 0 //excedente em horas
		 real salarioTotal = 0 //salario contando com as horas extras
		 real salarioExc = 0 //dinheiro que foi adicionado ao salario inicial

		//Entrada e Processamento de dados
		 escreva("Digite o numero de horas trabalhadas: ")
		 leia(N)
		 C = N * 10 //Salario atual, sem excedentes
		 escreva("Seu salário inicial é: R$ ",C)

		/*
		 * Se o numero de horas trabalhadas for maior que 50:
		 * Calcule o excedente (Horas trabalhadas - 50)
		 * Calcule o salario total (Salario inicial + salario de horas excedentes)
		 * Calcule o salario excedente (salario com excedentes - salario inicial)
		 * Caso contrario, imprima que está tudo certo.
		 */
		 se (N > 50){
		 		E = N - 50
		 		escreva("\nVocê trabalhou ",E," horas a mais!")
		 		salarioTotal = (C + (20*E))
		 		salarioExc = (salarioTotal - C)
		 		escreva("\nVocê ganhará R$",salarioTotal," de salário total, sendo R$",salarioExc," o salario excedente")	
		 	
		 	}
		 senao {
		 	escreva("\nEstá tudo certo, você não excedeu as 50 horas, seu salário continua R$",C)	
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1643; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */