package estrutura.arrays;

public class arraysMultidimensionais01 {
    public static void main(String[] args) {

        // array multidimensional
        //              0 1 2
        //           0 = 0 1 2
        //           1 = 0 1 2
        //           2 = 0 1 2
        int[][] dias = new int [3][3];

        // 0
        //   i  j
        dias[0][0] = 31;// janeiro
        dias[0][1] = 28;//fevereiro
        dias[0][2] = 31;//março

        // 1
        dias[1][0] = 31;// janeiro
        dias[1][1] = 28;//fevereiro
        dias[1][2] = 31;//março

        // for i,j in variavel.items // para mostrar tanto a chave e o seu valor
        for (int i =0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
    }
}
