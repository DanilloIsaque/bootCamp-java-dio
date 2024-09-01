package BancoDigital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void calcularRendimento(double taxa) {
        double rendimento = saldo * taxa;
        saldo += rendimento;
        registrarTransacao("Rendimento", rendimento);
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
