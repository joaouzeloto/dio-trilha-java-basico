import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args)
    {
        int numero;
        String agencia,nomeCliente;
        double saldo;
        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite seu nome!");
        System.out.print("usuario: ");
        nomeCliente = leitura.nextLine();
        System.out.println("Por favor, digite a agência!");
        System.out.print("usuario: ");
        agencia = leitura.nextLine();
        System.out.println("Por favor, digite o número da sua agência");
        System.out.print("usuario: ");
        numero = leitura.nextInt();
        System.out.println("Por favor, digite seu saldo!");
        System.out.print("usuario: ");
        saldo = leitura.nextDouble();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " +numero+" e seu saldo R$:"+saldo+" já está disponível para saque.");



    }
}
