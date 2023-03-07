public class Exe2 {
        private String nome;
        private double salario;
        private int horasAula;

        double getGastos() {
            return this.salario + (this.horasAula * 40);
        }
        String getInfo() {
            return "nome: " + this.nome + ", com salário: R$" + getGastos();
        }
    }
    public class Main {
        public static void main(String[] args) {
            Exer2 empregado = new Exer2();
            empregado.nome = "Italo";
            empregado.salario = 2000;
            empregado.horasAula = 20;

            System.out.println("Gastos: R$" + empregado.getGastos());
            System.out.println(empregado.getInfo());
        }
    }
