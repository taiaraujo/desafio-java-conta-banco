import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o número da sua conta: ");
        int numberCount = scanner.nextInt();

        System.out.println("Insira a sua agência: ");
        String bankAgency = scanner.next();

        System.out.println("Insira a seu nome: ");
        String clientName = scanner.next();

        System.out.println("Insira a seu saldo: ");
        Double bankBalance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
                        clientName, bankAgency, numberCount, bankBalance);

    }

}
