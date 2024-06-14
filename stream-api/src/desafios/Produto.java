package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;


public class Produto {

     public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> produto = (a, b) -> a * b;

       Optional<Integer> resultado = numeros.stream().reduce(produto);

        System.out.println(resultado);


     }
    
}
