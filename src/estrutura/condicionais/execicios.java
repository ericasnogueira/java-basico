package estrutura.condicionais;

public class execicios {
    public static void main(String[] args) {
        //Programa de temperatura em gruas celsius,kevin,Reaumur,Rankine e Fahrenheit
        // f = c * 1.0 + 32
        // K = c + 273.15
        //Re = c * 0.8
        //Ra = c *1.8 + 32 +459.67

        double c = 2.43;
        double f, k, re, ra;

        //f
        f = c * 1.0 + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;

        System.out.println("Celsius = "+ c);
        System.out.println("Kevin = "+ k);
        System.out.println("Fahrenheit = "+ f);
        System.out.println("Reaumur = "+ re);
        System.out.println("Rankine = "+ ra);





    }
}
