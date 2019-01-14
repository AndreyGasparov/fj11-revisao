package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	Conta conta;
	/*
	public void criaConta(Evento evento){
		this.conta = new Conta();
		this.conta.setTitular("Batman");
	     // faça o mesmo para os outros atributos
	}
	*/
	public void criaConta(Evento evento){
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
	    	this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
	    	this.conta = new ContaPoupanca();
		}
		this.conta.setAgencia(evento.getInt("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}
	public void deposita(Evento evento){
		//double valorDigitado = evento.getDouble("valor");
		//this.conta.deposita(valorDigitado);
		double valor = evento.getDouble("valorOperacao");
		/*
		if (this.conta.getTipo().equals("Conta Corrente")){
	        this.conta.deposita(valor);
	    } else {
	        this.conta.deposita(valor);
	    }
	     */
		this.conta.deposita(valor);
		
	}
	public void saca(Evento evento){
		//double valorDigitado = evento.getDouble("valor");
		//this.conta.saca(valorDigitado);
		double valor = evento.getDouble("valorOperacao");
		/*
		if (this.conta.getTipo().equals("Conta Corrente")){
	         this.conta.saca(valor);
	    } else {
	         this.conta.saca(valor);
	    }
	    */
		this.conta.saca(valor);
		
	}
	public void transfere(Evento evento) {
	     Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
	     conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	
	public void ordenaLista(Evento evento) {
	       List<Conta> contas = evento.getLista("destino");
	       Collections.sort(contas);
	}
}
