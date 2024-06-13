package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaior {

     public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    Optional<Integer> max1 = numeros.stream()
                                               .max(Comparator.naturalOrder());

    Optional<Integer> segundoMaior = numeros.stream()
                                               .filter(num -> !max1.isPresent() || !num.equals(max1.get()))
                                               .max(Comparator.naturalOrder());

    System.out.println(segundoMaior);
    
}
}