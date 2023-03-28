public class Funcionario {
    private String nome;
    private double salarioFixo;

    public Funcionario(String nome, double salarioFixo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularProventos() {
        return salarioFixo;
    }
}

public class FuncionarioPadrao extends Funcionario {
    public FuncionarioPadrao(String nome, double salarioFixo) {
        super(nome, salarioFixo);
    }

    public double calcularProventos() {
        return super.calcularProventos();
    }
}

public class FuncionarioProdutividade extends Funcionario {
    private double valorPorUnidade;

    public FuncionarioProdutividade(String nome, double salarioFixo, double valorPorUnidade) {
        super(nome, salarioFixo);
        this.valorPorUnidade = valorPorUnidade;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    public double calcularProventos() {
        return super.calcularProventos() + (getValorPorUnidade() * getProducao());
    }

    private int getProducao() {
        // Método para obter a produção do funcionário
        // Implementação a ser definida de acordo com a necessidade
        return 0;
    }
}

public class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, double salarioFixo, double comissao) {
        super(nome, salarioFixo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularProventos() {
        return super.calcularProventos() + (comissao * getVendasRealizadas());
    }

    private int getVendasRealizadas() {
        // Método para obter as vendas realizadas pelo funcionário comissionado
        // Implementação a ser definida de acordo com a necessidade
        return 0;
    }
}
