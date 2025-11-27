public class Venda {

    private Cliente cliente;
    private Ingresso ingresso;

    public Venda(Cliente c, Ingresso i) {
        this.cliente = c;
        this.ingresso = i;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Ingresso getIngresso() {
        return ingresso;
    }
    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
    
    @Override
    public String toString() {
        return "Venda [cliente=" + cliente + ", ingresso=" + ingresso + "]";
    }
}
