programa
{
	
	funcao inicio()
	{
		inteiro numero,numeroimpar = 0
		inteiro soma = 0
		//escreva("Digite o primeiro numero: ")
		//leia(numero)

		para(numero=1;numero<=500;numero++){
			se (((numero%2)!=0) e ((numero%3)==0)){	
				soma = soma + numero
			  //escreva("\n",soma)
			}
			
			
		}
		escreva("\nA soma dos termos é ",soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */