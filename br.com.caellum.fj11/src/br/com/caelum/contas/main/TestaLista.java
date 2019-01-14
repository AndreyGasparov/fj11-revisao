
package br.com.caelum.contas.main;

import java.util.*;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {
//		List<Conta> contas = new ArrayList<>(); //ArrayList
		List<Conta>	contas = new LinkedList<>(); //LinkedList
		Random rnd = new Random();
		
		
		for (int i = 0; i < 10; i++) {
			Conta account = new ContaCorrente();
			account.deposita(rnd.nextInt(999));		
			contas.add(account);
//			System.out.println("Conta "+(i+1)+" - R$ "+account.getSaldo());
		}
		System.out.println(contas);
	}

}
