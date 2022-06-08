package lacosde.repeticao;

import java.util.Scanner;

public class estruturaEnquantoWhile {
    public static void main(String[] args) {
        // fazer um programa que lê números inteiros até o zero seja lido.
        //Ao final mostra a soma dos números lidos.

        Scanner entrada = new Scanner(System.in);

        // declarando a variavel e já recebendo o seu valor
        int primerioValor = entrada.nextInt();

        int soma = 0;
        while ( primerioValor != 0 ){ // enquanto o valor(variavel) for diferente de 0 irá continuar pedindo o numero
            soma = soma + primerioValor;
            primerioValor = entrada.nextInt();
        }

        System.out.println(soma);
        entrada.close();
    }
}
