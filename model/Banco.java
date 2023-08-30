package model;

import java.util.ArrayList;
import java.util.Scanner;

import helper.Utils;

public class Banco {
	
	static String nome = "Eri Bank";
	static Scanner teclado = new Scanner (System.in);
	static ArrayList<Conta> contas;
	
	public static void main(String[] args) {
	
		Banco.contas = new ArrayList<Conta>();
		Banco.menu();

	}
	
	public static void menu() {
		int opcao = 0;
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		//System.out.println("=======================================");
		System.out.println("==================ATM==================");
		System.out.println("============== " + Banco.nome + " ===============");
		//System.out.println("=======================================");
		System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
		System.out.println("Selecione  uma opção no menu: ");
		System.out.println("1 - Criar Conta");
		System.out.println("2 - Efetuar saque");
		System.out.println("3 - Efetuar depósito");
		System.out.println("4 - Efetuar transferência");
		System.out.println("5 - Listar contas");
		System.out.println("6 - Sair do sistema");
		System.out.println();
		
		try {
			opcao = Integer.parseInt(Banco.teclado.nextLine());
		}catch(NumberFormatException e) {
			System.out.println(" Por favor informe uma opção válida.");
			Utils.pausar(1);
			Banco.menu();
		}
		
		switch (opcao) {
		case 1:
			Banco.criarConta();
			break;
			
		case 2:
			Banco.efetuarSaque();
			break;
			
		case 3:
			Banco.efetuarDepósito();
			break;
			
		case 4:
			Banco.efetuarTransferência();
			break;
		
		case 5:
			Banco.listarContas();
			break;
			
		case 6:
			System.out.println("Até a próxima!");
			Utils.pausar(2);
			System.exit(0);
			
			default:
				System.out.println("Opção inválida.");
				Utils.pausar(0);
				System.out.println();
				System.out.println("                ◄♦►                 ");
				System.out.println();
				Banco.menu();
				break;
		}
	}
	
	public static void criarConta() {
		System.out.println("Informw os dados do cliente");
		
		System.out.println("Nome do cliente: ");
		String nome = Banco.teclado.next();
		
		System.out.println("E-mail do cliente: ");
		String email = Banco.teclado.next();
		
		System.out.println("CPF do cliente: ");
		String cpf = Banco.teclado.next();
		
		System.out.println("Data de nascimento do cliente: ");
		String data_nascimento = Banco.teclado.next();
		
		Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(data_nascimento));
		//System.out.println(" ► Criando Conta...")

			Conta conta = new Conta(cliente);
			Banco.contas.add(conta);
			System.out.println("Conta criada com sucesso!");
			System.out.println("dados da conta criada");
			System.out.println(conta);
			System.out.println();
			
			Utils.pausar(2);
			Banco.menu();
			
		System.out.println("        ◄♦►");
	}
	
	public static void efetuarSaque() {
		System.out.println(" ► Efetuando Saque...");
		System.out.println("        ◄♦►");
	}
	
	public static void efetuarDepósito() {
		System.out.println(" ► Efetuando Depósito...");
		System.out.println("           ◄♦►");
	}
	
	public static void efetuarTransferência() {
		System.out.println(" ► Efetuando Transferência...");
		System.out.println("        ◄♦►");
	}
	
	public static void listarContas() {
		System.out.println(" ► listando Contas...");
		System.out.println("         ◄♦►");
	}
	
}
	
