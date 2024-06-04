import java.util.Scanner;

public class CalculadoraDeMedidas {
 public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Billie", "Beyonce", "Taylor", "Pabllo" };

        int media = calculaMedia(alunos, scan);

        System.out.printf("A média dos alunos é ", media);
    }


public static int calculaMedia(String[] alunos, Scanner scanner) {
    int soma = 0;

    for(String aluno : alunos) {
        System.out.printf("Nota do aluno: %s: ", aluno);
        int nota = scanner.nextInt();
        soma += nota;
    }

    return soma/alunos.length;

}
}
