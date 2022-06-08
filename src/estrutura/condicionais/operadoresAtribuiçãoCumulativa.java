package estrutura.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class operadoresAtribuiçãoCumulativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //a += b;                    a = a + b;
        //a -= b;                    a = a - b;
        //a *= b;                    a = a * b;
        //a /= b;                    a = a / b;
        //a %= b;                    a = a % b;

        Scanner entrada = new Scanner(System.in);

        int minutos = entrada.nextInt();

        double conta =50.0;

        if (minutos > 100){
            conta += (minutos - 100) *2.0;
        }
        System.out.printf("VALOR DA CONTA = R$ %.2f%n", conta);
    }
}
