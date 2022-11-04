package Com.Heranca.MateusB.Xadrez;

public class Peca {

	private int linha;
	private int col; 
	private boolean cor;
	private int movimento;
	
	public Peca(int linha){
		setLinha(linha);
	}
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public boolean isCor() {
		return cor;
	}
	public void setCor(boolean cor) {
		this.cor = cor;
	}
	public int getMovimento() {
		return movimento;
	}
	public void setMovimento(int movimento) {
		this.movimento = movimento;
	}
	
	
	
	public String toString() {
		return "Peca [linha=" + linha + ", col=" + col + ", cor=" + cor
				+ ", movimento=" + movimento + "]";
	}

}
