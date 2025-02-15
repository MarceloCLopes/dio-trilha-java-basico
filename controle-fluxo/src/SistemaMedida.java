public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "G";

    switch (sigla) {
      case "M":
        System.out.println("MÉDIO");
        break;
      case "P":
        System.out.println("PEQUENO");
        break;
      case "G":
        System.out.println("GRANDE");
        break;
      default:
        System.out.println("INDEFINIDO");
    }
  }
}
