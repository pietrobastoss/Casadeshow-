
public class Ingresso {

    private int numeroIngresso;
    private double preco;
    private int numeroCadeira;
    private String tipo;
    private int QuantidadeIngresso;
    private String nomeCLiente;
    private String emailCliente;
    

    public Ingresso(Cliente c,Show s,int numeroIngresso, int QuantidadeIngresso, int numeroCadeira, double preco, String tipo) {
        this.numeroIngresso = numeroIngresso;
        this.preco =  preco * QuantidadeIngresso;
        this.numeroCadeira = numeroCadeira;
        this.tipo = tipo;
        this.nomeCLiente = c.getNome();
        this.emailCliente = c.getEmail();
    }

    public void setNumeroCadeira(int numeroCadeira) {
        this.numeroCadeira = numeroCadeira;
    }

    public int getNumeroCadeira() {
        return numeroCadeira;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setQuantidadeIngreco(int QuantidadeIngresso) {
        this.QuantidadeIngresso = QuantidadeIngresso;
    }

    public int getQuantidadeIngreco() {
        return QuantidadeIngresso;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getQuantidadeIngresso() {
        return QuantidadeIngresso;
    }

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setQuantidadeIngresso(int QuantidadeIngresso) {
        this.QuantidadeIngresso = QuantidadeIngresso;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    @Override
    public String toString() {
        return "Ingresso [id=" + numeroIngresso + ", preco=" + preco + ", numeroCadeira=" + numeroCadeira + ", tipo="
                + tipo + ", QuantidadeIngresso=" + QuantidadeIngresso + "]";
    }
}
