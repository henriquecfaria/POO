public class ProjetoSocial {
    import java.util.Date;

    class Projeto {
        private String nomProjeto;
        private String descricao;
        private Date datainicio;
        private Date datafim;

        public Projeto(String nomProjeto, String descricao, Date datainicio, Date datafim) {
            this.nomProjeto = nomProjeto;
            this.descricao = descricao;
            this.datainicio = datainicio;
            this.datafim = datafim;
        }

        public String getNomProjeto() {
            return nomProjeto;
        }

        public void setNomProjeto(String nomProjeto) {
            this.nomProjeto = nomProjeto;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public Date getDatainicio() {
            return datainicio;
        }

        public void setDatainicio(Date datainicio) {
            this.datainicio = datainicio;
        }

        public Date getDatafim() {
            return datafim;
        }

        public void setDatafim(Date datafim) {
            this.datafim = datafim;
        }
    }

    class Alimento {
        private String descAlimento;
        private int qtde;

        public Alimento(String descAlimento, int qtde) {
            this.descAlimento = descAlimento;
            this.qtde = qtde;
        }

        public String getDescAlimento() {
            return descAlimento;
        }

        public void setDescAlimento(String descAlimento) {
            this.descAlimento = descAlimento;
        }

        public int getQtde() {
            return qtde;
        }

        public void setQtde(int qtde) {
            this.qtde = qtde;
        }
    }

    class DistribuicaoAlimento extends Projeto {
        private Alimento alimento;

        public DistribuicaoAlimento(String nomProjeto, String descricao, Date datainicio, Date datafim, Alimento alimento) {
            super(nomProjeto, descricao, datainicio, datafim);
            this.alimento = alimento;
        }

        public Alimento getAlimento() {
            return alimento;
        }

        public void setAlimento(Alimento alimento) {
            this.alimento = alimento;
        }

        public boolean validaProjeto() {
            return getDatafim() == null;
        }

        public String imprimeProjeto() {
            return "Projeto: " + getNomProjeto() + "\nDescrição: " + getDescricao() +
                    "\nData de Início: " + getDatainicio() + "\nData de Fim: " + getDatafim() +
                    "\nAlimento: " + alimento.getDescAlimento() + "\nQuantidade: " + alimento.getQtde();
        }
    }

    class TrabalhoVoluntario extends Projeto {
        private int duracao;

        public TrabalhoVoluntario(String nomProjeto, String descricao, Date datainicio, Date datafim, int duracao) {
            super(nomProjeto, descricao, datainicio, datafim);
            this.duracao = duracao;
        }

        public int getDuracao() {
            return duracao;
        }

        public void setDuracao(int duracao) {
            this.duracao = duracao;
        }

        public boolean validaProjeto() {
            return duracao > 2;
        }
import java.util.Date;
import java.util.Scanner;

        public class ProjetoVoluntariado {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcao = 0;

                while (opcao != 3) {
                    System.out.println("Escolha uma opção:");
                    System.out.println("<1> Cadastrar Projeto Distribuir Alimentos");
                    System.out.println("<2> Cadastrar Projeto Trabalho Voluntário");
                    System.out.println("<3> Sair");

                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome do projeto:");
                            String nomProjeto = scanner.nextLine();

                            System.out.println("Digite a descrição do projeto:");
                            String descricao = scanner.nextLine();

                            System.out.println("Digite a data de início do projeto (dd/mm/aaaa):");
                            String datainicioStr = scanner.nextLine();
                            Date datainicio = parseDate(datainicioStr);

                            System.out.println("Digite a descrição do alimento:");
                            String descAlimento = scanner.nextLine();

                            System.out.println("Digite a quantidade de alimento:");
                            int qtde = scanner.nextInt();
                            scanner.nextLine();

                            Alimento alimento = new Alimento(descAlimento, qtde);
                            DistribuicaoAlimento projeto1 = new DistribuicaoAlimento(nomProjeto, descricao, datainicio, null, alimento);
                            if (projeto1.validaProjeto()) {
                                System.out.println(projeto1.imprimeProjeto());
                            } else {
                                System.out.println("Projeto inválido.");
                            }
                            break;

                        case 2:
                            System.out.println("Digite o nome do projeto:");
                            nomProjeto = scanner.nextLine();

                            System.out.println("Digite a descrição do projeto:");
                            descricao = scanner.nextLine();

                            System.out.println("Digite a data de início do projeto (dd/mm/aaaa):");
                            datainicioStr = scanner.nextLine();
                            datainicio = parseDate(datainicioStr);

                            System.out.println("Digite a duração do trabalho em horas:");
                            int duracao = scanner.nextInt();
                            scanner.nextLine();

                            TrabalhoVoluntario projeto2 = new TrabalhoVoluntario(nomProjeto, descricao, datainicio, null, duracao);
                            if (projeto2.validaProjeto()) {
                                System.out.println(projeto2.imprimeProjeto());
                            } else {
                                System.out.println("Projeto inválido.");
                            }
                            break;

                        case 3:
                            System.out.println("Encerrando programa...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }

                scanner.close();
            }

            public static Date parseDate(String str) {
                String[] parts = str.split("/");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]) - 1;
                int year = Integer.parseInt(parts[2]) - 1900;
                return new Date(year, month, day);
            }
        }

        class Projeto {
            private String nomProjeto;
            private String descricao;
            private Date datainicio;
            private Date datafim;

            public Projeto(String nomProjeto, String descricao, Date datainicio, Date datafim) {
                this.nomProjeto = nomProjeto;
                this.descricao = descricao;
                this.datainicio = datainicio;

            }
