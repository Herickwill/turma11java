programa
{
	
	funcao inicio()
	{
		inteiro segundos
		escreva("Digite a duração do evento em segundos: ")
		leia(segundos)
		inteiro horas = segundos/3600 //segundos informados dividido por 1 hora em sgundos (3600)
		inteiro minutos = (segundos%3600)/60 // o resto da divisão dos segundos informados por 1 hora em segundos(3600), tudo isso dividido por 1h em minutos (60)
		inteiro segundo = (segundos%3600)%60 //o resto da divisão dos segundos informados por 1 hora em segundos(3600), tudo isso será dividido por 60 e o resto serão os segundos
		escreva ("\n O evento durou: ",horas, " horas, ",minutos, " minutos e ",segundo, " segundos.") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */