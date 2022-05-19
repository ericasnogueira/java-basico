package operadores;

public class Relacionais   {
    public static void main(String[] args) {
        // %(resto)
        int resto =  20 % 2;
        System.out.println(resto);

        // < > <= >= != ==    (sempre vão retorna valores boolean)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte );

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);

        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte);

        boolean isDezIgualDez = 10 ==10;
        System.out.println(isDezIgualDez);

        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezDiferenteDez);
    }
}
