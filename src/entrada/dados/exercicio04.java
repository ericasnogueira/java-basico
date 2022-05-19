package entrada.dados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        // faça um programa que leia o número do funcionário, seu número de horas trabalhadas,
        // o valor que recebe por horas e calcule o sálario desse funcionário.
        //A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int funcionario;
        float horas, salario, hs;

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        funcionario = entrada.nextInt();
        horas = entrada.nextFloat();
        salario = entrada.nextFloat();

        hs = horas * salario;

        System.out.println("NUMERO = "+ funcionario);
        System.out.printf("SALARIO : U$ %.2f%n",hs);



    }
}
