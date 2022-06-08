package entrada.dados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        // fa�a um programa que leia 3 valores com ponto flutuante de dupla precis�o : A , B, C. Em seguida, calcule e mostra
        // a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura
        // a �rea do c�rculo de raio C. (pi = 3.14159)
        // a �rea do trap�zio que tem A e B por bases e C por altura.
        // a �rea do quadrado que tem lado B.
        // a �rea do ret�ngulo que tem lados A e B

        Locale.setDefault(Locale.US);
        Scanner valores = new Scanner(System.in);


        double a, b, c, circulo, triangulo , trapezio, quadrado, retangulo;


        //lendo os valores
        a = valores.nextFloat();
        b = valores.nextFloat();
        c = valores.nextFloat();

        //formulas

        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b)/ 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        // mostrando o resultado

        System.out.printf("TRIANGULO : %.3f%n ", triangulo);
        System.out.printf("CIRCULO : %.3f%n ",circulo );
        System.out.printf("TRAPEZIO : %.3f%n", trapezio);
        System.out.printf("QUADRADO : %.3f%n", quadrado);
        System.out.printf("RETANGULO : %.3f%n", retangulo);




    }
}
