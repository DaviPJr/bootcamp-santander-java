package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PareImpar {

    public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> par = numero -> numero % 2 == 0;

        Predicate<Integer> impar = numero -> numero % 2 != 0;

        List <Integer> pares =numeros.stream()
        .filter(par)
        .toList();

        List <Integer> impares =numeros.stream()
        .filter(impar)
        .toList();

        System.out.println(pares);

        System.out.println(impares);


    }
    
}
