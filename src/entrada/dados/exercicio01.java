package entrada.dados;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //faça um programa para ler dois valores inteiros, e depois mostrar na tela
        // a soma desses números com uma mensagem explicativa.

      int a, b, soma;

      Scanner entrada = new Scanner(System.in);

      a = entrada.nextInt();
      b = entrada.nextInt();

      soma = a + b;

        System.out.println("Soma = " + soma);


    }

}
