package lacosde.repeticao;

import java.util.Scanner;

public class exercicioWhile01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha = entrada.nextInt();


        while (senha != 2002) {
            System.out.println("Senha invalida");

            senha = entrada.nextInt();

        }
        System.out.println("Acesso Permitido");



    }
}
