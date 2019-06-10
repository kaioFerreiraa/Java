package entities;

public class Didaticos extends Livro{
	private String autor;
	
	public Didaticos(String titulo, String autor) {
		super(titulo);
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
}
