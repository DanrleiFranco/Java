package biblioteca;

public class Livro {
	private String titulo;
	private String autor;
	private String isbn;
	private String ano;
	private String editora;
	private boolean emprestado = false;
			
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Livro (String titulo, String autor, String isbn, String ano, String editora) {
		this.setTitulo(titulo);
		this.autor = autor;
		this.isbn = isbn;
		this.ano = ano;
		this.editora = editora;
	}
	
	public void meEmprestar () {
		this.setEmprestado(true);
		setEmprestado(true);
	}
	
	public void meDevolver () {
		this.setEmprestado(false);
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}