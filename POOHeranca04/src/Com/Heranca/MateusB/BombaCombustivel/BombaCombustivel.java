package Com.Heranca.MateusB.BombaCombustivel;

public class BombaCombustivel {

	private double totalL;
	private double valorL;
	
	public BombaCombustivel(double totalL, double valorL){
		setTotalL(totalL);
		setValorL(valorL);
	}
	
	public double getTotalL() {
		return totalL;
	}
	public void setTotalL(double totalL) {
		this.totalL = totalL;
	}
	public double getValorL() {
		return valorL;
	}
	public void setValorL(double valorL) {
		this.valorL = valorL;
	}
	
	public String abastecerValor(){
		StringBuilder saida = new StringBuilder();
		saida.append("Total a pagar: "+valorL / totalL);
		
		return saida.toString();
	}
	
	public String abastecerLitro(){
		StringBuilder saida = new StringBuilder();
		saida.append("Total a pagar: "+totalL * valorL);
		
		return saida.toString();
	}
	
	public String toString() {
		return "BombaCombustivel [totalL=" + totalL + ", valorL=" + valorL +"]";
	}
}
