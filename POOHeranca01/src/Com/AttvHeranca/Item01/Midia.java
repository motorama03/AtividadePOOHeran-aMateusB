package Com.AttvHeranca.Item01;

public class Midia extends Item {

	public Midia(int codigo, String descricao) {
		super(codigo,descricao);
		
	}
	
	private String gravadora;
	private float duracao;
	
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append("] \n");
		return builder.toString();
	}
	
	
	
	
}
