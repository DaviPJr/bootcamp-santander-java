package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SomarNumeros {

    public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    BinaryOperator<Integer> somar = (a, b) -> a + b;

    int soma = numeros.stream()
    .reduce(0, somar);

    System.out.println(soma);


    }
    
}
