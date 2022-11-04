public class Veiculo {

	private boolean motor;

	public Veiculo(boolean motor) {
		setMotor(motor);
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public String toString() {
		return "Veiculo [motor=" + motor + "] \n";
	}

}
