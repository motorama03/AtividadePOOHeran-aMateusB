package Com.Heranca.MateusB.Musica;

public class InstCordas extends MateriaisComposicao{
	
	public InstCordas(double valor){
		super(valor);
	}
	
	private String NomeInst;

	
	
	public String getNomeInst() {
		return NomeInst;
	}

	public void setNomeInst(String nomeInst) {
		NomeInst = nomeInst;
	}

	
	
	public String toString() {
		return super.toString()+"InstCordas [NomeInst=" + NomeInst + "] \n";
	}
	
	
	
}
