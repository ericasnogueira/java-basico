package entrada.dados;

import java.util.Scanner;

public class aulaEntrada01 {
    public static void main(String[] args) {
        // suponha uma variavel tipo string declarada :

        //declarando Scanner/ variavel
        Scanner entrada = new Scanner(System.in);

        String x ;
        int b;
        double c ;
        char e;
        x = entrada.next(); //  permitindo digitar uma PALAVRA e armazenar ela na variavel x

        b = entrada.nextInt(); // permitindo digita um numero INTEIRO e armazenar ele na variavel b

        c = entrada.nextDouble();//permitindo digita um numero DOUBLE e armazenar ele na variavel c // , em vez de .

        e = entrada.next().charAt(0); // O 0 pegar o primerio caracter


        System.out.println("Voce digitou a palavra: "+ x); //mostrando a palavra digitada
        System.out.println("Voce digitou o numero inteiro : " + b);// mostrando o numero inteiro
        System.out.println("Voce digitou um numero double : " + c);//mostrando o numero double
        System.out.println("Voce digitou o caracter : " + e);

        entrada.close();

    }

}
