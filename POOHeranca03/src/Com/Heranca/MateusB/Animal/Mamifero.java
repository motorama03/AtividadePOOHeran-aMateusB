package Com.Heranca.MateusB.Animal;

public class Mamifero extends Animal {

	public Mamifero( String tipoAlimentacao, String habitat){
		super(tipoAlimentacao, habitat);
	}
	
	private String raca;
	private boolean leite;

	
	
	public boolean isLeite() {
		return leite;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setLeite(boolean leite) {
		this.leite = leite;
	}

	
	
	public String toString() {
		return super.toString()+"Mamifero [raca=" + raca + ", leite=" + leite + "]";
	}
}
