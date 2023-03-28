import java.util.Scanner;

class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeValor() {
        System.out.println("Ingresso Normal: R$" + getValor());
    }
}

class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValor() {
        System.out.println("Ingresso VIP: R$" + (getValor() + valorAdicional));
    }
}

class Camarote extends Ingresso {
    private double valorAdicional;
    private String localizacao;

    public Camarote(double valor, double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public void imprimeValor() {
        System.out.println("Ingresso Camarote (" + localizacao + "): R$" + (getValor() + valorAdicional));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Ingresso Normal");
        System.out.println("(2) VIP");
        System.out.println("(3) Camarote");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do ingresso:");
                double valorNormal = sc.nextDouble();
                Normal normal = new Normal(valorNormal);
                normal.imprimeValor();
                break;
            case 2:
                System.out.println("Digite o valor do ingresso:");
                double valorVIP = sc.nextDouble();
                System.out.println("Digite o valor adicional:");
                double valorAdicionalVIP = sc.nextDouble();
                VIP vip = new VIP(valorVIP, valorAdicionalVIP);
                vip.imprimeValor();
                break;
            case 3:
                System.out.println("Digite o valor do ingresso:");
                double valorCamarote = sc.nextDouble();
                System.out.println("Digite o valor adicional:");
                double valorAdicionalCamarote = sc.nextDouble();
                System.out.println("Digite a localização:");
                String localizacaoCamarote = sc.next();
                Camarote camarote = new Camarote(valorCamarote, valorAdicionalCamarote, localizacaoCamarote);
                camarote.imprimeValor();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        sc.close();
    }
}