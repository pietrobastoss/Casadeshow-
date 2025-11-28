import java.time.LocalDate;
import java.util.*;

public class Show {
    private List<Artista> artistas = new ArrayList<>();
    private List<Show> shows = new ArrayList<>();

    // Atributos
    private String nome;
    private int capacidade;
    private String categoria;
    private LocalDate data;
    private String local;
    private String horario;
    private boolean necessidadeAssento;

    // Construtor
    public Show() {    }
    public Show(String nome, int capacidade, String categoria, LocalDate data, String local, String horario,
            boolean necessidadeAssento) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.categoria = categoria;
        this.data = data;
        this.local = local;
        this.horario = horario;
        this.necessidadeAssento = necessidadeAssento;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isNecessidadeAssento() {
        return necessidadeAssento;
    }

    public void setNecessidadeAssento(boolean necessidadeAssento) {
        this.necessidadeAssento = necessidadeAssento;

        // métodos para cadastrar
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void adicionarShow(Show show) {
        shows.add(show);
    }

    @Override
    public String toString() {
        return "Show [nome=" + nome + ", capacidade=" + capacidade + ", categoria=" + categoria + ", data=" + data
                + ", local=" + local + ", horario=" + horario + ", necessidadeAssento=" + necessidadeAssento + "]";
    }
}