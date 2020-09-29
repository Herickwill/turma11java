programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um sistema que leia um número inteiro e 
		 * mostre uma mensagem indicando se este número é par ou ímpar, 
		 * e se é positivo ou negativo.
		 */
		 //Variavel
		 inteiro = numero
		 //Entradas
		 escreva("Digite o número: ")
		 leia(numero)
		 //Processamento dos dados
		 se (((numero%2)> 0) e (numero>0)){
		 	escreva("Seu número é impar e positivo") // se o resto da divisão for maior e o numero for maior que zero, é impar e positivo
		 	
		 }
		 senao se(((numero%2)< 0) e (numero<0)){
		 	escreva("Seu número é impar e negativo") //se o resto da divisão for menor que 0 e o numero também for meno 0, é impar e negativo
		 	
		 }
		  senao se(((numero%2)== 0) e (numero>0)){
		 	escreva("Seu número é par e positivo")//se o resto da divisão for igual a zero e o numero for 0, é par e positivo
		 	
		 }
		  senao se (((numero%2)== 0) e (numero<0)){
		 	escreva("Seu número é par e negativo")// se o resto da divisão for zero e o numero for menor que zero, é par e negativo
		 	
		 }
		  senao se (numero == 0){
		 	escreva("Seu número é zero")// se o resto da divisão for zero e o numero for menor que zero, é par e negativo
		 	
		 }
		 
	
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1119; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */