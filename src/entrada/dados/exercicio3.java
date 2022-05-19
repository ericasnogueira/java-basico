package entrada.dados;


import java.util.Scanner;
import java.util.concurrent.Callable;

public class exercicio3 {

    public static void main(String[] args) {

        // faça um programa para ler quatro valores inteiros A, B, C, D. A seguir calcule
        // e mostre a diferença do produto de A e B  pelo produto de C e D
        // fórmula :  DIFERENCA = (A * B - C * D)

        Scanner entrada = new Scanner(System.in);

        int a, b, c, d, diferenca;

        //entrada dos valores
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENCA : " + diferenca);



    }
}
