package Com.Heranca.MateusB.BombaCombustivel;

public class BombaGasolina extends BombaCombustivel {
	
	public BombaGasolina(double totalL, double valorL){
		super(totalL,valorL);
		setValorL(valor);
	}
	
	private double valor = 4.29;

	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	public String toString() {
		return super.toString()+"BombaGasolina [valor=" + valor + "]";
	}
	
	
	
}
