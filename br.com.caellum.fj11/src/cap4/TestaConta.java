package cap4;

class TestaConta {

    public static void main(String[] args) {
        /*
		Conta c1 = new Conta();

        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataDeAbertura = "04/06/2015";

        c1.deposita(100.0);
        System.out.println(c1.recuperaDadosParaImpressao()); 
		*/
		Conta c1 = new Conta();        
		c1.titular = "Danilo";
		c1.setSaldo(100);
		Data data = new Data();
		c1.setDataDeAbertura(data);

		Conta c2 = c1;
		//Conta c2 = new Conta();        
		//c2.titular = "Danilo";
		//c2.saldo = 100;

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");        
		}
		
		//Conta.saldo = 1234;
		//Conta.calculaRendimento();
		System.out.println(c1.getDataDeAbertura().formatada());
	
    }
  }