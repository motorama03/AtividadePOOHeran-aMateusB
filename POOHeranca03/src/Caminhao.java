public class Caminhao extends Veiculo {

	public Caminhao(boolean motor) {
		super(motor);
	}

	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public String toString() {
		return super.toString() + "Caminhao [eixos=" + eixos + "]";
	}

}
