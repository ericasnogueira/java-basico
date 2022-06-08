package estrutura.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        int cod;
        int quanti;
        double total;

        cod = entrada.nextInt();
        quanti = entrada.nextInt();

        if(cod == 1){
            total = quanti * 4.00;
            System.out.println("CACHORO QUENTE = QUANTIDADE : " + quanti);
            System.out.printf("TOTAL : R$ %.2f%n", total);
        } else if (cod == 2) {
            total = quanti * 4.50;
            System.out.println("X-SALADA = QUANTIDADE : " + quanti);
            System.out.printf("TOTAL : R$ %.2f%n", total);
        } else if (cod == 3) {
            total = quanti * 5.00;
            System.out.println("X-BACON = QUANTIDADE : " + quanti);
            System.out.printf("TOTAL : R$ %.2f%n", total);
        } else if (cod == 4) {
            total = quanti * 2.00;
            System.out.println("TORRADA SIMPLES = QUANTIDADE : " + quanti);
            System.out.printf("TOTAL : R$ %.2f%n", total);
        } else if (cod == 5 ){
            total = quanti * 1.50;
            System.out.println("REFRIGERANTE = QUANTIDADE : " + quanti);
            System.out.printf("TOTAL : R$ %.2f%n", total);
        } else {
            System.out.println("CODIGO INVÁLIDO");
        }

    }
}
