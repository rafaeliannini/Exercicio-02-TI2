package com.ti2cc;
import java.util.Scanner;

public class Principal {
	public static void Listar() {
		DAO dao = new DAO();
		dao.conectar();
		
		System.out.println("==== Listar carros === ");
		Carro[] carros = dao.getCarros();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
	
	public static void Inserir(int codigo, String marca, String modelo, int ano) {
		DAO dao = new DAO();
		dao.conectar();
		
		Carro carro = new Carro(codigo, marca, modelo, ano);
		if(dao.inserirCarro(carro)) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}
		
		dao.close();
	}
	
	public static void Excluir(int codigo) {
		DAO dao = new DAO();
		dao.conectar();
		
		 if (dao.excluirCarro(codigo)) {
             System.out.println("Carro excluído com sucesso.");
         } else {
             System.out.println("Erro ao excluir o carro.");
         }
		
		dao.close();
	}
	
	public static void Atualizar(int codigo, String marca, String modelo, int ano) {
		DAO dao = new DAO();
		dao.conectar();
		
		Carro carro = new Carro(codigo, marca, modelo, ano);
		
		if (dao.atualizarCarro(carro)) {
            System.out.println("Atualizado com sucesso -> " + carro.toString());
        } else {
            System.out.println("Erro ao atualizar o carro.");
        }
		
		dao.close();
	}
	public static void main(String[] args) {	
		DAO dao = new DAO();
		dao.conectar();
		
		int op=0, codigo, ano;
		String marca, modelo;
		
		Scanner scanner = new Scanner(System.in);
		
		while (op != 5) {
			if(op !=5) {
				System.out.println("Escolha a sua opção");
				System.out.println("1 - Listar");
				System.out.println("2 - Inserir");
				System.out.println("3 - Excluir");
				System.out.println("4 - Atualizar");
				System.out.println("5 - Sair");
				op = scanner.nextInt();
				scanner.nextLine();
				if(op == 1) {
					Listar();
				}
				else if(op == 2) {
					System.out.println("Digite o código do carro a ser inserido:");
					codigo = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Digite a marca do carro a ser inserido:");
					marca = scanner.nextLine();
					System.out.println("Digite o modelo do carro a ser inserido:");
					modelo = scanner.nextLine();
					System.out.println("Digite o ano do carro a ser inserido:");
					ano = scanner.nextInt();
					scanner.nextLine();
					Inserir(codigo, marca, modelo, ano);
				}
				else if(op == 3) {
					System.out.println("Digite o código do carro a ser excluido:");
					codigo = scanner.nextInt();
					scanner.nextLine();
					Excluir(codigo);
				}
				else if(op == 4) {
					System.out.println("Digite o código do carro a ser atualizado:");
					codigo = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Digite a marca do carro a ser atualizado:");
					marca = scanner.nextLine();
					System.out.println("Digite o modelo do carro a ser atualizado:");
					modelo = scanner.nextLine();
					System.out.println("Digite o ano do carro a ser atualizado:");
					ano = scanner.nextInt();
					scanner.nextLine();
					Atualizar(codigo, marca, modelo, ano);
				}
			}
		}
		
		dao.close();
        scanner.close();
	}
}