package entities;

public class Professor extends Usuario {
	private String departamento;
	
	public Professor(String nome, int cpf, String departamento) {
		super(nome, cpf);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}

	@Override
	public void atualizarSaldo(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void atualizarMulta() {
		// TODO Auto-generated method stub
		atualizarSaldo(-2.0);
	}

	@Override
	public void verificarDevedor() {
		// TODO Auto-generated method stub
		this.devedor = (this.saldo < -10.0);
	}
	
	
}
