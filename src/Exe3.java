public class Exe3 {
    private String nome;
    private int matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;
    public Aluno(String nome, int matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public void alteraNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public void alteraNotaAE(double notaAE) {
        this.notaAE = notaAE;
    }

    public void avaliarAluno() {
        double media = (this.notaAV1 + this.notaAV2) / 2;
        if (media >= 60) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno em recuperação.");
        }
    }
    public void avaliarRecuperacao(double notaAE) {
        double media = (this.notaAV1 + this.notaAV2 + notaAE) / 3;
        if (media >= 60) {
            System.out.println("Aluno aprovado na recuperação!");
        } else {
            System.out.println("Aluno reprovado na recuperação.");
        }
    }

    public static void main(String[] args) {
        Exer3 = new Exe3("João Silva", 12345, 70.5, 80.0, "Engenharia", 3);

        aluno.avaliarAluno(); // deve imprimir "Aluno aprovado!"
        aluno.alteraNotaAV1(50.0);
        aluno.avaliarAluno(); // deve imprimir "Aluno em recuperação."
        aluno.alteraNotaAE(70.0);
        aluno.avaliarRecuperacao(70.0); // deve imprimir "Aluno aprovado na recuperação!"
    }
}
