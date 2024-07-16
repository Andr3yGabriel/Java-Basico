import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da conta!");
        int NumeroConta = input.nextInt();
        input.nextLine(); // Consumir a linha pendente

        System.out.println("Digite o número da agência!");
        String NumeroAgencia = input.nextLine();

        System.out.println("Digite o seu nome!");
        String NomeCliente = input.nextLine();

        System.out.println("Insira seu saldo!");
        while (!input.hasNextFloat()) {
            System.out.println("Entrada inválida. Por favor, insira um valor numérico para o saldo.");
            input.next(); // Consumir a entrada inválida
        }

        float Saldo = input.nextFloat();
        input.close();

        // Saída de dados
        System.out.printf("Prezado %s, agradecemos por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo de R$%.2f já está disponível para saque.%n",
                NomeCliente, NumeroAgencia, NumeroConta, Saldo);
    }
}
