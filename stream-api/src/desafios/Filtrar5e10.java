package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtrar5e10 {

    public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> entre5e10 = numero -> numero >= 5 && numero <= 10;

        numeros.stream()
        .filter(entre5e10)
        .forEach(System.out::println);


    }
    
}
