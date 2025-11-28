public class Artista {

    private String nomeArtista;
    private int idade;
    private String estilo;
    private String cnpj;



    public Artista(String nomeArtista, int idade, String estilo, String cnpj) {
        this.nomeArtista = nomeArtista;
        this.idade = idade;
        this.estilo = estilo;
        this.cnpj = cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNome(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getNome() {
        return nomeArtista;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString(){
        return "Artista [nome=" + nomeArtista + ", idade=" + idade + ", estilo=" + estilo + "]";
    }
}
