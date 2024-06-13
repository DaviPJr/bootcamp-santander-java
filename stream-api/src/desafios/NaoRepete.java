package desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class NaoRepete {

     public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
 
    boolean todosUnicos = numeros.stream().allMatch(verificarUnicidade());

    if (todosUnicos) {
        System.out.println("Todos os números são únicos na lista.");
    } else {
        System.out.println("Existem números repetidos na lista.");
    }

}

    private static Set<Integer> set = new HashSet<>();
    
    private static Predicate<Integer> verificarUnicidade() {
         return n -> set.add(n);
}

}
