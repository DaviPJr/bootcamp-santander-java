package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UmNegativo {

    public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> umNegativo = n -> n < 0;

       boolean negativo = numeros.stream()
        .anyMatch(umNegativo);

        System.out.println(negativo);
    }
    
}
