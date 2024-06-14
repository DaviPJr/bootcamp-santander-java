package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarIguais {

     public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            Integer primeiroNumero = numeros.get(0);

           Predicate<Integer> saoIguais = numero -> numero.equals(primeiroNumero);

           boolean iguais = numeros.stream()
           .allMatch(saoIguais);

        System.out.println(iguais);

     }
    
}
