public class ContaPoupanca extends Conta {
    // classe filha

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }


    
   
    
}
