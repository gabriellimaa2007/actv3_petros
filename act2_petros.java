package atv2_petros;

public class Livro {

	String titulo;
	String autor;
	int numPaginas;

	public Livro(String titulo, String autor, int numPaginas) {

		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public void exibirInformacoes() {
		System.out.println("titulo: " + titulo);
		System.out.println("autor: " + autor);
		System.out.println("numPaginas: " + numPaginas);
	}
	public class Main {

	public static void main(String[] args) {
		
		Livro meuLivro = new Livro("Engenharia de software", "Raul Sidnei", 97);
		meuLivro.exibirInformacoes();

	}

	}
}