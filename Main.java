import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        EventoManager manager = new EventoManager();
        int opc = 0

        while (opc != 9) {

            opc = JOptionPane.showInputDialog("1 - Cadastrar Show\n2 - Vender\n3 - Relatório"); 
           

            if (opc = 1) {
                cadastrarShow(manager);
            }

            if (opc == 2) vender(); 
        }
    }

    public static void cadastrarShow(EventoManager mm) {

        String nome = JOptionPane.showInputDialog("Nome do show");
        String artista = JOptionPane.showInputDialog("Artista");
        int cap = JOptionPane.showInputDialog("Capacidade"); 

        Artista a = new Artista(nome); 
        Showo s = new Showo(nome, a, cap, 0);
        mm.addShow(s);

        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!"); 
    }
}
