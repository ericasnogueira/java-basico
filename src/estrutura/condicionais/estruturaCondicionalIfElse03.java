package estrutura.condicionais;

import java.util.Scanner;

public class estruturaCondicionalIfElse03 {
    public static void main(String[] args) {
        // Encadeamento de estrutura condicionais
        Scanner entrada = new Scanner(System.in);
        int hora;
        System.out.println("Que horas são :");
        hora = entrada.nextInt();


        if(hora<12){
            System.out.println("Bom dia ");
        } else {
                if (hora < 18){
                    System.out.println("Boa Tarde");
                } else {
                    System.out.println("Boa Noite");
                }
        }
    }
}
