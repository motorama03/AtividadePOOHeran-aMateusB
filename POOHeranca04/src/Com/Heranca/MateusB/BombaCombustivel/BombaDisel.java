package Com.Heranca.MateusB.BombaCombustivel;

public class BombaDisel extends BombaCombustivel {
	
	public BombaDisel (double totalL, double valorL){
		super(totalL,valorL);
		setValorL(valor);
	}
	
	private double valor = 5.39;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return super.toString()+"BombaDisel [valor=" + valor + "]";
	}
	
	
	
}
