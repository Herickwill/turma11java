programa
{
	
	funcao inicio()
	{
		// pegar/receber/colher do usuario o nome e manda uma mensage de bom dia
		// colocando sr ou sra conforme a  opcao
		// ingredientes - variaveis
		cadeia nomeUsuario
		caracter opcao
		inteiro anoNascimento
		inteiro anoAtual = 0
		inteiro idade=0
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - feminino :")
		leia(opcao)
		escreva("Digite o ano do seu nascimento ")
		 leia (anoNascimento)
		 anoAtual = 2020
		 idade = anoAtual - anoNascimento
		 se(idade < 25){
		 	escreva ("\n Olá, ", nomeUsuario, " você é Jovem! ")
		 }
		 senao se(idade <60){
		 	se(opcao == 'F'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é madura")
		 	}
		 	senao se (opcao =='f'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é madura")
		 	}
		 	senao se (opcao =='M'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é maduro")
		 	}
		 	senao se (opcao =='m'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é maduro")
		 	}
		 	senao {
		 		escreva ("\n Olá, ", nomeUsuario, " você é madurx")
		 	}
		 		
		 }
		 senao {
		 	se(opcao == 'F'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idosa")
		 	}
		 	senao se (opcao =='f'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idosa")
		 	}
		 	senao se (opcao =='M'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idoso")
		 	}
		 	senao se (opcao =='m'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idoso")
		 	}
		 	senao {
		 		escreva ("\n Olá, ", nomeUsuario, " você é idosx")
		 	}
		 }

	}	
}	 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */