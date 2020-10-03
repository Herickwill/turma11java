programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{	//Variaveis
		const inteiro valorMax = 5
		inteiro valoresDados[valorMax]
		inteiro maiorValor = 0
		/*
		 * Adicionar um valor digitado no vetor "valoresDados" e escreve-lo em seguida, 5 vezes
		 * Identificar o maior valor digitado e armazenar
		 */
		para (inteiro x=0;x<5;x++)
		{	
			escreva("\nDigite o valor: ")
			leia(valoresDados[x])
			escreva("\nValor",x+1,":",valoresDados[x])
			se (valoresDados[x] > maiorValor){
				maiorValor = valoresDados[x]
				
			}
		}
		//Escrever o maior valor digitado
		escreva("\nO maior valor digitado foi: ",maiorValor)
			
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */