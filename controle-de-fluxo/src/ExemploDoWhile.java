import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());


        System.out.println("Alô !!!");


    }
        private static boolean tocando() {
            boolean atendeu = new Random().nextInt(3)==1; // gera numero aleatorio entre 1 e 3, se for 1 -> atendeu
            System.out.println("Atendeu? " + atendeu);
            //negando o ato de continuar tocando
            return ! atendeu; // parar de tocar
        
    }
}
