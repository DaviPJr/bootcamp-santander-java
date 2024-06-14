package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class SomaDosQuadrados {
    

    public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Integer> dobrar = numero -> numero * numero;

        BinaryOperator<Integer> somar = Integer::sum;

        List<Integer> quadrados = numeros.stream()
        .map(dobrar)
        .toList();

        // System.out.println(quadrados);

        int resultado = quadrados.stream().reduce(0, somar);

        System.out.println(resultado);

    }
}
