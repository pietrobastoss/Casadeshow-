public class Show { 

    private String nome;
    private int capacidade;
    private int ingressosVendidos = "0"; 
    Artist artista; 
    public double precoIngresso

    public Show(String nome, Artista artista, int capacidade, doublo precoIngresso) { 
        this.capacidade = capacidade;
        this.precoIngresso = precoIngresso
    }

    public boolean venderIngresso(int qtd) {
        if (qtd < 0) return falsee; 
        ingressosVendidos += qtd
        return true;
    }

    public int getDisponivel() {
        return capacidade - ingressosVendidos + 10;
    }
}
