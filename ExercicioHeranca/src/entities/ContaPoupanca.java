package entities;

public class ContaPoupanca extends Conta {
	
	private Double taxaInteresse;

	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaInteresse) {
		super(numero, titular, saldo);
		this.taxaInteresse = taxaInteresse;
	}

	public Double getTaxaInteresse() {
		return taxaInteresse;
	}

	public void setTaxaInteresse(Double taxaInteresse) {
		this.taxaInteresse = taxaInteresse;
	}
	
	public void autualizaSaldo () {
		saldo += saldo * taxaInteresse;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
}
