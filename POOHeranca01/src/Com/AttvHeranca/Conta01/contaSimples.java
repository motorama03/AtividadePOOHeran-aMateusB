package Com.AttvHeranca.Conta01;

public class contaSimples extends Conta {
	
	public contaSimples(String banco){
		super(banco);
	}

	private double saldoPoupanca;
	private double valorPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	// Deposito da Pouponça
	public String dPouponca(){
		StringBuilder saida = new StringBuilder();
	
		setSaldo(valorPoupanca + saldoPoupanca);
		saida.append(saldoPoupanca);
		
		return saida.toString();
	}
	
	// Saque poupança
	public String sPoupanca(){
		StringBuilder saida = new StringBuilder();
		
		setSaldo(saldoPoupanca - valorPoupanca);
		saida.append(saldoPoupanca);
		
		return saida.toString();
	}
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		
		saida.append(super.toString());
		saida.append("Saldo disponivel "+saldoPoupanca);
	
		return saida.toString();
	}
	
	
	
	
	
}
