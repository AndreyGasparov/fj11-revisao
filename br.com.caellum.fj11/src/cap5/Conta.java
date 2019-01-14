package cap5;

class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	public Conta(){
		System.out.println("Construtur chamado.");
	}
	public Conta(String titular){
		this.titular = titular;
	}
	void saca(double valor){
		saldo = saldo - valor;
	}
	void deposita(double valor){
		saldo = saldo + valor;
	}
	double calculaRendimento(){
		return saldo*0.1;
	}
    String recuperaDadosParaImpressao(){
		String dados = "Titular: " + titular + ", numero: " + numero + ", agencia: " + agencia + ", data: " + dataDeAbertura.formatada();
		return dados;
	}
	public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo=saldo;
	}
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero=numero;
	}
	public String getAgencia(){
		return agencia;
	}
	public void setAgencia(String agencia){
		this.agencia=agencia;
	}
	public Data getDataDeAbertura(){
		return dataDeAbertura;
	}
	public void setDataDeAbertura(Data dataDeAbertura){
		this.dataDeAbertura=dataDeAbertura;
	}
  }
  