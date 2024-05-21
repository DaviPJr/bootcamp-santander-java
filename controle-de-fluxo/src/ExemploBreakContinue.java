public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break; // irá parar o for 
              // continue         // irá pular apenas o numero dentro da condicional
            System.out.println(numero);
            
        }
    }
}
