package estrutura.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double x;
        double y;

        x = entrada.nextDouble();
        y = entrada.nextDouble();

        if ( x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y <0) {
            System.out.println("Q3");
        } else if ( x > 0 && y < 0 ) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }


    }
}
