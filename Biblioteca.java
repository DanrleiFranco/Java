package biblioteca;

import java.util.Scanner;

public class Biblioteca {

	static Scanner leitor = new Scanner(System.in);
	Livro[] biblioteca = new Livro[3]; // quantidade de livros na biblioteca,
	// acima disso, o prgrama avisará que que a biblioteca está cheia.

	public void cadastraLivro() {
		System.out.println("insira o título");
		String titulo = leitor.nextLine();
		System.out.println("insira o nome do autor");
		String autor = leitor.nextLine();
		System.out.println("insira o isbn do livro");
		String isbn = leitor.nextLine();
		System.out.println("insira o ano de edição");
		String ano = leitor.nextLine();
		System.out.println("insira o nome da editora");
		String editora = leitor.nextLine();
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] == null) {
				biblioteca[i] = new Livro(titulo, autor, isbn, ano, editora);
				System.out.println("LIVRO CADASTRADO COM SUCESSO !");
				return;
			}
		}
		System.out.println("BIBLIOTECA CHEIA, NÃO SERÁ POSSÍVEL INSERIR O LIVRO");
	}

	public void removerLivro() {
			System.out.println("Digite a posição do livro a ser removido: ");
			int posicao = leitor.nextInt();
		if (posicao >= biblioteca.length || biblioteca[posicao] == null) {
			System.out.println(" O LIVRO DA POSIÇÃO " + posicao + " NÃO EXISTE OU A BIBLIOTECA ESTÁ SEM LIVROS !");
			return;
		} else {
			biblioteca[posicao] = null;
			System.out.println(" LIVRO REMOVIDO COM SUCESSO !");
		}
	}

	public void listarLivrosEmprestados() {
		int naoEmprestado = 0;
		System.out.println("LIVROS EMPRESTADOS:");
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] != null && biblioteca[i].isEmprestado() == true) {
				System.out.println("  LIVRO POemprestadoSIÇÃO: [" + i + "]" + "\n  TÍTULO: " + biblioteca[i].getTitulo()
						+ "\n  AUTOR(a): " + biblioteca[i].getAutor() + "\n  ISBN: " + biblioteca[i].getIsbn()
						+ "\n  ANO: " + biblioteca[i].getAno() + "\n  EDITORA: " + biblioteca[i].getEditora() + "\n");
				naoEmprestado++;
			} 
		}
		if (naoEmprestado == 0) {
			System.out.println(" A BIBLIOTECA NÃO POSSUI LIVROS EMPRESTADOS !");
		}
	}

	public void listarLivrosDisponiveis() {
		int indisponiveis = 0;
		System.out.println("LIVROS DISPONÍVEIS:");
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] != null && biblioteca[i].isEmprestado() == false) {
				System.out.println("   LIVRO POSIÇÃO: [" + i + "]" + "\n   TÍTULO: " + biblioteca[i].getTitulo()
						+ "\n   AUTOR(a): " + biblioteca[i].getAutor() + "\n   ISBN: " + biblioteca[i].getIsbn()
						+ "\n   ANO: " + biblioteca[i].getAno() + "\n   EDITORA: " + biblioteca[i].getEditora() + "\n");
				indisponiveis++;
			}
		}
		if (indisponiveis == 0) {
			System.out.println(" A BIBLIOTECA NÃO POSSUI LIVROS DISPONÍVEIS OU CADASTRADOS !");
		}
	}

	public void devolverLivro() {
		System.out.println("insira a posição do livro a ser devolvido:");
		int posicao = leitor.nextInt();
		leitor.nextLine();
		if (posicao >= biblioteca.length || biblioteca[posicao] == null) {
			System.out.println(" O LIVRO DA POSIÇÃO " + posicao + " NÃO EXISTE !");
			return;
		} else {
			if (biblioteca[posicao].isEmprestado() == false) {
				System.out.println(" O LIVRO DA POSIÇÃO " + posicao + " JÁ É DISPONÍVEL !");
				return;
			} else {
				biblioteca[posicao].setEmprestado(false);
				System.out.println(" LIVRO DEVOLVIDO COM SUCESSO !");
			}
		}
	}

	public void emprestarLivro() {
		System.out.println("Insira a posição do livro a ser emprestado");
		int posicao = leitor.nextInt();
		leitor.nextLine();
		if (posicao >= biblioteca.length || biblioteca[posicao] == null) {
			System.out.println(" O LIVRO DA POSIÇÃO " + posicao + " NÃO EXISTE !");
			return;
		} else {
			if (biblioteca[posicao].isEmprestado() == true) {
				System.out.println(" O LIVRO DA POSIÇÃO "+ posicao +" JÁ FOI EMPRESTADO !");
				return;
			} else {
				biblioteca[posicao].setEmprestado(true);
				System.out.println(" LIVRO EMPRESTADO COM SUCESSO !");
			}
		}
	}
}