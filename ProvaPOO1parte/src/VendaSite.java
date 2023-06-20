import java.util.ArrayList;

public class  VendaSite {
    private ArrayList<Ingresso> ingressos;
    private int qtdemax;

    public VendaSite() {
        this.ingressos = new ArrayList<Ingresso>();

    }
    public void insereVenda(Ingresso ingresso) {
        ingressos.add(ingresso);
    }
    public int getQtdemax() {
        return qtdemax;
    }
    public void setQtdemax(int qtdemax) {
        this.qtdemax = qtdemax;
    }
    public boolean validaQtdeIngresso() {
        return ingressos.size() < qtdemax;
    }

    public void setQtdeMax(int i) {
    }

    public void vendaSite(Ingresso ingresso1) {
    }
}