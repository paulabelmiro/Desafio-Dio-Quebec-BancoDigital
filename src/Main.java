public class Main {
    public static void main(String[] args) {
        Cliente paula = new Cliente();
        paula.setNome("Paula Belmiro");

        Conta cc = new ContaCorrente(paula);
        cc.depositar(200);

        Conta cp = new ContaPoupanca(paula);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
