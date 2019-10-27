package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome; ");
		String nome = sc.nextLine();
		System.out.print("Preco: ");
        double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);		
		System.out.println(produto);
		
		System.out.println("Entre com o numero de produtos para adicionar no estoque: ");
		
		quantidade = sc.nextInt();
		
		produto.adicionarproduto(quantidade);
		
		System.out.println(produto);

		
		System.out.println("Entre com o numero de produtos para remover do estoque: ");
		
		quantidade = sc.nextInt();
		
		produto.removerproduto(quantidade);

		System.out.println(produto);
		
		sc.close();
	}

}
