package Com.Heranca.MateusB.Musica;


public class InstPercursao extends MateriaisComposicao {
	
	public InstPercursao(double valor){
		super(valor);
	}
	
	private String MecanismoParaTocar;


	public String getMecanismoParaTocar() {
		return MecanismoParaTocar;
	}


	public void setMecanismoParaTocar(String mecanismoParaTocar) {
		MecanismoParaTocar = mecanismoParaTocar;
	}


	public String toString() {
		return super.toString()+"InstPercursao [MecanismoParaTocar=" + MecanismoParaTocar + "]";
	}
}
