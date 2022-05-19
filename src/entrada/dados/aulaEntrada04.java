package entrada.dados;

import java.util.Scanner;

public class aulaEntrada04 {
    public static void main(String[] args) {
        // Para ler um TEXTO ATÉ A QUEBRA DE LINHA

        Scanner entrada = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        // ATENÇÃO : QUEBRA DE LINHA PENDENTE
        // SOLUÇÃO :fazer um nextLine extra antes do nextLine do interresse.

        x = entrada.nextInt();
        // nextLine para ler o texto
        entrada.nextLine(); // EXTRA PARA NÃO OCORRE A QUEBRA DE LINHA PENDENTE
        s1 = entrada.nextLine();
        s2 = entrada.nextLine();
        s3 = entrada.nextLine();

        System.out.println("DADOS DIGITADOS : ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        entrada.close();


    }
}