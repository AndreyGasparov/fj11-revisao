package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public abstract class Conta implements Comparable<Conta> {
	private String titular;
	private int numero;
	private int agencia;
	protected double saldo;

	// private Data dataDeAbertura;
	public Conta() {
		titular = " ";
		// System.out.println("Construtor chamado.");
	}

	public Conta(String titular) {
		this.titular = titular;
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= (valor + 0.10);
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	double calculaRendimento() {
		return saldo * 0.1;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	/*
	 * String dados = "Titular: " + titular + ", numero: " + numero + ", agencia: "
	 * + agencia + ", data: " + dataDeAbertura.formatada(); return dados; }
	 */
	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/*
	 * public Data getDataDeAbertura(){ return dataDeAbertura; } public void
	 * setDataDeAbertura(Data dataDeAbertura){ this.dataDeAbertura=dataDeAbertura; }
	 */
	public abstract String getTipo();

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	public String toString() {
		return titular.toUpperCase();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
}
