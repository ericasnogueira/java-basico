package operadores;

public class LogicosAnd {
    public static void main(String[] args) {
        //  &&(and)- e   ||(or)- ou  !

        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentrodaLeiMaiorQueTrinta);
        System.out.println(isDentrodaLeiMenorQueTrinta);



    }
}
