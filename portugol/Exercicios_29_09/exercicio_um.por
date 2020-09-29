programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*
		 * Regulamento = 50kg de Tomate, máximo permitido;
		 * Pagar multa de R$ 4,00 por quilo excedido
		 * João precisa que você faça um sistema que leia a variável 
		 * P (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) e na variável M o valor 
		 * da multa que João deverá pagar. Caso contrário 
		 * mostrar tais variáveis com o conteúdo ZERO.
		 */

		 //variáveis
		 real P = 0 //peso de tomates, em kg
		 real E = 0 //Excesso de tomates
		 real M = 0//valor da multa, em R$

		 //Entradas
		 escreva("Digite a qtd de tomate: ")
		 leia(P)
		 
		//Processamento de Dados e saídas
		/*
		 * Se o peso for maior que 50, subtrair o peso informado pelo peso max.
		 * gerando o excedente. A multa será 4 vezes o excedente.
		 * Caso seja menor ou igual a 50, não sofrerá multa.
		 */
		
		se (P>50) {
			E = P - 50
			M = 4*E
			escreva("Você excedeu ", mat.arredondar(E, 2),"kg em tomates")
			escreva("\nVocê deverá pagar R$",mat.arredondar(M, 2)," em multa")
		}
		senao {
			escreva("Você não excedeu o regulamento, não precisará pagar multa")
		}
		
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */