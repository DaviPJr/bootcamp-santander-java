package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MaiorQue10 {

    public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

     Predicate<Integer> maior = n -> n > 10;

     boolean n = numeros.stream()
     .anyMatch(maior);

     System.out.println(n);
    
}

}
