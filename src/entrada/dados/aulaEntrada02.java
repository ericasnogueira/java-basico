package entrada.dados;

import java.util.Scanner;

public class aulaEntrada02 {
    public static void main(String[] args) {
        // Para ler vários dados na mesma linha

        String x;
        int y;
        double z;

        Scanner entrada = new Scanner(System.in);

        x = entrada.next();
        y =  entrada.nextInt();
        z = entrada.nextDouble(); // tem que botar a , que na saida ira aparecer o .


        System.out.println("Dados digitados : ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
