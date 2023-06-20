public class UsuarioComum {
    String cpf;
    String DataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public UsuarioComum(String cpf, String dataNascimento) {
        this.cpf = cpf;
        DataNascimento = dataNascimento;
    }
}
