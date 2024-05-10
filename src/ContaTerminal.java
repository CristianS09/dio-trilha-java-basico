import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua Agência:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu número:");
        int numero = scanner.nextInt();

        String resultado = "".concat( "Olá " + nomeCliente + ",")
        .concat(" obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",")
        .concat(" conta " + numero).concat(" e seu saldo de " + saldo + "R$" + " já está disponível.");
        System.out.println(resultado);
    }
}