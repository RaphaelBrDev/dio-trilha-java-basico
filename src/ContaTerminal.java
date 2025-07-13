import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta.");
        Integer numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Código da Agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do titular da conta.");
        String nomeCliente = in.nextLine();

        System.out.println("Por favor, digite o saldo da conta.");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível.");

        }

    }