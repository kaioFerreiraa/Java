package entities;

public class Estudante extends Usuario{
	private String curso;

	public Estudante (String nome, int cpf, String curso) {
		super(nome, cpf);
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void atualizarMulta() {
		atualizarSaldo(-1.0);
	}

	public void atualizarSaldo(double valor) {
		this.saldo += valor;
	}

	public void verificarDevedor() {
		if (this.saldo < 0) this.devedor = true;
	}

	

	
}
