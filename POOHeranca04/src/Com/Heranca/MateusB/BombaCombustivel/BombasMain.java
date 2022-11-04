package Com.Heranca.MateusB.BombaCombustivel;

public class BombasMain {

	public static void main(String[] args) {

		BombaGasolina gasosa = new BombaGasolina(25, 0.0);
		gasosa.abastecerLitro();
		
		System.out.println(gasosa.abastecerLitro());
		
		BombaDisel disel = new BombaDisel(25, 0.0);
		disel.abastecerLitro();
		
		System.out.println(disel.abastecerLitro());
		
		BombaEtanol etanol = new BombaEtanol(25, 0.0);
		System.out.println(etanol.abastecerLitro());
		
		
	}

}
