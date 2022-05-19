package laçosde.repetição;

public class exercicioBreak {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //condição valorParcela >=1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela<=valorTotal;parcela++){
            double valorParcela = valorTotal / parcela;

            if (valorParcela >= 1000){
                System.out.println("Parcela: "+parcela+" : R$"+valorParcela);
            } else {
                break; // caso seja menor que 1000 pare o código
            }

        }


    }
}
