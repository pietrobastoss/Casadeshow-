
public class EventoManager {
    private String nomeManager;
    private long cnpj;
    private String emailManager;
    private long telefoneManager;

    public EventoManager(long cnpj, String emailManager, String nomeManager, long telefoneManager) {
        this.cnpj = cnpj;
        this.emailManager = emailManager;
        this.nomeManager = nomeManager;
        this.telefoneManager = telefoneManager;
    }

    public String getNomeManager() {
        return nomeManager;
    }

    public void setNomeManager(String nomeManager) {
        this.nomeManager = nomeManager;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailManager() {
        return emailManager;
    }

    public void setEmailManager(String emailManager) {
        this.emailManager = emailManager;
    }

    public long getTelefoneManager() {
        return telefoneManager;
    }

    public void setTelefoneManager(long telefoneManager) {
        this.telefoneManager = telefoneManager;
    }

    @Override
    public String toString() {
        return "EventoManager [nomeManager=" + nomeManager + ", cnpj=" + cnpj + ", emailManager=" + emailManager
                + ", telefoneManager=" + telefoneManager + "]";
    }
}
