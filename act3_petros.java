package atv2_petros;

public class ContaBancaria {

	String numeroConta;
	double saldo;

	public ContaBancaria(String numeroConta) {

		this.numeroConta = numeroConta;
		this.saldo = 0.0;

	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito: " + valor + "realizado com sucesso");
		} else {
			System.out.println("Valor do depósito inválido");
		}
	}

	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque" + valor + "realizado com sucesso");
		} else {
			System.out.println("Saque inválido");
		}
	}

	public void exibirSaldo() {
		System.out.println("saldo atual da conta: " + numeroConta + ": R$" + saldo);
	}

}





package atv2_petros;

public class Main {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("12345-6");

		conta.depositar(500.0);
		conta.sacar(200.0);
		conta.exibirSaldo();
	}
}