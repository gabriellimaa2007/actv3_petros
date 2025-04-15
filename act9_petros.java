package atv9;

public class Aluno {
	String nome;
	String matricula;
	
	public Aluno(String nome, String matricula) {
		
		this.nome = nome;
		this.matricula = matricula;
	}
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		
	}
	public static void main(String[] args) {
		
		Aluno meuAluno = new Aluno("Gabriel", "UNIFG");
		meuAluno.exibirInformacoes();
		
	}
	

}