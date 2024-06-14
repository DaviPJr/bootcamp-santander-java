public class Operadores {
    public static void main(String[] args) {
       // Operadores
	    int numero = 5;
	    System.out.print(- numero);
	    System.out.print(numero); // numero continua positivo

        numero = - numero;
        System.out.print(numero); // agora torna-se negativo

        numero = numero * -1;
        System.out.print(numero); // agora torna-se positivo de novo

        // Incrementando
        numero++;
        System.out.print(numero);

        // Decrementando
        numero--;
        System.out.print(numero);
        
        // Como utilizar no console:
        System.out.print(numero ++);
        System.out.print(numero);
        System.out.print(++ numero);
        System.out.print(numero);

        // Booleanos:
        boolean variavel = true;
        System.out.print(!variavel); // imprime false, mas o valor dela ainda é true
        variavel = !variavel;
        System.out.print(variavel); // agora sim ela é false

        // Ternário
        int a, b;
        a = 5;
        b = 6;
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.print(resultado);

          // Relacionais:
          int numero1 = 1;
          int numero2 = 2;

          boolean simNao = numero1 == numero2;
          System.out.print(simNao);

          simNao = numero1 != numero2;
          System.out.print(simNao); // true

          simNao = numero1 < numero2;
          System.out.print(simNao); // true

          simNao = numero1 > numero2;
          System.out.print(simNao); // false

          simNao = numero1 >= numero2;
          System.out.print(simNao); // false

          simNao = numero1 <= numero2;
          System.out.print(simNao); // true

          // ou então utilizar as condicionais if para julgar true or false

         // Equals:
        Integer number1 = 130;
        Integer number2 = 130;

        System.out.println(number1 == number2); // false pois estamos comparando objetos, devemos utilizar a propriedade equals
        System.out.println(number1.equals(number2)); // agora sim, true

        // Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } 
        if (condicao1 || condicao2) {
            System.out.println("Umas das condições é verdadeira");
        }
     }
}
