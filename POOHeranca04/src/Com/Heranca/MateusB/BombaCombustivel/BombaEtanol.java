package Com.Heranca.MateusB.BombaCombustivel;

public class BombaEtanol extends BombaCombustivel {

	public BombaEtanol (double totalL, double valorL){
		super(totalL,valorL);
		setValorL(valor);
	}
	
	private double valor = 3.29;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return super.toString()+"BombaEtanol [valor=" + valor + "]";
	}
	
	
	
}
