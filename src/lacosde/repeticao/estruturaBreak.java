package lacosde.repeticao;

public class estruturaBreak {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor, por exemplo 50
        int valorMax = 50;

        for(int i =0; i <= valorMax;i++){
            // quando chegar em 25 parar o codigo
            if (i >25) {
                break;
            }
            System.out.println(i);

        }

    }

}
