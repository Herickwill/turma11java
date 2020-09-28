programa
{
	
	funcao inicio()
	{ 	//variaveis
		inteiro anoNascimento
		inteiro mesNascimento
		inteiro diasNascimento
		//processamento e saida
		escreva("Digite a idade expressa em anos: ")
		leia(anoNascimento)
		escreva("Digite a idade expressa em meses: ")
		leia(mesNascimento)
		escreva("Digite a idade expressa em dias: ")
		leia(diasNascimento)
		escreva("Sua idade em dias é, aproximadamente: ", ((diasNascimento + (30*8) +28)))//os dias já vividos + 8 meses + os dias que já passaram desse Mês, valor aproximado
	}    
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */