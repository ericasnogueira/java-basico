package entrada.dados;


import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        // Faça um Programa para ler o valor do raio de um circulo, e depois mostrar o valor da área
        //deste círculo com quatro casas decimais conforme.

        Locale.setDefault(Locale.US);


        double pi = 3.14159;
        // raio
        double raio, area;

        Scanner entrada = new Scanner(System.in);

        raio = entrada.nextDouble();

        area = pi * raio * raio;

        // quando tiver casas decimais é printf que formata
        System.out.printf("A=%.4f%n ", area);

        entrada.close();

    }
}
