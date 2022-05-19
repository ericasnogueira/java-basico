package estrutura.condicionais;

public class operadorTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        //Operador ternario
        // (condicao) ? verdadeira : falso
                          // condicao         verdadeira        falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // não é aconselhável
        String categoria;
        int idade = 20;
        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);



    }
}
