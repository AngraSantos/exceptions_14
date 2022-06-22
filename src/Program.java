import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os dados da conta: ");
        System.out.print("Número: ");
        String number = input.nextLine();

        System.out.print("Títular: ");
        input.nextLine(); //Quando é String não precisa de conversão declarando o tipo da variável
        String holder = input.nextLine(); //Relacionando o tipo de dado a receber com o objeto da outra classe

        System.out.println("Saldo inicial: ");
        double balance = input.nextDouble();

        System.out.println("Limite de saque: ");
        double withdrawLimit = input.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = input.nextDouble();

        try {
            acc.withDraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch(BusinessException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
