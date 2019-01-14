package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Inciando...");
//		Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
