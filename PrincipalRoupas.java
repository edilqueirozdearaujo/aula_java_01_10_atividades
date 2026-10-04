package aula_java_01_10_atividades;

public class PrincipalRoupas {
	public static void main(String[] args) {
		MarcaRoupa roupa = MarcaRoupa.ADIDAS;
		MarcaRoupa roupas[] = MarcaRoupa.values();
		
		System.out.println("Exibindo apenas uma marca de roupa = " + roupa);
		System.out.println("-------------------------------");
		
		for(int i=0; i<roupas.length;i++) {
			System.out.println((i+1) + ": " + roupas[i]);
		}
	}
}
