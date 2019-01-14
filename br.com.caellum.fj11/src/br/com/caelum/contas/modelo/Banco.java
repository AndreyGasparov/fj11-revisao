package br.com.caelum.contas.modelo;

import java.util.*;

public class Banco {
	private String nome;
	private int numero;
	// private Conta[] contas;
	// private List<Conta> contas;
	// private Map<String, Conta> contas;
	private HashSet<Conta> contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		// this.contas = new ContaCorrente[10];
		// this.contas = new ArrayList<>();
		// this.contas = new HashMap<>();
		this.contas = new HashSet<>();
	}

	public Banco(String nome, int numero, Conta[] contas) {
		super();
		this.nome = nome;
		this.numero = numero;
		// this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	// public Conta[] getContas() {
	// return contas;
	// }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// public void setContas(Conta[] contas) {
	// this.contas = contas;
	// }

	public void adiciona(Conta c) {
		contas.add(c);
		// contas.put(c.getTitular(), c);
	}

	// public void pega(int x) {
	// contas.get(x);
	// }

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}

	public void buscaPorTitular(String nomeDoTitular) {
		// contas.equals(nomeDoTitular);
		// contas.get(nomeDoTitular);
	}

}
