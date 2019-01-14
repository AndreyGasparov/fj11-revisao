package br.com.caelum.contas.cap15;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteContas {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.setNumero(123);
		c1.setAgencia(1);
		
		Conta c2 = new ContaCorrente();
		c2.setNumero(321);
		c2.setAgencia(2);
		
		
		

	}
}
