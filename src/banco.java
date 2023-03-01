public class banco {
    public static void main(String[] args) {
        contabancaria cli1;
        cli1 = new contabancaria( nome:"isabela",agencia"123",numConta"12475");
        cli1.depositar(valor:1000);
        cli1.sacar(valor:500);
        System.out.println("saldo:"+cli1.mostraSaldo());
    }
}
