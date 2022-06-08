package lacosde.repeticao;

import java.util.Scanner;

public class estruturaParaFor01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("VALOR I DE :" + i);
        }
        System.out.println("--------------");
        for (int a = 4; a >= 0; a --){
            System.out.println("VALOR DE A : " + a);
        }


    }
}
