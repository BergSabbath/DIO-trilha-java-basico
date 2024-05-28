import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero da agencia: ");
        agencia = teclado.nextLine();

        System.out.println("Digite o numero de sua conta:");
        numero = teclado.nextInt();

        System.out.println("Digite Seu Nome:");
        nomeCliente = teclado.next();

        System.out.println("Digite seu saldo:");
        saldo = teclado.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é \n" 
        + agencia +" conta "+ numero + " e o seu saldo " + saldo + " já está disponivel para saque."
        );


    }

}
