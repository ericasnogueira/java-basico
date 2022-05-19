package entrada.dados;

import java.util.Scanner;

public class aulaEntrada03 {
    public static void main(String[] args) {
            // Para ler um TEXTO ATÉ A QUEBRA DE LINHA

            Scanner entrada = new Scanner(System.in);

            String s1, s2, s3;

            // nextLine para ler o texto
            s1 = entrada.nextLine();
            s2 = entrada.nextLine();
            s3 = entrada.nextLine();

            System.out.println("DADOS DIGITADOS : ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);

            entrada.close();



        }
}
