import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("Selecione uma opção:");
            System.out.println("<1> Cadastrar Livro");
            System.out.println("<2> Pesquisar Livro por Preço");
            System.out.println("<3> Pesquisar Livro por Título");
            System.out.println("<4> Excluir Livro");
            System.out.println("<5> Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    System.out.println("Digite o valor mínimo do preço:");
                    double valorMinimo = scanner.nextDouble();
                    scanner.nextLine();
                    pesquisarLivroPorPreco(valorMinimo);
                    break;
                case 3:
                    System.out.println("Digite o início do título:");
                    String inicioTitulo = scanner.nextLine();
                    pesquisarLivroPorTitulo(inicioTitulo);
                    break;
                case 4:
                    System.out.println("Digite o ID do livro a ser excluído:");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();
                    excluirLivro(idLivro);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void cadastrarLivro() {

        System.out.println("Opção de cadastro selecionada.");
    }

    private static void pesquisarLivroPorPreco(double valorMinimo) {

        System.out.println("Opção de pesquisa por preço selecionada. Valor mínimo: " + valorMinimo);
    }

    private static void pesquisarLivroPorTitulo(String inicioTitulo) {

        System.out.println("Opção de pesquisa por título selecionada. Início do título: " + inicioTitulo);
    }

    private static void excluirLivro(int idLivro) {

        System.out.println("Opção de exclusão selecionada. ID do livro: " + idLivro);
    }
}
