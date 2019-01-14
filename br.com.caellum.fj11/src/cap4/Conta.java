package cap4;

class Conta {
	String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	
	void saca(double valor){
		setSaldo(getSaldo() - valor);
	}
	void deposita(double valor){
		setSaldo(getSaldo() + valor);
	}
	double calculaRendimento(){
		return getSaldo()*0.1;
	}
    String recuperaDadosParaImpressao(){
		String dados = "Titular: " + titular + ", numero: " + numero + ", agencia: " + agencia + ", data: " + getDataDeAbertura().formatada();
		return dados;
	}
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
	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
  }
  