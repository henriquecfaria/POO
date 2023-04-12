public class Triangulo extends PoligonoRegular {

    public Triangulo(int numlado, float tamLado) {
        super(numlado, tamLado);
    }

    @Override
    public float calcularArea() {
        return (getTamLado()*getTamLado())/2;
    }
}
