package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];

		for (int i = 0; i < contas.length; i++) {
		   Conta conta = new ContaCorrente();
		   conta.deposita(i * 100.0);
		   // escreva o c�digo para guardar a conta na posi��o i do array
		}
	}
}
