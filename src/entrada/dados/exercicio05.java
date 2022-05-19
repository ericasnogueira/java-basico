package entrada.dados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        int codUm,codDois, uniUm, uniDois;
        double valUm, valDois, total;



         codUm = entrada.nextInt();
         uniUm = entrada.nextInt();
         valUm = entrada.nextDouble();

         codDois = entrada.nextInt();
         uniDois = entrada.nextInt();
         valDois = entrada.nextDouble();

        total = uniUm * valUm + uniDois * valDois;

        System.out.printf("VALOR A PAGAR : R$ %.2f%n", total);



    }
}
