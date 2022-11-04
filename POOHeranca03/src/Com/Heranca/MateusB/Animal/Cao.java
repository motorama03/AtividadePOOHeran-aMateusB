package Com.Heranca.MateusB.Animal;

public class Cao extends Mamifero {
	
	public Cao(String tipoAlimentacao, String habitat){
		super(tipoAlimentacao, habitat);
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return super.toString()+"Cao [nome=" + nome + "]";
	}
	
	
	
	
	
}
