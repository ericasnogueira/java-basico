package tipos.primitivos;


public class ConvencoesDeVariaveis {
    public static void main(String[] args) {
     // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        // para o float pode ser o F assim tambem
        float salarioFloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort =32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'a';
        char caractere1 = 'b' ;

        //String não é do tipo primitivo
        String nome = "Goku";



        //casting = não é uma pratica muito boa
        //forcando um numero long em um int
        // ele forca cortando os byte entao não sera o numero que foi declarado na variavel
        int idades = (int) 10000000000L;
        float salario = (float) 2500.0D; // numero double em uma variavel float
        long numero = (long) 155.23;



        //imprimindo tudo
        System.out.println(idade);
        System.out.println("A idade é : " + idade+ " anos");
        System.out.println("\n"+salarioDouble);
        System.out.println(salarioFloat);
        System.out.println("\n"+idadeByte);
        System.out.println(idadeShort);
        System.out.println("\n"+verdadeiro);
        System.out.println(falso);
        System.out.println("\n"+caractere);
        System.out.println(caractere1);

        System.out.println("\ncasting : ");
        System.out.println(idades);
        System.out.println(salario);
        System.out.println(numero);
        System.out.println("\n O nome é " + nome);

    }
}
