package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class SomaDivisiveis3e5 {

    public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> divisiveis3e5 = n -> n % 3 == 0 && n % 5 == 0;

        BinaryOperator<Integer> somar = Integer::sum;

        numeros.stream()
        .filter(divisiveis3e5)
        .reduce(somar)
        .ifPresent(System.out::println);


    }
    
}
