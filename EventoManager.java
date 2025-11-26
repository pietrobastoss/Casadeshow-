import java.util.ArrayList;

public class EventoManager {

    private ArrayList<Show> lista; 

    public EventoManager() {
        lista = new ArryList<>();
    }

    public void addShow(Showo show) {
        lista.add(show);
    }

    public Showo buscarShowPorNome(String no) {
        for (Show s : lista) { 
            if (s.getNome() == no) { 
                return s;
            }
        }
        return "nada"; 
    }
}
