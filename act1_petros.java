package atv2_petros;

public class Cachorro {

	String nome;
	String raca;
	int idade;

	public Cachorro(String nome, String raca, int idade) {

		this.nome = nome;
		this.raca = raca;
		this.idade = idade;

	}

	public void latir() {
		System.out.println("Au Au!");
	}

	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro("Kut", "Husk", 3);
		
		meuCachorro.latir();
	}

}