programa
{
	
	funcao inicio()
	{
		inteiro numAleatorio = 1
		inteiro primeiroIntervalo [25] // 0-25
		inteiro segundoIntervalo [25]//26-50
		inteiro terceiroIntervalo [25]//51-75
		inteiro quartoIntervalo [25]//76-100
		inteiro contador1 = 0
		inteiro contador2 = 0
		inteiro contador3 = 0
		inteiro contador4 = 0
		inteiro y = 0
		
		enquanto (numAleatorio > 0) {
			escreva("\nDigite um numero qualquer e depois um numero negativo para terminar: ")
			leia(numAleatorio)
			
		
		
		para (inteiro x=0;x<25;x++){
			primeiroIntervalo[x] = x + 1
			se (numAleatorio == primeiroIntervalo[x]){
				contador1++
				
			}
		}
		para (inteiro x=50;x>25;x--){
			segundoIntervalo[50 - x] = x
			se (numAleatorio == segundoIntervalo[50 - x]){
				contador2++
				
			}
		}
		para (inteiro x=75;x>50;x--){
			terceiroIntervalo[75 - x] = x
			se (numAleatorio == terceiroIntervalo[75 - x]){
				contador3++
				
			}
		}
		para (inteiro x=100;x>75;x--){
			quartoIntervalo[100 - x] = x
			se (numAleatorio == quartoIntervalo[100 - x]){
				contador4++
				
				}
			}
		}	
		limpa()
		escreva("\nVocê digitou ",contador1," numeros que estão no primeiro intervalo\n")
		escreva("\nVocê digitou ",contador2," numeros que estão no segundo intervalo\n")
		escreva("\nVocê digitou ",contador3," numeros que estão no terceiro intervalo\n")
		escreva("\nVocê digitou ",contador4," numeros que estão no quarto intervalo\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */