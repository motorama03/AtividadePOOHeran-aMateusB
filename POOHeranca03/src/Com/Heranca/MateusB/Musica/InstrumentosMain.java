package Com.Heranca.MateusB.Musica;

public class InstrumentosMain {

	public static void main(String[] args) {

		InstCordas corda = new InstCordas(679.99);
		corda.setMaterial("Madeira");
		corda.setNomeInst("Viol�o");
		
		System.out.println(corda);
		
	}

}
