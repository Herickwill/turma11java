programa
{
	
	funcao inicio()
	{	//variaveis
		inteiro diasNascimento = 0 // inicialização
		inteiro ano = 0 // inicialização
		inteiro mes = 0 // inicialização
		inteiro dia = 0 // inicialização
		//processamento e saidas
		escreva("Digite sua idade expressa em dias: ") //entrada do usuario
		leia(diasNascimento) //ler entrada do usuario
		ano = diasNascimento/365 //dias informados pelo usuario dividido por 1 ano
		escreva("Anos: ", ano) //"imprimir" o resultado
		mes = (diasNascimento - (365*ano))/30 //dias informados menos a qnt de dias no ano calculado, dps didive pela qtd de dias em 1 mês 
		escreva("\nMeses: ", mes) //"imprimir" o resultado
		dia = (diasNascimento - (365*ano))%30 //mesma coisa do mes, porem usando o resto da divisão
		escreva("\nDias: ", dia) //"imprimir" o resultado
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 800; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */