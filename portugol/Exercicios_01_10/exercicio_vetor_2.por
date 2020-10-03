programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{	//Variaveis
		const inteiro valorMax = 10
		inteiro valoresDados[valorMax]
		inteiro maiorValor = 0
		inteiro contador = 0
		inteiro soma = 0
		/*
		 * Adicionar um valor digitado no vetor "valoresDados" e escreve-lo em seguida, 5 vezes
		 * Identificar o maior valor digitado e armazenar
		 */
		para (inteiro x=0;x<valorMax;x++)
		{	
			escreva("\nDigite o ",x+1," valor: ")
			leia(valoresDados[x])
			escreva("\nValor",x+1,":",valoresDados[x],"\n")
			soma = soma + valoresDados[x]
			se (valoresDados[x] == maiorValor){
				contador++	
			}	
			senao se (valoresDados[x] > maiorValor){
				contador = 1
				maiorValor = valoresDados[x]	
			}
		}
		//Escrever o maior valor digitado1
		escreva("\nO maior valor digitado foi ",maiorValor)
		escreva("\nO maior valor foi digitado ",contador," vezes")
		escreva("\nA média dos valores é ",(soma/valorMax))
			
		
	}
}	



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */