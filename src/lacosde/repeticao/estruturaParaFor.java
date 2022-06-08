package lacosde.repeticao;

import java.util.Scanner;

public class estruturaParaFor {
    public static void main(String[] args) {
        //QUANDO USAR : Quando se sabe previamente a quantidade de repetições,
        // ou o intervalo de valores.

        //executa somente na primeira vez
              //  |         v: executa e volta  f: pula fora
        // for (inicio ; condição; incremento)
//                                    executa toda vez depois de voltar

      // fazer um programa que lê um valor inteiro N e depois
      // N números inteiros. Ao final, mostra a soma dos N números lidos.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros vai querer ? ");
        int N = entrada.nextInt();
        System.out.println("---------");

        int soma  = 0;

        for(int i =0; i <N;i++){
            int x = entrada.nextInt();

            soma = soma + x;
        }
        System.out.println(soma);
    }
}
