programa
{
	
	funcao inicio()
	{
		inteiro diasNascimento

		escreva("Digite sua idade expressa em dias: ")
		leia(diasNascimento)
		inteiro ano = diasNascimento/360 //o ano é a qtd. de dias dividido pela qtd de dias que um ano tem (12 vezes 30)
		inteiro mes = (diasNascimento - (360*ano))/30 //os meses são o dias informados menos a qtd de dias vividos dividido pela qtd de dias em um mes (30) 
		inteiro dias = (diasNascimento - (360*ano))%30 //os dias, se houver, são os dias de nascimento menos os dias vividos e o resto disso na divisão por 30
		
		escreva("\n Sua idade em é, aproximadamente: ",ano," anos, ",mes, " meses e ",dias, " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */