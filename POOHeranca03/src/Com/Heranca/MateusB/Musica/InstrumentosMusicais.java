package Com.Heranca.MateusB.Musica;

public class InstrumentosMusicais {

	private double valor;

	public InstrumentosMusicais(double valor){
		setValor(valor);
	}
	
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	public String toString() {
		return "InstrumentosMusicais [valor=" + valor + "] \n";
	}
}
