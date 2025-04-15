package act_8;

public class Produto {

	String nome;
	double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public void aplicarDesconto(double percentual) {
		preco -= preco * (percentual/100);
	}
	public static void main(String[] args) {
		Produto pot = new Produto("Galant", 5.000);
		pot.aplicarDesconto(50);
		
		System.out.println("O preço do " + pot.nome + " com o desconto de 10% ficará por " + pot.preco);
	}
}