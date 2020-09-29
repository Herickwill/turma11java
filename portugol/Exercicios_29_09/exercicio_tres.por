programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*
		 * Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		  Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, 
		  imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		 //variaveis
		 real = n1,n2,n3,n4 = 0
		 real = n11,n22,n33,n44 = 0

		//entradas e atualização de variáveis
		 escreva("Digite o primeiro número: ")
		 leia(n1)
		 escreva("Digite o segundo número: ")
		 leia(n2)
		 escreva("Digite o terceiro número: ")
		 leia(n3)
		 escreva("Digite o quarto número: ")
		 leia(n4)
		 n11 = mat.potencia(n1, 2)
		 n22 = mat.potencia(n2, 2)
		 n33 = mat.potencia(n3, 2)
		 n44 = mat.potencia(n4, 2)

		/*
		 * se o quadrado do terceiro numero for maior que 1000, será exibido
		 * apenas o resultado dele e os outros não. Caso contrario, mostrar
		 * o resultado de todos.
		 */
		se (n3 >= 1000){
			escreva("\nO quadrado do terceiro numero excedeu 1000, o número é: ",n3)
		}
		senao {
			escreva("\nPrimeiro número: ",n1, ", o quadrado dele é: ",n11)
			escreva("\nSegundo número: ",n2, ", o quadrado dele é: ",n22)
			escreva("\nTerceiro número: ",n3, ", o quadrado dele é: ",n33)
			escreva("\nQuarto número: ",n4, ", o quadrado dele é: ",n44)
			 
		}
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 690; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */