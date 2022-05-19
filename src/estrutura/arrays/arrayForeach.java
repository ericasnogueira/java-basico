package estrutura.arrays;

public class arrayForeach {
    public static void main(String[] args) {
        //tamanho do array
        int [] numeros = new int[3];

        // tamanho do array de outra forma
        int [] numeros2 = {1,2,3,4,5};

        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        System.out.println("****************");

        // usando o Foreach
        // não consegue acessar um indice específico

        for(int num: numeros2){
            System.out.println(num);
        }


    }
}
