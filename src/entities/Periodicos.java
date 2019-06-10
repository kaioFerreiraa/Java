package entities;

public class Periodicos extends Livro {
	private Integer volume;
	private Integer numeroDeEmprestimos;
	
	public Periodicos(String titulo, int volume) {
		super(titulo);
		this.volume = volume;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void RegistrarEmprestimo(Usuario usuario) {
		if (this.numeroDeEmprestimos == 100) this.catalogo = false;
		else {
			this.numeroDeEmprestimos += 1;
			this.emprestimo(usuario);
		}
	}
	
	
}
