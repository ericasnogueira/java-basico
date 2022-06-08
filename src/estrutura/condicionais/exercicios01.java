package estrutura.condicionais;

import java.util.Scanner;

public class exercicios01 {
    public static void main(String[] args) {
        //faça um programa para ler um número inteiro, e depois dizer se este número
        // é negativo ou não

        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        if(numero < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        entrada.close();

    }
}
