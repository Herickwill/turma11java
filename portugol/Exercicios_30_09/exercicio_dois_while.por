programa
{
	
	funcao inicio()
	{
		inteiro valor = 1
		inteiro vezes = 0
		inteiro somatorio = 0
		real media = 0
		

		enquanto(valor>0)
		{
			escreva("\nDigite um valor: ")
			leia(valor)
			//escreva("\n",valor)
			vezes = vezes + 1
			escreva("\nForam lidos ",vezes," valores")
			somatorio = somatorio + valor
			escreva("\nA soma é ",somatorio)
			media = (somatorio/vezes)
			escreva("\nA média de valores é: ",media)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */