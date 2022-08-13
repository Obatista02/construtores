package entities;

public class Banco {

	private int numConta;
	private String tituConta;
	private double saldo;

	public Banco() {

	}

	public Banco(int numConta, String tituConta) {
		this.numConta = numConta;
		this.tituConta = tituConta;

	}
	public Banco(int numConta, String tituConta, double inicialSaldo) {
		this.numConta = numConta;
		this.tituConta = tituConta;
		deposito (inicialSaldo);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTituConta() {
		return tituConta;
	}

	public void setTituConta(String tituConta) {
		this.tituConta = tituConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(double valorDep) {
		saldo += valorDep;
	}

	public void saque(double valorDep) {
		saldo -= valorDep + 5;
	}

	public String toString() {
		return " Titular " + tituConta + ", Numero da conta " + numConta + ", Saldo " + saldo;
	}
}
