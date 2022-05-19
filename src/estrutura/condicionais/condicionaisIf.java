package estrutura.condicionais;

public class condicionaisIf {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade>=18;

        // operador de negação
        // !
        if (isAutorizadoComprarBebida){
            System.out.println("autorizado a comprar bebida alcólica");
        }
        // você não é autorizado
        //se (não=!) é autorizado
        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }



    }
}
