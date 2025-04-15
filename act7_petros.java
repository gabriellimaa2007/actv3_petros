package act7;

public class Pessoa {
	String nome;
	int idade;

	public Pessoa(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;

	}

	public void fazerAniversario() {
		idade++;
	}
	
	
	public static void main (String[] args) {
		
		Pessoa pes = new Pessoa("Gabriel", 18);
		System.out.println(pes.nome + " tem " + pes.idade);
		pes.fazerAniversario();
		System.out.println("E terá " + pes.idade);
	}
	

}