public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
        // Variáveis
       double salario = 2500;
       System.out.println(salario);

       boolean verdadeiro = true;
       boolean falso = false;
       System.out.println(verdadeiro);
       System.out.println(falso);

       String nome = "Lucas";
       System.out.println(nome);

       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal;
       System.out.println(numeroCurto2);

       int numero = 5;
       numero = 10;
       System.out.println(numero);

       //    Constantes
       final double VALOR_DE_PI = 3.14;
       System.out.println(VALOR_DE_PI);
    }
}
