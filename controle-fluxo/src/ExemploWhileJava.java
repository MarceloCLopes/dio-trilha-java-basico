import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhileJava {
  public static void main(String[] args) {
    double mesada = 50.0;

    while (mesada > 0) {
      Double valorDoDoce = valorAleatorio();

      if (valorDoDoce > mesada) {
        valorDoDoce = mesada;       
      }
      System.out.println("Doce do valor: " + valorDoDoce + " Adicionado no carrinho");
      mesada = mesada - valorDoDoce;
    }

    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda a sua mesada em doces");
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }
}
