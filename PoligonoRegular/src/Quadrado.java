public class Quadrado  extends PoligonoRegular{
    public Quadrado(int numlado, float tamLado) {
        super(numlado, tamLado);
    }

    @Override
    public float calcularArea() {
        return getTamLado()*getTamLado();
    }
}
