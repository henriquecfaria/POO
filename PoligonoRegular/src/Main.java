public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4,4);
        Triangulo t1 = new Triangulo(3,4);
       // PoligonoRegular q2 = new Quadrado(4,4);
        System.out.println("area do quadrado"+ q1.calcularArea());
        System.out.println("area do triangulo" +t1.calcularArea());

        System.out.println("perimetro do quadrado"+ q1.calculaPerimetro());
        System.out.println("perimetro do triangulo" +t1.calculaPerimetro());


    }
}
