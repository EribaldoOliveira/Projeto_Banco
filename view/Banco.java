package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Conta;

public class Banco {

	static String nome = "Banco Eri";
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Conta> contas;
	
	
	public static void main(String[] args) {
		Banco.contas = new ArrayList<Conta>();
		Banco.menu();
	
		teclado.close();
		
	}
	
}
