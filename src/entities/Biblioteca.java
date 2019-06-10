package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Usuario> usuario = new ArrayList<>();
	private List<Livro> livro = new ArrayList<>();
	private List<Doacao> doador = new ArrayList<>();
	
	public boolean CadastrarUsuario(Usuario usuario) {
		for(Usuario pessoa : this.usuario) {
			if(usuario.equals(pessoa)) {
				return false;
			}
		}
		
		usuario.setCodigo(this.usuario.size());
		this.usuario.add(usuario);
		
		return true;
	}
	
	public void cadastrarLivro(Livro livro) {
		this.livro.add(livro);
		System.out.println("Livro cadastrado com sucesso!");
	}
	
	public boolean registrarEmprestimo(int indiceUsuario, int indiceLivro) {
		if(this.usuario.get(indiceUsuario).devedor == false && this.livro.get(indiceLivro).catalogo == true) {
			this.livro.get(indiceLivro).emprestimo(this.usuario.get(indiceUsuario));
			return true;
		} else {
			return false;
		}
	}
	
	public void efetuarMulta(int indiceUsuario) {
		this.usuario.get(indiceUsuario).atualizarMulta();
		System.out.println("O " + this.usuario.get(indiceUsuario).nome + " foi multado.");
	}
	
	public void doacaoDidaticos(Professor professor, Didaticos livro) {
		Doacao doacao = new Doacao(professor, livro);
		this.doador.add(doacao);
		this.cadastrarLivro(livro);
	}
	
	public void doacaoPeriodicos(Professor professor, Periodicos livro) {
		Doacao doacao = new Doacao(professor, livro);
		this.doador.add(doacao);
		this.cadastrarLivro(livro);
	}

	public void doadores() {
		for(Doacao doador:this.doador) {
			System.out.println(doador);
		}
	}
	
	public List<Livro> getLivro() {
		return this.livro;
	}
	
	public List<Usuario> getUsuario() {
		return usuario;
	}
	
	public void usuarios() {
		for(Usuario usuario:this.usuario) {
			System.out.println(usuario);
		}
	}
	
	public void livros() {
		for(Livro livro:this.livro) {
			System.out.println(livro);
		}
	}
	
}
