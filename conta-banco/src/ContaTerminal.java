import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    String numero;
    String agencia;
    String nomeCliente;
    double saldo = 100;

    public void inserirDados (String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        numero = scanner.next();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }

}
