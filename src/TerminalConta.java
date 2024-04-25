import java.util.Scanner;

public class TerminalConta {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número de sua conta: ");
        int numero = s.nextInt();
        s.nextLine(); // Consumindo o enter que o nextInt não reconhece. Estratégia retirada de:
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        System.out.println("Digite o número de sua agência (com dígito, se existir): ");
        String agencia = s.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = s.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = s.nextDouble();
        var conta = new ContaUsuario(numero, agencia, nomeCliente, saldo);
        conta.imprimeMensagem();
    }
}
