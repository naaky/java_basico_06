package java_basico_06;

public class Main {

	public static void main(String[] args) {
			
		Main app = new Main();
		app.start();

	}

	private void start() {
		
		String[] carros = { "civic", "gol", "palio", "uno"};
		
		System.out.println("Posicao 1: " + carros[1]);
		
		for (String carro : carros) {
			
			System.out.println("Carro: " + carro);
		}
		
		System.out.println("");
		
	}

}
