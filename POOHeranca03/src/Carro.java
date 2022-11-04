public class Carro extends Veiculo {

	public Carro(boolean motor) {
		super(motor);
	}

	private int portas;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String toString() {
		return super.toString() + "Carro [portas=" + portas + "]";
	}

}
