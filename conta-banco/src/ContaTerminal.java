import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo da Conta !");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá "
                .concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");

        System.out.println(mensagem);

        scanner.close();
    }
}
