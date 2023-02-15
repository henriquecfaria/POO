import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com a velocidade media");
        int velocidade = ler.nextInt();
        System.out.println("entre com o tempo gasto ");
        int tempo = ler.nextInt();
        System.out.println("entre com capacidade de km por litro ");
        int capacidade = ler.nextInt();
        int distancia = velocidade * tempo;
        int combustivel = distancia/capacidade;
        System.out.println("gasto combustivel" + combustivel + "litros");





    }
}
