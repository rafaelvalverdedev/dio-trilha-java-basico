import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        double saldo = 0.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o numero da agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor digite o número da conta: ");
        int numero = scanner.nextInt();

        scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência e conta é "
        + agencia + "-" + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
