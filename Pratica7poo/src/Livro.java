import java.sql.*;

public class Livro {


    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco";
    private static final String USUARIO = "seu_usuario";
    private static final String SENHA = "sua_senha";

    public static void inserirLivro(String titulo, String autor, int anoPublicacao) {
        try {

            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);


            String sql = "INSERT INTO Livros (titulo, autor, ano_publicacao) VALUES (?, ?, ?)";


            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.setString(2, autor);
            stmt.setInt(3, anoPublicacao);


            stmt.executeUpdate();

            stmt.close();
            conn.close();

            System.out.println("Registro inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o registro: " + e.getMessage());
        }
    }


    public static void main(String[] args) {

        inserirLivro("Java for Beginners", "John Smith", 2023);
    }
}
