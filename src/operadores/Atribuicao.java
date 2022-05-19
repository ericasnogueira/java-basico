package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        //  = , += , -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800

        System.out.println(bonus);

        int contador =0;
        contador += 1;
        contador++; // contador + 1           ++contador
        contador--; // contador -- //         --contador
        ++contador;
        --contador;

        System.out.println(contador);


    }
}
