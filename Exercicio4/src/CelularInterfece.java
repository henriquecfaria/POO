 
    // Interface CelularInterface
    public interface CelularInterface {
        void ligar();
        void desligar();
        void usarCamera(boolean simNao);
        void usarFoneDeOuvido(boolean simNao);
        void controlarVolume(boolean simNao);
        boolean enviarMensagem();
        boolean acessarInternet();
        boolean verificarEmails();
        boolean assistirTV(boolean simNao);
        boolean acessarSistemaArquivos();
    }

    // Classe abstrata Celular
    public abstract class Celular implements CelularInterface {
        private double preco;
        private boolean enviarMensagem;
        private boolean acessarInternet;
        private boolean verificarEmails;
        private boolean assistirTV;
        private boolean acessarSistemaArquivos;

        public Celular(double preco, boolean enviarMensagem, boolean acessarInternet,
                       boolean verificarEmails, boolean assistirTV, boolean acessarSistemaArquivos) {
            this.preco = preco;
            this.enviarMensagem = enviarMensagem;
            this.acessarInternet = acessarInternet;
            this.verificarEmails = verificarEmails;
            this.assistirTV = assistirTV;
            this.acessarSistemaArquivos = acessarSistemaArquivos;
        }


        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public boolean isEnviarMensagem() {
            return enviarMensagem;
        }

        public void setEnviarMensagem(boolean enviarMensagem) {
            this.enviarMensagem = enviarMensagem;
        }

        public boolean isAcessarInternet() {
            return acessarInternet;
        }

        public void setAcessarInternet(boolean acessarInternet) {
            this.acessarInternet = acessarInternet;
        }

        public boolean isVerificarEmails() {
            return verificarEmails;
        }

        public void setVerificarEmails(boolean verificarEmails) {
            this.verificarEmails = verificarEmails;
        }

        public boolean isAssistirTV() {
            return assistirTV;
        }

        public void setAssistirTV(boolean assistirTV) {
            this.assistirTV = assistirTV;
        }

        public boolean isAcessarSistemaArquivos() {
            return acessarSistemaArquivos;
        }

        public void setAcessarSistemaArquivos(boolean acessarSistemaArquivos) {
            this.acessarSistemaArquivos = acessarSistemaArquivos;
        }
    }

    // Classe CelularFabricanteA
    public class CelularFabricanteA extends Celular {
        private boolean temTV;

        public CelularFabricanteA(double preco, boolean enviarMensagem, boolean acessarInternet,
                                  boolean verificarEmails, boolean assistirTV, boolean acessarSistemaArquivos, boolean temTV) {
            super(preco, enviarMensagem, acessarInternet, verificarEmails, assistirTV, acessarSistemaArquivos);
            this.temTV = temTV;
        }

        // Implementação dos métodos da interface
        public void ligar() {
            System.out.println("Ligando o celular");
        }

        public void desligar() {


        }
