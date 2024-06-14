import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cliente davi = new Cliente();
        davi.setNome("Davi");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Conta cc = new ContaCorrente(davi);
        Conta cp = new ContaPoupanca(davi);

        cc.depositar(100);

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco();
        banco.setNome("Meu banco");
        banco.setContas(Arrays.asList(cc, cp));
        banco.setClientes(Arrays.asList(davi, maria));

        banco.imprimirClientes();
    }
}
