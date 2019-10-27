package entities;

public class ContaNegocio extends Conta{

	private Double LimiteEmprestimo;

	public ContaNegocio() {
		super();
	}
	
	public ContaNegocio(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		LimiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo (double valor) {
		if (valor <= LimiteEmprestimo) {
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
	
}
