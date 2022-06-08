package lacosde.repeticao;

import java.util.Scanner;

public class exercicioFor02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números vai querer ? ");
        int N = entrada.nextInt();
        System.out.println("===============");

        int in = 0;
        int out = 0;

        for (int i = 0;i < N; i ++ ){
            int x = entrada.nextInt();
            if (x >= 10 && x <= 20){
                in = in +1;
            } else {
                out = out + 1;
            }
        }
        System.out.println(in + " estão no intervalo [10,20]");
        System.out.println(out + " não estão no intervalo ");

    }
}
