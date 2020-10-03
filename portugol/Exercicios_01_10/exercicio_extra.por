programa
{
	/*
	 * vetor com 4 alunos
	 * vetor com a nota dos 4 alunos
	 */
	funcao inicio()
	{
		cadeia nome[4]
		inteiro nota[4]
		inteiro notaMaior = 0

		para (inteiro r = 0; r < 4;r++)
		{
			escreva(" Nome do aluno ")
			leia(nome[r])
			escreva(" nota do aluno ")
			leia(nota[r])
			limpa()
			se (nota[r] > notaMaior)
			{
				notaMaior = nota[r]			
			}	
		}
		para(inteiro x = 0; x <4; x++)
		{
			escreva("\n")
			se (notaMaior == nota[x])
			{
				
				escreva (" Aluno :",nome[x]," tirou a nota: ",nota[x],"*")
				
			} senao
			{
				
				escreva (" Aluno :",nome[x]," tirou a nota: ",nota[x])
			}
		}
			
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */