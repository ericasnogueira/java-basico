package lacosde.repeticao;

import java.util.Scanner;

public class exerciciosWhile03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alcool =  0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = entrada.nextInt();

        while (codigo != 4 ){
            if (codigo == 1){
                alcool += 1;
            } else if (codigo == 2 ) {
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            }
            codigo = entrada.nextInt();
        }

        System.out.println("alcool : " + alcool);
        System.out.println("gasolina : " + gasolina);
        System.out.println("diesel : " + diesel);

        System.out.println("MUITO OBRIGADO ");




    }
}
