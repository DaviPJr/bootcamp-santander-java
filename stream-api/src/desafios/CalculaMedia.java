package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CalculaMedia {

     public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Predicate<Integer> maiorQ5 = n -> n > 5;

    List<Integer> maiores = numeros.stream()
    .filter(maiorQ5)
    .toList();

    // System.out.println(maiores);

    int soma = maiores.stream()
    .mapToInt(Integer::intValue)
    .sum();

    int count = maiores.size();

    double media = soma / count;

    System.out.println(media);
    
}
}