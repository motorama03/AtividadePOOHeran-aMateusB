package Com.Heranca.MateusB.Animal;

public class Animal {
	
	private String tipoAlimentacao;
	private String habitat;
	
	public Animal(String tipoAlimentacao, String habitat){
		setTipoAlimentacao(tipoAlimentacao);
		setHabitat(habitat);	
		}
	

	
	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}
	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	
	public String toString() {
		return "Animal [tipoAlimentacao=" + tipoAlimentacao
				+ ", habitar=" + habitat + "] \n";
	}
	
	
	
}
