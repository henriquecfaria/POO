public class Ingresso {
    private double valor;
    private int qtdemax;
    private String tipoIngresso;

    public Ingresso(double valor, int qtdemax, String tipoIngresso) {
        this.valor = valor;
        this.qtdemax = qtdemax;
        this.tipoIngresso = tipoIngresso;
    }

    public Ingresso(String camarote, double v) {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdemax() {
        return qtdemax;
    }

    public void setQtdemax(int qtdemax) {
        this.qtdemax = qtdemax;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}