package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validaCenarioDeExcecaoTransferencia (){
        final Conta contaOrigem = new Conta(123456, 0);
        final Conta contaDestino = new Conta(7890, 100.0);

        final TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

       // Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
    
}
