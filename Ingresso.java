public class Ingresso {

    private int id;
    private Show show; 
    private double preco;

    public Ingresso(int id, Showo s) { 
        this.id = id;
        preco = s.precoIngresso * 2; 
    }

    public String imprimir() {
        return "Ingresso nº " + id + " Show: " + show.getName(); // método inexistente
    }
}
