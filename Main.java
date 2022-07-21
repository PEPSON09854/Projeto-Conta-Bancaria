package desafioContaBancaria;

public class Main {

	public static void main(String[] args) {
		
	    Cliente pepson = new Cliente();
		pepson.setNome("Pepson Anderson");
		
		Conta corrente = new ContaCorrente(pepson);
		Conta poupanca = new ContaPoupanca(pepson);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
	    corrente.imprimirExtrato();
	    poupanca.imprimirExtrato();
		

	}

}
