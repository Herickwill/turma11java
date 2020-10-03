programa
{
	
	funcao inicio()
	{
		inteiro N1[3][3],l,c
		inteiro soma = 0
		
		para (l=0;l<3;l++)
			{
		para(c=0;c<3;c++)
				{
			escreva("valor: ")
			leia(N1[l][c])
			soma = soma + (N1[l][c])
			
			}
		}
		limpa()
	para (l=0;l<3;l++)
			{
		para(c=0;c<3;c++)
				{
			escreva("[",N1[l][c],"]")
			}
			escreva("\n")
		}
		escreva("A soma é: ", soma)
		escreva("\nA soma da diagonal é: ",(N1[0][0] + N1[1][1] + N1[2][2]) )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */