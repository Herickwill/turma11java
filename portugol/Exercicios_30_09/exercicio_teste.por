programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro valor = 0
		//entrada 
		escreva("Digite um valor inteiro positivo: ")
		leia(valor)
		parImpar(valor)
	}
	funcao parImpar(inteiro valor){
		escreva("\n")
		se (((valor%2)> 0) e (valor>0)){
		 	escreva("Seu número é impar") //se o resto da divisão for maior e o numero for maior que zero, é impar e positivo
		 	
		 }
		senao se(((valor%2)== 0) e (valor>0)){
		 	escreva("Seu número é par")//se o resto da divisão for igual a zero e o numero for 0, é par e positivo
		 	
		 }
		senao se (valor == 0) {
			escreva("Voce digitou zero")//se digitar zero, parar o programa
		}
		senao {
			escreva("Voce digitou um numero negativo")//se digitar numero negativo, parar programa
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */