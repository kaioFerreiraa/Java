package application;

import entities.*;

public class Main {
	public static void main(String[] args) {
		Biblioteca bicen = new Biblioteca();
		
		Professor[] professor = new Professor[3];
		professor[0] = new Professor("André Britto Carvalho", 345458345, "Departamento de Computação");
		professor[1] = new Professor("Henrique Nou Schneider", 2344353, "Departamento de Computação");
		professor[2] = new Professor("Gilton Ferreira", 34235435, "Departamento de Computação");
		
		Estudante[] estudante = new Estudante[2];
		estudante[0] = new Estudante("Kaio Henrique da Costa Ferreira", 475707229, "Ciência da Computação");
		estudante[1] = new Estudante("Joao Ferreira", 321434332, "Sistema da Informação");
		
		Didaticos[] livroDidatico = new Didaticos[2];
		livroDidatico[0] = new Didaticos("O Futuro da Internet", "Pyerre Levy");
		livroDidatico[1] = new Didaticos("Introduação a Teoria da Computação", "Michael Sipser");
		
		Periodicos periodico = new Periodicos("Arquiteturas de computadores", 4);
		
		bicen.CadastrarUsuario(professor[0]);
		bicen.CadastrarUsuario(professor[1]);
		bicen.CadastrarUsuario(professor[2]);
		bicen.CadastrarUsuario(estudante[0]);
		bicen.CadastrarUsuario(estudante[1]);
		
		bicen.cadastrarLivro(livroDidatico[0]);
		bicen.doacaoDidaticos(professor[0], livroDidatico[1]);
		bicen.doacaoPeriodicos(professor[1], periodico);
		
		if (bicen.registrarEmprestimo(3, 1)) {
			System.out.println("Livro: " + bicen.getLivro().get(1).getTitulo() + " emprestado para o " + bicen.getUsuario().get(3).getNome());
		} else System.out.println("Erro");

		System.out.println();
		
		if (bicen.registrarEmprestimo(4, 2)) {
			System.out.println("Livro: " + bicen.getLivro().get(2).getTitulo() + " emprestado para o " + bicen.getUsuario().get(4).getNome());
		} else System.out.println("Erro");
		
		System.out.println();
		
		bicen.efetuarMulta(0);
		
		System.out.println();
		
		bicen.doadores();
		
		System.out.println();
		
		bicen.usuarios();
		
		System.out.println();
		
		bicen.livros();
		
		
	}
}
