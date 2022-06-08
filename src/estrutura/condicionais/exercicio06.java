package estrutura.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double num;

        num = entrada.nextDouble();

        if (num > 25 && num <= 50){
            System.out.println("intervalo (25, 50)");
        } else if (num > 0 && num <= 25) {
            System.out.println("intervalo (0, 25)");
        } else if (num > 75 && num <= 100){
            System.out.println("intervalo (75, 100)");
        } else if (num < 0) {
            System.out.println("fora de intervalo");
        }
    }
}
