package Com.Heranca.MateusB.Musica;

public class MateriaisComposicao extends InstrumentosMusicais {
	
	public MateriaisComposicao(double valor){
		super(valor);
	}
	
	private String Material;

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public String toString() {
		return super.toString()+"Madeira [Material=" + Material + "] \n";
	}
	
	
	
}
