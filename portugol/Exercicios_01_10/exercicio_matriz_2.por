programa
{
	
	funcao inicio()
	{
		inteiro N1 [4][6],l,c = 0
		inteiro N2 [4][6],l2,c2 = 0
		inteiro M1 [4][6],l3,c3 = 0
		inteiro M2 [4][6],l4,c4 = 0 
		inteiro soma = 0

		para (l=0;l<4;l++)
			{
		para(c=0;c<6;c++)
				{
			escreva("valor da linha ",l+1," coluna ",c+1," : ")
			leia(N1[l][c])
			
			}
		}
		limpa()
	para (l=0;l<4;l++)
			{
		para(c=0;c<6;c++)
				{
			escreva("[",N1[l][c],"]")
			}
			escreva("\n")
		}
		escreva("\n")
		 /////////////////////////////////// N2

		para (l2=0;l2<4;l2++)
			{
		para(c2=0;c2<6;c2++)
				{
			escreva("valor da linha ",l2+1," coluna ",c2+1," : ")
			leia(N2[l2][c2])
			
			}
		}
		
	para (l2=0;l2<4;l2++)
			{
		para(c2=0;c2<6;c2++)
				{
			escreva("[",N2[l2][c2],"]")
			}
			escreva("\n")
		}
	escreva("\n")		

		/////////////////////////////M1

		para (l3=0;l3<4;l3++)
			{
		para(c3=0;c3<6;c3++)
				{
			//escreva("valor da linha ",l3+1," coluna ",c3+1," : ")
			M1[l3][c3]= (N1[l3][c3]+N2[l3][c3])
			}
		}
		
	para (l3=0;l3<4;l3++)
			{
		para(c3=0;c3<6;c3++)
				{
			escreva("[",M1[l3][c3],"]")
			}
			escreva("\n")
		}

		
	 /////////////////////////////////////
	 escreva("\n")
		para (l4=0;l4<4;l4++)
			{
		para(c4=0;c4<6;c4++)
				{
			//escreva("valor da linha ",l3+1," coluna ",c3+1," : ")
			M2[l4][c4]= (N1[l4][c4]-N2[l4][c4])
			}
		}
		
	para (l4=0;l4<4;l4++)
			{
		para(c4=0;c4<6;c4++)
				{
			escreva("[",M2[l4][c4],"]")
			}
			escreva("\n")
		}
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */