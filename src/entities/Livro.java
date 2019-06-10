package entities;

public abstract class Livro {
	protected String titulo;
	protected boolean catalogo;
	protected Usuario usuario;
	
	public Livro(String titulo) {
		this.titulo = titulo;
		this.catalogo = true;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public boolean getCatalogo() {
		return this.catalogo;
	}
	
	public void emprestimo(Usuario usuario) {
		this.usuario = usuario;
		this.catalogo = false;
	}
	
	public String toString() {
		return "Titulo: " + this.titulo + ", Catalogo: " + this.catalogo;
	}
}
