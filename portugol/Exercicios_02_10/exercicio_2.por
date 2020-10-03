programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	real peso = 0
		real altura = 0
		escreva("Digite o seu peso: ")
		leia(peso)
		escreva("Digite a sua altura: ")
		leia(altura)
		real imt = (Matematica.arredondar(imc(peso,altura), 2))

		se (imt < 18.5)
		{
			escreva("Você está abaixo do peso, seu IMC é: ",imt)
		}
		senao se ((imt >= 18.5 e imt <= 25)){
			escreva("Você está com o peso normal, seu IMC é: ",imt)
		}
		senao se ((imt > 25 e imt <= 30)){
			escreva("Você está com o peso acima do normal, seu IMC é: ",imt)
		}
		senao {
			escreva("Você está com obesidade, seu IMC é: ",imt)
		}
	}

	funcao real imc(real peso,real altura){
		retorne((peso/(Matematica.potencia(altura, 2))))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */