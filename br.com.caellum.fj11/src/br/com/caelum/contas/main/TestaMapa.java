package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita(9999);

		Conta c2 = new ContaCorrente();
		c1.deposita(8888);

//		Map mapaDeContas = new HashMap();
		Map <String, Conta> mapaDeContas = new HashMap<>();

		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}
