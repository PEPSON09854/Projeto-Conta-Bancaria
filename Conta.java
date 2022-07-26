package desafioContaBancaria;

public abstract class Conta implements InterfaceConta {
	
	private static int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;

	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	Conta(Cliente cliente){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	@Override
	public void sacar(double valor) {
		
		this.saldo -= valor;
		
		
	}



	@Override
	public void depositar(double valor) {
		
		this.saldo += valor;
		
		
	}



	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		
	}
	
	
	
	
	public int getAgencia() {
		return agencia;
	}

	

	public int getNumeroConta() {
		return numeroConta;
	}

	

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	protected void informacoesConta() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f\n", this.saldo));
	}


	
	



}
