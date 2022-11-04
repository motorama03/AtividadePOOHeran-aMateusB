package Com.Heranca.MateusB.Animal;

public class Gato extends Mamifero {
	
	public Gato(String tipoAlimentacao, String habitat){
		super(tipoAlimentacao, habitat);
	}
	
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return "Gato [cor=" + cor + "]";
	}
	
	
	
	
	
}
