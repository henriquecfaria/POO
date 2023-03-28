public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
        this("", 0);
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("+-----------------------+");
        System.out.println("| PLACA:    " + placa + "    |");
        System.out.println("| ANO:      " + ano + "         |");
        System.out.println("+-----------------------+");
    }
}
