package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private static ArrayList<Livros> livros = new ArrayList<>();
	
	public static void adicionarlivros(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livros(titulo, autor, anoPublicacao));
		System.out.println("Livro adicionado!");		
	}
	
	public static void consultarLivros() {
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
		} else {
			for (Livros livro : livros) {
				System.out.println(livro);
			}
		}
	}
	public static void apagarLivro(String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livros.remove(i);
				System.out.println("Livro removido!");
				return;
			}
		}
		System.out.println("Livro não encontrado.");
	}
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    int opcao;
	    
	    do {
	    	System.out.println("\n 1- Adicionar livro");
	    	System.out.println("2- Consultar livros");
	    	System.out.println("3- Apagar livro");
	    	System.out.println("4- Sair");
	    	System.out.println("Escolha uma opção: ");
	    	opcao = scanner.nextInt();
	    	scanner.nextLine();
	    	
	    	switch (opcao) {
	    		case 1: 
	    			System.out.println("Título: ");
	    			String titulo = scanner.nextLine();
	    			System.out.println("Autor: ");
	    			String autor = scanner.nextLine();
	    			System.out.println("Ano de publicação: ");
	    			int ano = scanner.nextInt();
	    			adicionarlivros(titulo, autor, ano);
	    			break;
	    			
	    		case 2:
	    			consultarLivros();
	    			break;
	    		case 3:
	    			System.out.println("Digite o título do livro a remover: ");
	    			String tituloRemover = scanner.nextLine();
	    			apagarLivro(tituloRemover);
	    			break;
	    		case 4: 
	    			System.out.println("Saindo...");
	    			break;
	    		default:
	    			System.out.println("Opção inválida!");	
	    	}
	    }while (opcao != 4);
	    scanner.close();
		
	}
}

   

