package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FiltrarPrimos {

     public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroPrimo = numero -> {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        };

        List <Integer> primos = numeros.stream()
        .filter(numeroPrimo)
        .toList();

        System.out.println(primos);


     }
    
}
