package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveImpares {
    
    public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Predicate<Integer> pares = n -> n % 2 == 0;

    List<Integer> filtrados = numeros.stream().filter(pares).toList();

    System.out.println(filtrados);


    }
}
