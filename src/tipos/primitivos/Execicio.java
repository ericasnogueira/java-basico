package tipos.primitivos;

public class Execicio {
    public static void main(String[] args) {
        // crie variaveis para os campos (nome, endereço, salario, data)
        String nome = "Erica";
        String enreco = "Rua centro ";
        int numeroCasa = 156;
        double salario = 5431.12;
        //float salario = 800.00f; -  não aparece o ultimo zero
        // e nem o valor em double motivo de ter botado 5431.12
        String data = "25/05/2022" ;

        //imprimindo uma frase com todas as variaveis

        System.out.println("Eu "+ nome+ ", morando no endereço "+enreco+", confirmo que recebi o salario de "+salario+"," +
                " na data "+data);


    }
}
