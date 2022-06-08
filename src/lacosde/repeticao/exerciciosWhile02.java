package lacosde.repeticao;

import java.util.Scanner;

public class exerciciosWhile02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        double primeiro = entrada.nextDouble();
        double segundo =  entrada.nextDouble();

        while ( primeiro != 0 || segundo !=0){
            if (primeiro > 0 && segundo > 0){
                System.out.println("PRIMEIRO");
            } else if (primeiro < 0 && segundo > 0){
                    System.out.println("SEGUNDO");
                } else if (primeiro < 0 && segundo < 0) {
                    System.out.println("Terceiro");
                } else if (primeiro > 0 && segundo <0) {
                    System.out.println("Quarto");
            } else {
                break;
            }
            primeiro = entrada.nextDouble();
            segundo = entrada.nextDouble();
        }
        System.out.println("FIM DO PROGRAMA"); //
    }
}
