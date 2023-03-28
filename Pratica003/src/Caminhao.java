public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDados() {
        System.out.println("+-----------------------+");
        System.out.println("| PLACA:    " + getPlaca() + "    |");
        System.out.println("| ANO:      " + getAno() + "         |");
        System.out.println("+-----------------------+");
        System.out.println("| EIXOS:    " + eixos + "             |");
        System.out.println("+-----------------------+");
    }
}


