package Com.Heranca.MateusB.Animal;

public class Tartaruga extends Reptil {
	
	public Tartaruga(String tipoAlimentacao, String habitat){
		super(tipoAlimentacao, habitat);
	}
	
	
	
	private double tamanho;

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	
	
	public String toString() {
		return super.toString()+"Tartaruga [tamanho=" + tamanho + "]";
	}
	
}
