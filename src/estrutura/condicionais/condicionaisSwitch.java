package estrutura.condicionais;

public class condicionaisSwitch {
    public static void main(String[] args) {
        // imprima dia da semana, considerando 1 como domingo

        byte dia = 5;

        // char, int, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: // pode está em qualquer lugar
                System.out.println("Opção inválida");

        }

        char sexo = 'H'; // se for String em todos tem que ser com " "
        switch (sexo){
            case 'H':
                System.out.println("HOMEM-");
                break;
            case 'h':
                System.out.println("HOMEM");
                break;
            case 'F':
                System.out.println("MULHER-");
                break;
            case 'f':
                System.out.println("mulher");
                break;
            default:
                System.out.println("opção inválida");
        }

    }
}
