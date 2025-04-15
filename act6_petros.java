package atv6;

public class Circulo {
	double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {

		return Math.PI * raio * raio;
	}

	public double calcularCircuferencia() {

		return Math.PI * raio;
	}
	
	public static void main(String[] args) {
		
		Circulo cir = new Circulo(20.0);
		
		System.out.println("Area " + cir.calcularArea());
		System.out.println("Circuferencia " + cir.calcularCircuferencia());
	}
}