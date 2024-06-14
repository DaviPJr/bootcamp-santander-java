public class ContaCorrente extends Conta {
     // classe filha

     @Override
     public void imprimirExtrato() {
         System.out.println("=== Extrato Conta Corrente ===");
         imprimirInfosComuns();
     }

     public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    
    
}


