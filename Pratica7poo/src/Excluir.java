import java.sql.*;

public class Excluir {


    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco";
    private static final String USUARIO = "seu_usuario";
    private static final String SENHA = "sua_senha";


    public static void excluirLivro(int id) {
        try {

            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);


            String sql = "DELETE FROM Livros WHERE id = ?";


            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);


            int linhasAfetadas = stmt.executeUpdate();


            stmt.close();
            conn.close();

            if (linhasAfetadas > 0) {
                System.out.println("Livro excluído com sucesso!");
            } else {
                System.out.println("Nenhum livro encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir o livro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        excluirLivro(1);
    }
}
