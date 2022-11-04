package Com.AttvHeranca.Conta01;

public class contaEspecial extends Conta {
	
	public contaEspecial(String banco){
		super(banco);
	}
	
	
	private int diasSemJuros;
	private double limite;
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	public String toString() {
		return super.toString()+"contaEspecial [diasSemJuros=" + diasSemJuros + ", limite="
				+ limite + "]";
	}
	
	
	
}
