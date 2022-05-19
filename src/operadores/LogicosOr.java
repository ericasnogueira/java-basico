package operadores;

public class LogicosOr {
    public static void main(String[] args) {
        // or - ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay =  5000F;

        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;

        System.out.println(isPlayCincoCompravel);


    }
}
