package portugol;

import java.util.Scanner;

public class Lista1Exercicio3 {
	public static void main(String[] args) 
	{ Scanner tec = new Scanner(System.in);
		/*
		 *  inteiro segundos
			escreva("Digite a duração do evento em segundos: ")
			leia(segundos)
			inteiro horas = segundos/3600 //segundos informados dividido por 1 hora em sgundos (3600)
			inteiro minutos = (segundos%3600)/60 // o resto da divisão dos segundos informados por 1 hora em segundos(3600), tudo isso dividido por 1h em minutos (60)
			inteiro segundo = (segundos%3600)%60 //o resto da divisão dos segundos informados por 1 hora em segundos(3600), tudo isso será dividido por 60 e o resto serão os segundos
			escreva ("\n O evento durou: ",horas, " horas, ",minutos, " minutos e ",segundo, " segundos.") 
	}
		 */
		int segundos = 0;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = tec.nextInt();
		int horas = segundos/3600;
		int minutos = (segundos%3600)/60;
		int segundo = (segundos%3600)%60;
		System.out.printf("\n O evento durou %d horas, %d minutos %d segundos ", horas, minutos, segundo);
				
		
		tec.close();

	}
}
