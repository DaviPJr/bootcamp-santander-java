import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo!");
        // analisaCandidato((1900.0));
        // analisaCandidato((2200.0));
        // analisaCandidato((2000.0));
        // selecaoCandidatos();
        // imprimirSelecionados();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }
        
        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + ", na tentativa de número: " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ". Número máximo de tentativas esgotadas.");
        }
    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor: R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void imprimirSelecionados () {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice + 1) + " é " + candidatos[indice]);
        }

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisaCandidato (double salarioEsperado) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioEsperado) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioEsperado) {
            System.out.println("Ligar para o candidato com contra-proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
