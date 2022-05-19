package estrutura.condicionais;

public class exercicioSwitch {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo

        byte dia = 3;

        switch (dia){
            case  1 :
                System.out.println("Domingo");
                System.out.println("Não é dia útil");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println("Não é dia  útil");
                break;
            default:
                System.out.println("opção inválida");
        }


    }
}
