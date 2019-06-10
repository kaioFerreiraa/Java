package entities;

public class Doacao {
	private Professor professor;
	private Didaticos livroDidatico;
	private Periodicos periodico;
	
	public Doacao(Professor professor, Didaticos livroDidatico) {
		this.professor = professor;
		this.livroDidatico = livroDidatico;
		this.professor.atualizarSaldo(30.0);
	}
	
	public Doacao(Professor professor, Periodicos periodico) {
		this.professor = professor;
		this.periodico = periodico;
		this.professor.atualizarSaldo(10.0);
	}
	
	public String doador() {
		return professor.getNome();
	}
	
	public String toString() {
		return "Doador: " + this.professor;
	}
	
}

