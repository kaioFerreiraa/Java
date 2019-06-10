package entities;

public abstract class Usuario {
	protected String nome;
	protected Integer cpf;
	protected Integer codigo;
	protected Double saldo;
	protected boolean devedor;

	public Usuario(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean getDevedor() {
		return this.devedor;
	}	

	public abstract void atualizarSaldo(double valor);
	
	public abstract void atualizarMulta();

	public abstract void verificarDevedor();
	
	public String toString() {
		return "Nome: " + this.nome + ", Cpf: " + this.cpf + ", Codigo: " + this.codigo +
				", Saldo: " + this.saldo + ", Devedor: " + this.devedor;
	}

}