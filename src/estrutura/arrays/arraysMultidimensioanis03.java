package estrutura.arrays;

public class arraysMultidimensioanis03 {
    public static void main(String[] args) {

        int [] array = {1, 2, 3};
        //                   posições : quantidades
        int [][] arrayInt = new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};
            //       posições : 1         2            3
        int [][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
            // quantidades:     2         3             6
        for (int [] arrayBase: arrayInt){
            System.out.println("\n-------");
            for(int num : arrayBase){
                System.out.println(num + " ");
            }
        }
    }
}
