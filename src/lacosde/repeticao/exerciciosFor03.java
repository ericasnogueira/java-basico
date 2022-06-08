package lacosde.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class exerciciosFor03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas vezes ? ");
        int n = entrada.nextInt();

        System.out.println("==========");
        double resultado ;

        double primeiro;
        double segundo;
        double terceiro;

        for(int i = 0;i < n ;i++){
            primeiro = entrada.nextDouble();
            segundo = entrada.nextDouble();
            terceiro = entrada.nextDouble();

            resultado = (primeiro * 2.0 + segundo * 3.0 + terceiro * 5.0) / 10.0;

            System.out.printf("%.1f%n", resultado);

        }


    }
}
