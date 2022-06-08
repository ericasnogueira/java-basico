package tipos.primitivos;

/*
comentario de bloco
*/
public class FucoesInteressantesString {
    public static void main(String[] args) {
//                        012345
        String original = "abcde FGHIJ ABC abc DEFG     ";
        System.out.println(original + " - ");// mostrando o espaço

        // transformando todas as letras em minusculas
        String s01 = original.toLowerCase();
        System.out.println(s01);
        System.out.println("============================");

        // tranformando as letras maiusculas
        String s02 = original.toUpperCase();
        System.out.println(s02);
        System.out.println("============================");

        // tirando os espaços
        String s03 = original.trim();
        System.out.println(s03+ "-");
        System.out.println("============================");

        // comecando do caractere 2
        String s04 = original.substring(2);
        System.out.println(s04);
        System.out.println("============================");

        // recortando a partir do 2 só abaixo do 9
        String s05 = original.substring(2,9);
        System.out.println(s05);
        System.out.println("============================");

        // trocando o a por x
        String s06 = original.replace('a','x');
        System.out.println(s06);
        System.out.println("============================");

        String s07 = original.replace("abc", "xy");
        System.out.println(s07);
        System.out.println("============================");

//      posicao da primeira aparicao
        int i = original.indexOf("bc");
        System.out.println(i);
        System.out.println("============================");

        // posicao da ultima aparicao
        int x = original.lastIndexOf("bc");
        System.out.println(x);




    }
}
