public class Operadores {
  public static void main(String[] args) {
    int numero1, numero2;
    numero1 = 1;
    numero2 = 2;
    
    // Operador ternário
    String resultado = numero1 == numero2 ? "verdadeiro" : "falso";
    System.out.println(resultado);
    
    // Operadores relacionais
    boolean simNao = numero1 == numero2;
    
    if (numero1 < numero2) {
      System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numero1 é igual a numero2? " + simNao);
   
    simNao = numero1 != numero2;
    System.out.println("numero1 é diferente a numero2? " + simNao);
    
    simNao = numero1 > numero2;
    System.out.println("numero1 é maior que numero2? " + simNao); 

    // Operadores lógicos
    boolean condicao1 = true;
    boolean condicao2 = true;

    if (condicao1 && condicao2) {
      System.out.println("as duas condições são verdadeiras");    
    }

    if (condicao1 || condicao2) {
      System.out.println("pelo menos uma condição é verdadeira");
    }
    System.out.println("fim");
  }
}
