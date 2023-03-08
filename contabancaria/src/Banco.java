import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, agencia, numConta;
        double valor;
        System.out.println("digite nome");
        nome = ler.nextLine();
        System.out.println("digite a agencia");
        agencia = ler.next();
        System.out.println("digite o numero da conta");
        numConta = ler.next();
        Contabancaria cli1 = new Contabancaria(nome, agencia, numConta);

        System.out.println("digite o valor para deposito");
        valor = ler.nextDouble();
        cli1.depositar(valor);

        System.out.println("saldo atual:" + cli1.mostraSaldo());

        System.out.println("digite o valor para sacar");
        valor = ler.nextDouble();
        cli1.sacar(valor);

        System.out.println("saldo atual:" + cli1.mostraSaldo());
    }

}



