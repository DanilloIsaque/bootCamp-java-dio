package BancoDigital;

public class Main {
    public static void main(String[] args) {
		Cliente danillo = new Cliente();
		danillo.setNome("Danillo");
		
		Conta cc = new ContaCorrente(danillo);
		Conta poupanca = new ContaPoupanca(danillo);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		((ContaPoupanca) poupanca).calcularRendimento(0.10);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
