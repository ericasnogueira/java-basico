package estrutura.arrays;


// Crie um vetor de 6 números inteiros
// e mostre-os na ordem inversa.

import java.util.Arrays;

public class exemploOrdemInversa {
    public static void main(String[] args) {
                    // 0   1   2   3  4  5
        int[]vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor : ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        //ordem inversa

        System.out.println("********************");
        System.out.println("Vetor em ordem inversa : ");

        for(int a = (vetor.length - 1 ); a >= 0; a --){
            System.out.print(vetor[a] + " ");
        }




    }
}
