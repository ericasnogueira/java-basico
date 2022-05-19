package laçosde.repetição;

public class whileDowhileFor {
    public static void main(String[] args) {
        // While, do while, for

        int contador = 5;

        // enquanto contador < 10
        while (contador <= 10 ){
            System.out.println(contador);

            contador = contador + 1; // pode ser assim tambem : contador++; (no proprio sout)

        }
        System.out.println("*********************");

        // ira fazer pelo menos uma vez
        // do while não é muito usado
        contador = 0;
        //faça
        do {
            System.out.println("Dentro do do-while --"+ ++contador);
        } while (contador < 10 );

        System.out.println("***********************");


    // para i começando de 0 até i ser menor do que 10 incrementando de 1 em  1  faça(for)
        for(int i=0;i< 10; i++){
            System.out.println("For : "+i);
        }





    }
}
