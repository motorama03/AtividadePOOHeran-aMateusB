package Com.Heranca.MateusB.Animal;

public class Reptil extends Animal {

	public Reptil (String tipoAlimentacao, String habitat){
		super(tipoAlimentacao, habitat);
	}
	
	
	
	private boolean ovo;

	public boolean isOvo() {
		return ovo;
	}

	public void setOvo(boolean ovo) {
		this.ovo = ovo;
	}

	
	
	public String toString() {
		return super.toString()+"Reptil [ovo=" + ovo + "]";
	}
	
	
}
