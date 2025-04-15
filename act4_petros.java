package retangulo;

public class retangulo {

	double largura;
	double altura;

	public retangulo(double largura, double altura) {

	this.largura = largura;
	this.altura = altura;
	}

	public double calcularArea() {
		return largura * altura;
	}
	public double calcularPerimetro() {

		return 2 * largura + altura;
	}
	
		public static void main(String[] args) {
			
			retangulo retan = new retangulo(5.0, 10.0);
			
			System.out.println("Lagura: " + retan.largura);
			System.out.println("Altura: " + retan.altura);
			System.out.println("Area: " + retan.calcularArea());
			System.out.println("Perimetro: " + retan.calcularPerimetro());
		}
	}