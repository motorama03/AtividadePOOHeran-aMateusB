package Com.Heranca.MateusB.Animal;

public class Largato extends Reptil {

	public Largato (String tipoAlimentacao, String habitat){
		super(tipoAlimentacao, habitat);
	}
	
	private double comprimento;

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String toString() {
		return super.toString()+"Largato [comprimento=" + comprimento + "]";
	}
	
	
	
}
