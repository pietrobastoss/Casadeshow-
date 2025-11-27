import java.util.*;

public class Relatorio {
    private List<Cliente> listaDeClientes = new ArrayList<>();
    private List<EventoManager> listaDeEventos = new ArrayList<>();
    private List<Venda> listaDeVendas = new ArrayList<>();
    private List<Show> listaDeShows = new ArrayList<>();
    private List<Relatorio> listaDeRelatorio = new ArrayList<>();

    public void listarClientes(List<Cliente> listaDeClientes){
        listaDeClientes.forEach(c -> System.out.println(c));
    }

    public void listaDeEventos(List<EventoManager> listaDeEvento){
        listaDeEvento.forEach(e -> System.out.println(e));
    }

    public void listaDeVendas(List<Venda> listaDeVendas){
        listaDeVendas.forEach(v -> System.out.println(v));
    }

    public void listaDeShows(List<Show> listaDeShows){
        listaDeShows.forEach(s -> System.out.println(s));
    }

    public void listaDeRelatorio(List<Relatorio> listaDeRelatorio){
        listaDeRelatorio.forEach(r -> System.out.println(r));
    }
    
}
