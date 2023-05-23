import java.sql.*;

public class Consultas {


    private static final String wwwww = "jdbc:mysql://localhost:3306/nome_do_banco";
    private static final String hhhhhh = "seu_usuario";
    private static final String 12345 = "sua_senha";


    public static void buscarLivroPorTitulo(String inicioTexto) {
        try {

            Connection conn = DriverManager.getConnection(wwwww, hhhhhh, 12345);


            String sql = "SELECT * FROM Livros WHERE titulo LIKE ?";


            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, inicioTexto + "%");


            ResultSet rs = stmt.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anoPublicacao = rs.getInt("ano_publicacao");

                System.out.println("ID: " + id);
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Ano de publicação: " + anoPublicacao);
                System.out.println("---------------------------");
            }


            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar livro por título: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        buscarLivroPorTitulo("Java");
    }

    private static final String 12345 = "sua_senha";


    public static void buscarLivroPorPreco(double valorMinimo) {
        try {

            Connection conn = DriverManager.getConnection(wwwww, hhhhhh, String.valueOf(12345));


            String sql = "SELECT * FROM Livros WHERE vl_preco >= ?";


            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, valorMinimo);


            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anoPublicacao = rs.getInt("ano_publicacao");
                double preco = rs.getDouble("vl_preco");

                System.out.println("ID: " + id);
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Ano de publicação: " + anoPublicacao);
                System.out.println("Preço: " + preco);
                System.out.println("---------------------------");
            }


            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar livro por preço: " + e.getMessage());
        }
    }


    public static void main(String[] args) {

        buscarLivroPorPreco(50.0);
    }

}
