import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
          Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

          int parametroUm = terminal.nextInt();
          int parametroDois = terminal.nextInt();

          try {
             contar(parametroUm, parametroDois);

          } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
          }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i <= contagem; i++){
                System.out.println(i);
            }
        }
    }
}
