package exercicio3notas;

public class Aluno {
    private String nome;
    private  String matricula;
    double notaAV1, notaAV2,notaAE;
    private String curso;
    private int periodo;
    private double somaNota;

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }
    public void alterarAV1(double nota) {
        this.notaAV1=nota;


    }
    public void alterarAV2(double nota) {
        this.notaAV2=nota;


    }

    public void alterarAE(double nota) {
        this.notaAE=nota;

    }
    public void avaliarAluno(){
        somaNota=this.notaAV1+this.notaAV1;
        if(somaNota>=60)
            System.out.println("aprovado");
        else
            System.out.println("recuperação");

    }
    public void avaliarRecuperacao(double notaAE){
        if (((somaNota+notaAE)/2)>=60)
            System.out.println("Aprovado");
        else
            System.out.println("reprovado");
    }
}
