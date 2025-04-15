package atv10;

public class Triangulo {
	
	double base;
	double altura;

	public Triangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
    public double calcularArea() {
    	
    	return base * altura / 2;    	
    }
    public static void main(String[] args) {
    	
    	Triangulo tri = new Triangulo(50.0, 100);
    	System.out.println("Area do triangulo: " + tri.calcularArea());
    }
}