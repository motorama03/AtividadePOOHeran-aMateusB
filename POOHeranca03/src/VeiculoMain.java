public class VeiculoMain {

	public static void main(String[] args) {

		Caminhao caminhao = new Caminhao(true);
		caminhao.setEixos(6);
		System.out.println(caminhao);

		Carro car = new Carro(true);
		car.setPortas(4);
		System.out.println(car);

		Moto moto = new Moto(true);
		moto.setCilindradas(150);
		System.out.println(moto);

	}

}
