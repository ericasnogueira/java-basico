package estrutura.condicionais;

import java.util.Scanner;

public class exercicios3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a;
        int b;

        a = entrada.nextInt();
        b = entrada.nextInt();

        if (a % b ==0 || b % a ==0 ){
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }


    }
}
