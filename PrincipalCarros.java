package aula_java_01_10_atividades;

public class PrincipalCarros {
	public static void main(String[] args) {
		MarcaCarro carro = MarcaCarro.CHEVROLET;
		MarcaCarro carros[] = MarcaCarro.values();
		
		System.out.println("Exibindo apenas uma marca de carro: " + carro);
		System.out.println("---------------------");
		for(int i=0; i<carros.length; i++) {
			System.out.println((i+1) + ": " + carros[i]);
		}
	}	
}
