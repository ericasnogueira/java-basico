package estrutura.condicionais;

import java.util.Scanner;

public class estruturaCondicionalIfElse02 {
    public static void main(String[] args) {

        Scanner  entrada = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas ?");
        hora = entrada.nextInt();

        //composta
        if (hora < 12){
            System.out.println("Bom dia ");
        } else {
            System.out.println("Boa tarde");
        }

        entrada.close();

    }
}
