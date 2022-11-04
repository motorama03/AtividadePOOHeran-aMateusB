public class Moto extends Veiculo {

	public Moto(boolean motor) {
		super(motor);
	}

	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String toString() {
		return super.toString() + "Moto [cilindradas=" + cilindradas + "]";
	}

}
