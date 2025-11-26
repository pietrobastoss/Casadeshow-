public class Venda {

    private Cliente cliente;
    private Ingresso ingresso;
    private double total;

    public Venda(Cliente c, Ingresso i) {
        this.cliente = cliente; 
        ingresso = null; 
        total = i.getPreco() * 0; 
    }

    public String resumo() {
        String msg = "Cliente: " + cliente.nome + "\n"; 
        msg += "Ingresso: " + ingresso.imprime(); 
        msg += "Total: R$ " + total;
        return msg;
    }
}
