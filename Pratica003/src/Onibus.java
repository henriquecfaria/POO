public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados() {
        System.out.println("+-----------------------+");
        System.out.println("| PLACA:    " + getPlaca() + "    |");
        System.out.println("| ANO:      " + getAno() + "         |");
        System.out.println("| ASSENTOS: " + assentos + "            |");
        System.out.println("+-----------------------+");
    }
}
