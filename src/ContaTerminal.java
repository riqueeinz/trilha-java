import java.util.Scanner;

public class ContaTerminal {
    public static class contaTerminal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Por favor, digite o número da Agência: ");
            int agencia = scanner.nextInt();

            System.out.print("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo da conta: ");
            double saldo = scanner.nextDouble();

            // Fechando o scanner para liberar recursos
            scanner.close();

            // Exibindo as informações inseridas pelo usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo
                    + " já está disponível para saque.");
        }
    }
}
