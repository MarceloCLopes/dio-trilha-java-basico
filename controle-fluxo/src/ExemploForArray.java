public class ExemploForArray {
  public static void main(String[] args) {
    String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};

    // for
    for (int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
    }

    // foreach
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
