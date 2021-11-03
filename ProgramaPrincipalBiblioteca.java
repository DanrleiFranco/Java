package biblioteca;

import java.util.Scanner;

public class ProgramaPrincipalBiblioteca {
	
	static Scanner leitor = new Scanner (System.in);
	
	public static int selecionarItemMenu () {
		
System.out.println ("\n");
System.out.println ("                        ____________________________");
System.out.println ("  			|  SELECIONE UMA OPÇÃO:    |  ");
System.out.println ("                        ____________________________");
System.out.println ("                        |0 - Sair                  |");
System.out.println ("			|1 - Cadastrar um livro    |");
System.out.println ("			|2 - Remover um livro      |");
System.out.println ("			|3 - Emprestar livro       |");
System.out.println ("			|4 - Devolver livro        |");
System.out.println ("			|5 - Listar disponíveis    |");
System.out.println ("			|6 - Listar emprestados    |");
System.out.println ("                        ____________________________");
		int valor = leitor.nextInt ();
		leitor.nextLine ();
		return valor;
	}
		
	public static void main (String [] args) {
		Biblioteca bibliotecaCameta = new Biblioteca ();
		int menu;
		while ((menu = selecionarItemMenu ()) != 0) {
			if (menu != 1 || menu != 2 || menu != 3 || menu != 4 || menu != 5 || menu != 6) System.out.println ("OPÇÃO INVÁLIDA !");
			else if (menu == 1) bibliotecaCameta.cadastraLivro ();
			else if (menu == 2) bibliotecaCameta.removerLivro ();
			else if (menu == 3) bibliotecaCameta.emprestarLivro ();
			else if (menu == 4) bibliotecaCameta.devolverLivro ();
			else if (menu == 5) bibliotecaCameta.listarLivrosDisponiveis ();
			else if (menu == 6) bibliotecaCameta.listarLivrosEmprestados ();
		}
	}
}