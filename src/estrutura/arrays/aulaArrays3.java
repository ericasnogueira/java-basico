package estrutura.arrays;

public class aulaArrays3 {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Saiki Kusuo";


        // percorrendo o array
        // for i in nomes     // nomes.len
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }



    }
}
