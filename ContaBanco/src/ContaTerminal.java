import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String Nome;
        String Agencia;
        int NumeroConta;
        float Saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        Nome = scanner.next();

        System.out.println("Digite o numero da agencia: ");
        Agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        NumeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        Saldo = scanner.nextFloat();

        System.out.println("Ola " + Nome + ", obrigado por criar uma conta em nosso banco! Sua agencia e " + Agencia +
                " conta " + NumeroConta + " e seu saldo atual esta em " + Saldo);

        }
    }
