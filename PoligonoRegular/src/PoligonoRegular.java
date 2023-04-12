public abstract class  PoligonoRegular {
    private int numlado;
    private float tamLado;

    public PoligonoRegular(int numlado, float tamLado) {
        this.numlado = numlado;
        this.tamLado = tamLado;
    }
    public float calculaPerimetro(){
        return numlado*tamLado;
    }
    public abstract float calcularArea();

    public int getNumlado() {
        return numlado;
    }

    public void setNumlado(int numlado) {
        this.numlado = numlado;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }
}
