import java.util.ArrayList;

public class Main {
    public static <PessoaFisica> void main(String[] args) {
        ArrayList<PessoaFisica> pessoas = new ArrayList<>();
        ArrayList<Promotor> promotores = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Ingresso> ingressos = new ArrayList<>();


        PessoaFisica pessoa1 = new PessoaFisica("João", "111.111.111-11", "joao@example.com");
        pessoas.add(pessoa1);


        Promotor promotor1 = new Promotor("Promotor1", "promotor1@example.com");
        promotores.add(promotor1);


        Evento evento1 = new Evento("Show", "2023-07-01", promotor1);
        eventos.add(evento1);


        Ingresso ingresso1 = new Ingresso("VIP", 100.0);
        Ingresso ingresso2 = new Ingresso("CAMAROTE", 80.0);
        Ingresso ingresso3 = new Ingresso("PISTA", 60.0);

        evento1.adicionarIngresso(ingresso1);
        evento1.adicionarIngresso(ingresso2);
        evento1.adicionarIngresso(ingresso3);


        VendaSite vendaSite = new VendaSite();
        vendaSite.setQtdeMax(100);


        if (vendaSite.validaQtdeIngresso(ingresso1)) {
            vendaSite.vendaSite(ingresso1);
            ingressos.add(ingresso1);
        }

        if (vendaSite.validaQtdeIngresso(ingresso2)) {
            vendaSite.vendaSite(ingresso2);
            ingressos.add(ingresso2);
        }

        if (vendaSite.validaQtdeIngresso(ingresso3)) {
            vendaSite.vendaSite(ingresso3);
            ingressos.add(ingresso3);
        }
    }
}