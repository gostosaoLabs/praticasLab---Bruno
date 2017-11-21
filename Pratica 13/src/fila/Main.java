package fila;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Fila a = new Fila();
		int escolha = 0;
		while(escolha != 3) {
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Sair e imprimir");
		
		escolha = Integer.parseInt(scanner.nextLine());
		
		if(escolha == 1)
		{
			System.out.println("Digite o número desejado");
			int numero = Integer.parseInt(scanner.nextLine());
			a.insere(numero);
		}
		else if(escolha == 2)
		{
			a.remove();
		}
		else 
		{
			a.imprimir();
		}
		
		
		}	

	}

}
