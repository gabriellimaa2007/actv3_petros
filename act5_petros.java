package pricipal;

public class Carro {

	String marca;
	String modelo;
	int ano;

	public Carro(String marca, String modelo, int ano) {

		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public void exibirDetalhes() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("ano:" + ano);

	}

	public static void main(String[] args) {
	
		Carro car = new Carro("Nissan", " Skyline", 2002);
		car.exibirDetalhes();
		
		
		System.out.println();
	}
}
