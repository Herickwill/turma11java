package br.com.generation.app;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import br.com.generation.classes.ContaCorrente;
import br.com.generation.classes.ContaPoupanca;
import br.com.generation.classes.*;


public class Processamento {
		public static void main (String [] args) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int mesAtual = localDate.getMonthValue();	
		Scanner leia = new Scanner (System.in);
		
		int opcInicial;
		int tipoConta;
		String nomeCliente;
		int contadorCC = 0;
		
		

		
		System.out.println("***** Bem Vindo ao InternetBanking! *****");
		
		do {
		System.out.println("O que deseja fazer? \n1- Criar conta \n2- Sair");
		opcInicial = leia.nextInt();
		
		 
		
		if (opcInicial == 1) {
			pularLinha();
			System.out.println("Qual o seu nome?");
			nomeCliente= leia.next();
			pularLinha();
			System.out.println(nomeCliente+", que tipo de conta você deseja criar? \n1 - Conta Corrente \n2 - Conta Poupança \n3 - Conta Empresarial");
			tipoConta = leia.nextInt();
			if (tipoConta == 1) {
				pularLinha();
				System.out.println("Você escolheu criar uma conta corrente.");
				ContaCorrente clienteCC = new ContaCorrente(nomeCliente, Integer.toString(gerarConta()));
				System.out.println("Sua conta corrente foi criada com sucesso.");
				System.out.println("Você quer fazer um depósito inicial? Sim ou Não?");
				char opcDeposito = leia.next().toUpperCase().charAt(0);
				
					if (opcDeposito == 'S') {
						System.out.println("Digite o valor do primeiro depósito: ");
						double primeiroDeposito = leia.nextDouble();
						clienteCC.depositar(primeiroDeposito);
						int x = 0;
						while (x!=5) {
						x = menuCC();
						if (x == 1) {
							clienteCC.emiteExtrato();
						} else if (x==2) {
							System.out.println("Digite o valor a depositar: ");
							double valorDepositar = leia.nextDouble();
							clienteCC.depositar(valorDepositar);
						}
						else if (x==3) {
							System.out.println("Digite o valor a sacar: ");
							double valorSacar = leia.nextDouble();
							clienteCC.sacar(valorSacar);
						}
						else if (x==4) {
							System.out.println("Digite o valor do cheque: ");
							double valorCheque = leia.nextDouble();
							System.out.println("Digite o nome do beneficiario: ");
							String nomeBeneficiario = leia.next();
							clienteCC.emitirTalonario(valorCheque, nomeBeneficiario);
						}
						else if (x==5) {
							System.out.println("Operação finalizada.");
						}
						else {
							System.out.println("Número invalido.");
						}
						}
					} else {
						
						//menuCC();
						int y = 0;
						while (y!=5) {		
						y = menuCC();
						if (y == 1) {
							clienteCC.emiteExtrato();
						} else if (y==2) {
							System.out.println("Digite o valor a depositar: ");
							double valorDepositar = leia.nextDouble();
							clienteCC.depositar(valorDepositar);
						}
						else if (y==3) {
							System.out.println("Digite o valor a sacar: ");
							double valorSacar = leia.nextDouble();
							clienteCC.sacar(valorSacar);
						}
						else if (y==4) {
							System.out.println("Digite o valor do cheque: ");
							double valorCheque = leia.nextDouble();
							System.out.println("Digite o nome do beneficiario: ");
							String nomeBeneficiario = leia.next();
							clienteCC.emitirTalonario(valorCheque, nomeBeneficiario);
						}
						else if (y==5) {
							System.out.println("Operação finalizada.");
						}
						else {
							System.out.println("Número invalido.");
						}
					
					}
				}		
			}
			else if (tipoConta == 2) {
				pularLinha();
				System.out.println("Você escolheu criar uma conta poupança.");
				System.out.println("Digite seu mês de aniversário, em número inteiro: ");
				int aniversario = leia.nextInt();
				ContaPoupanca clienteCP = new ContaPoupanca(nomeCliente, Integer.toString(gerarConta()), aniversario);
				System.out.println("Sua conta poupança foi criada com sucesso.");
				System.out.println("Gostaria de realizar um deposito inicial? Sim ou Não?");
				char opcDeposito = leia.next().toUpperCase().charAt(0);
				if (opcDeposito == 'S') {
					System.out.println("Digite o valor do primeiro depósito: ");
					double primeiroDeposito = leia.nextDouble();
					clienteCP.depositar(primeiroDeposito);
					int x = 0;
					while (x!=5) {
					x = menuCP();
					if (x == 1) {
						clienteCP.emiteExtrato();
					} else if (x==2) {
						System.out.println("Digite o valor a depositar: ");
						double valorDepositar = leia.nextDouble();
						clienteCP.depositar(valorDepositar);
					}
					else if (x==3) {
						System.out.println("Digite o valor a sacar: ");
						double valorSacar = leia.nextDouble();
						clienteCP.sacar(valorSacar);
					}
					else if (x==4) {
						clienteCP.correcaoAniversario(mesAtual);
					}
					else if (x==5) {
						System.out.println("Operação finalizada.");
					}
					else {
						System.out.println("Número invalido.");
					}
					}
				} else {
					
					//menuCC();
					int y = 0;
					while (y!=5) {		
					y = menuCP();
					if (y == 1) {
						clienteCP.emiteExtrato();
					} else if (y==2) {
						System.out.println("Digite o valor a depositar: ");
						double valorDepositar = leia.nextDouble();
						clienteCP.depositar(valorDepositar);
					}
					else if (y==3) {
						System.out.println("Digite o valor a sacar: ");
						double valorSacar = leia.nextDouble();
						clienteCP.sacar(valorSacar);
					}
					else if (y==4) {
						clienteCP.correcaoAniversario(mesAtual);
					}
					else if (y==5) {
						System.out.println("Operação finalizada.");
					}
					else {
						System.out.println("Número invalido.");
					}
				}
			}		
				
		}
			else if (tipoConta == 3) {
				pularLinha();
				System.out.println("Você escolheu criar uma conta empresarial.");
				System.out.println(nomeCliente+", qual o nome da sua empresa?");
				String nomeEmpresa = leia.next();
				ContaEmpresa clienteCE = new ContaEmpresa(nomeEmpresa,Integer.toString(gerarConta()));
				System.out.println("A conta empresarial foi criada com sucesso. \nDeseja realizar algum depósito inicial? Sim ou Não?");
				char opcDeposito = leia.next().toUpperCase().charAt(0);
				if (opcDeposito == 'S') {
					System.out.println("Digite o valor do primeiro depósito: ");
					double primeiroDeposito = leia.nextDouble();
					clienteCE.depositar(primeiroDeposito);
					int x = 0;
					while (x!=5) {
					x = menuCE();
					if (x == 1) {
						clienteCE.emiteExtrato();
					} else if (x==2) {
						System.out.println("Digite o valor a depositar: ");
						double valorDepositar = leia.nextDouble();
						clienteCE.depositar(valorDepositar);
					}
					else if (x==3) {
						System.out.println("Digite o valor a sacar: ");
						double valorSacar = leia.nextDouble();
						clienteCE.sacar(valorSacar);
					}
					else if (x==4) {
						System.out.println("Limite disponivel de emprestimo: R$"+clienteCE.getLimiteEmpresa());
						System.out.println("Digite o valor desejado de empréstimo: ");
						double valorEmprestimo = leia.nextDouble();
						clienteCE.emprestimo(valorEmprestimo);
					}
					else if (x==5) {
						System.out.println("Operação finalizada.");
					}
					else {
						System.out.println("Número invalido.");
					}
					}
				} else {
					
					//menuCC();
					int y = 0;
					while (y!=5) {		
					y = menuCE();
					if (y == 1) {
						clienteCE.emiteExtrato();
					} else if (y==2) {
						System.out.println("Digite o valor a depositar: ");
						double valorDepositar = leia.nextDouble();
						clienteCE.depositar(valorDepositar);
					}
					else if (y==3) {
						System.out.println("Digite o valor a sacar: ");
						double valorSacar = leia.nextDouble();
						clienteCE.sacar(valorSacar);
					}
					else if (y==4) {
						System.out.println("Limite disponivel de emprestimo: R$"+clienteCE.getLimiteEmpresa());
						System.out.println("Digite o valor desejado de empréstimo: ");
						double valorEmprestimo = leia.nextDouble();
						clienteCE.emprestimo(valorEmprestimo);
					}
					else if (y==5) {
						System.out.println("Operação finalizada.");
					}
					else {
						System.out.println("Número invalido.");
					}
				}
			}						
		}
	}
		
		
		
	
		
	}while(opcInicial!=2);
		} 
		public static void pularLinha() {
			for (int x = 0; x<40; x++) {
				System.out.println();
			}
		}
		public static int gerarConta() {
			Random aleatorio = new Random();
			int valor = aleatorio.nextInt((9999 - 1000) + 1) + 1000;
			return valor;
			}
		public static int menuCC() {
			Scanner leia = new Scanner(System.in);
			int opc;
			System.out.println("O que você deseja fazer? \n1- Extrato \n2- Depositar \n3- Sacar \n4- Emitir Talonario \n5- Sair");
			opc = leia.nextInt();
			if (opc == 1) {
				return 1;
			} else if (opc == 2) {
				return 2;
			}else if (opc == 3) {
				return 3;
			}else if (opc == 4) {
				return 4;
			}else if (opc == 5) {
				return 5;
			}return 6;
			
		}
		
		public static int menuCP() {
			Scanner leia = new Scanner(System.in);
			int opc;
	
			
			System.out.println("O que você deseja fazer? \n1- Extrato \n2- Depositar \n3- Sacar \n4- Verificar correção monetária \n5- Sair");
			opc = leia.nextInt();
			if (opc==1) {
				return 1;
			}
			else if (opc==2) {
				return 2;
			}
			else if (opc==3) {
				return 3;
			}
			else if (opc==4) {
				return 4;
			}
			else if (opc ==5) {
				return 5;
			}
			return 6;
			
		}
		public static int menuCE() {
			Scanner leia = new Scanner(System.in);
			int opc;
			System.out.println("O que você deseja fazer? \n1- Extrato da empresa \n2- Depositar \n3- Sacar \n4- Pedir emprestimo \n5- Sair");
			opc = leia.nextInt();
			if (opc==1) {
				return 1;
			}
			else if (opc==2) {
				return 2;
			}
			else if (opc==3) {
				return 3;
			}
			else if (opc==4) {
				return 4;
			}
			else if (opc ==5) {
				return 5;
			}
			return 6;
		}
}
