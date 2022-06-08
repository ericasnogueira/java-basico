package estrutura.condicionais;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

       int inicialH;
       int finalH;
       int duracao;

       inicialH = entrada.nextInt();
       finalH = entrada.nextInt();

       if (inicialH > finalH){
           duracao = 24 - ( inicialH - finalH);
           System.out.println("O JOGO DUROU " + duracao+ " HORAS");
       } else if (inicialH < finalH){
           duracao =  (finalH - inicialH);
           System.out.println("O JOGO DUROU "+duracao+" HORAS");
       } else {
           System.out.println("O JOGO DUROU 24 HORAS");
       }

    }
}
