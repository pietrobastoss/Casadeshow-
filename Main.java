import java.awt.Dimension;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main {

    public static void main(String[] args) {
        String opcao = "";
        int opcaoInt = -1; // Inicializa com um valor que não encerra o loop

        // Listas para armazenar os dados
        List<Show> shows = new ArrayList<>();
        List<Artista> artistas = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Ingresso> ingressos = new ArrayList<>();
        
        do {
            String menu = "Escolha sua ação desejada:\n"
                        + "1. Cadastrar Show\n"
                        + "2. Cadastrar Artista\n"
                        + "3. Cadastrar Cliente\n"
                        + "4. Vender Ingresso\n"
                        + "5. Listar Shows\n"
                        + "6. Listar Artistas\n"
                        + "7. Listar Clientes\n"
                        + "8. Listar Ingressos Vendidos\n"
                        + "0. Sair";
            
            opcao = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            // Trata o caso do usuário fechar ou cancelar a caixa de diálogo
            if (opcao == null) {
                opcaoInt = 0; // Encerra o loop
            } else {
                try {
                    opcaoInt = Integer.parseInt(opcao);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
                    opcaoInt = -1; // Define uma opção inválida para continuar o loop
                    continue;
                }
            }
            
            switch (opcaoInt) {
                case 1: // Cadastrar Show
                    try {
                        JPanel panelShow = new JPanel();
                        JTextField nome = new JTextField(15);
                        JTextField capacidade = new JTextField(15);
                        JTextField categoria = new JTextField(15);
                        JTextField data = new JTextField(15); // Formato YYYY-MM-DD
                        JTextField local = new JTextField(15);
                        JTextField horario = new JTextField(15);
                        JTextField necessidadeAssento = new JTextField(15); // true ou false
                        
                        panelShow.add(new JLabel("Nome:"));
                        panelShow.add(nome);
                        panelShow.add(new JLabel("Capacidade:"));
                        panelShow.add(capacidade);
                        panelShow.add(new JLabel("Categoria:"));
                        panelShow.add(categoria);
                        panelShow.add(new JLabel("Data (YYYY-MM-DD):"));
                        panelShow.add(data);
                        panelShow.add(new JLabel("Local:"));
                        panelShow.add(local);
                        panelShow.add(new JLabel("Horário:"));
                        panelShow.add(horario);
                        panelShow.add(new JLabel("Precisa de Assento (true/false):"));
                        panelShow.add(necessidadeAssento);

                        int result = JOptionPane.showConfirmDialog(null, panelShow, "Cadastrar Show", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            String nomeS = nome.getText();
                            int cpcdS = Integer.parseInt(capacidade.getText());
                            String ctgS = categoria.getText();
                            LocalDate dtS = LocalDate.parse(data.getText());
                            String lclS = local.getText();
                            String hrS = horario.getText();
                            boolean assentoS = Boolean.parseBoolean(necessidadeAssento.getText());

                            Show novoShow = new Show(nomeS, cpcdS, ctgS, dtS, lclS, hrS, assentoS);
                            shows.add(novoShow);
                            JOptionPane.showMessageDialog(null, "Show cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (NumberFormatException | DateTimeParseException e) {
                        JOptionPane.showMessageDialog(null, "Erro no formato dos dados. Verifique os campos e tente novamente.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 2: // Cadastrar Artista
                    try {
                        JPanel panelArtista = new JPanel();
                        JTextField nomeArtista = new JTextField(15);
                        JTextField idade = new JTextField(15);
                        JTextField estilo = new JTextField(15);
                        JTextField cnpj = new JTextField(15);

                        panelArtista.add(new JLabel("Nome do Artista:"));
                        panelArtista.add(nomeArtista);
                        panelArtista.add(new JLabel("Idade:"));
                        panelArtista.add(idade);
                        panelArtista.add(new JLabel("Estilo Musical:"));
                        panelArtista.add(estilo);
                        panelArtista.add(new JLabel("CNPJ:"));
                        panelArtista.add(cnpj);

                        int result = JOptionPane.showConfirmDialog(null, panelArtista, "Cadastrar Artista", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            String nomeA = nomeArtista.getText();
                            int idadeA = Integer.parseInt(idade.getText());
                            String estiloA = estilo.getText();
                            String cnpjA = cnpj.getText();

                            Artista novoArtista = new Artista(nomeA, idadeA, estiloA, cnpjA);
                            artistas.add(novoArtista);
                            JOptionPane.showMessageDialog(null, "Artista cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro no formato da idade. Use apenas números.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 3: // Cadastrar Cliente
                    try {
                        JPanel panelCliente = new JPanel();
                        JTextField nome = new JTextField(15);
                        JTextField cpf = new JTextField(15);
                        JTextField idade = new JTextField(15);
                        JTextField email = new JTextField(15);
                        JTextField telefone = new JTextField(15);

                        panelCliente.add(new JLabel("Nome:"));
                        panelCliente.add(nome);
                        panelCliente.add(new JLabel("CPF:"));
                        panelCliente.add(cpf);
                        panelCliente.add(new JLabel("Idade:"));
                        panelCliente.add(idade);
                        panelCliente.add(new JLabel("Email:"));
                        panelCliente.add(email);
                        panelCliente.add(new JLabel("Telefone:"));
                        panelCliente.add(telefone);

                        int result = JOptionPane.showConfirmDialog(null, panelCliente, "Cadastrar Cliente", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            Cliente novoCliente = new Cliente();
                            novoCliente.setNome(nome.getText());
                            novoCliente.setCpf(Integer.parseInt(cpf.getText()));
                            novoCliente.setIdade(Integer.parseInt(idade.getText()));
                            novoCliente.setEmail(email.getText());
                            novoCliente.setTelefone(Integer.parseInt(telefone.getText()));
                            
                            clientes.add(novoCliente);
                            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro no formato de CPF, Idade ou Telefone. Use apenas números.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 4: // Vender Ingresso
                    if (clientes.isEmpty() || shows.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "É necessário ter ao menos um Cliente e um Show cadastrado para vender ingressos.", "Aviso", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    try {
                        // Para simplificar, pedimos o índice. Uma aplicação real usaria JComboBox.
                        String clienteIdxStr = JOptionPane.showInputDialog("Digite o número (ID) do cliente (começando em 0):");
                        int clienteIdx = Integer.parseInt(clienteIdxStr);
                        
                        String showIdxStr = JOptionPane.showInputDialog("Digite o número (ID) do show (começando em 0):");
                        int showIdx = Integer.parseInt(showIdxStr);

                        Cliente clienteSelecionado = clientes.get(clienteIdx);
                        Show showSelecionado = shows.get(showIdx);

                        JPanel panelIngresso = new JPanel();
                        JTextField quantidade = new JTextField(5);
                        JTextField preco = new JTextField(5);
                        JTextField tipo = new JTextField(10); // Pista, Cadeira, Camarote
                        JTextField numCadeira = new JTextField(5);

                        panelIngresso.add(new JLabel("Quantidade:"));
                        panelIngresso.add(quantidade);
                        panelIngresso.add(new JLabel("Preço Unitário:"));
                        panelIngresso.add(preco);
                        panelIngresso.add(new JLabel("Tipo (Pista, Cadeira, etc):"));
                        panelIngresso.add(tipo);
                        panelIngresso.add(new JLabel("Nº da Cadeira (se aplicável):"));
                        panelIngresso.add(numCadeira);

                        int result = JOptionPane.showConfirmDialog(null, panelIngresso, "Vender Ingresso", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            int qtd = Integer.parseInt(quantidade.getText());
                            double precoUnitario = Double.parseDouble(preco.getText());
                            String tipoIngresso = tipo.getText();
                            int cadeira = numCadeira.getText().isEmpty() ? 0 : Integer.parseInt(numCadeira.getText());
                            int numeroIngresso = ingressos.size() + 1; // Geração de ID simples

                            Ingresso novoIngresso = new Ingresso(clienteSelecionado, showSelecionado, numeroIngresso, qtd, cadeira, precoUnitario, tipoIngresso);
                            ingressos.add(novoIngresso);
                            JOptionPane.showMessageDialog(null, "Ingresso vendido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } catch (NumberFormatException | IndexOutOfBoundsException e) {
                        JOptionPane.showMessageDialog(null, "Erro: ID do cliente/show inválido ou formato de número incorreto.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 5: // Listar Shows
                    displayList("Lista de Shows", shows);
                    break;
                case 6: // Listar Artistas
                    displayList("Lista de Artistas", artistas);
                    break;
                case 7: // Listar Clientes
                    displayList("Lista de Clientes", clientes);
                    break;
                case 8: // Listar Ingressos
                    displayList("Lista de Ingressos Vendidos", ingressos);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.", "Até logo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    if (opcao != null) { // Evita mostrar erro ao cancelar/fechar
                        JOptionPane.showMessageDialog(null, "Opção não reconhecida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

            }
        } while (opcaoInt != 0);
    }

    // Método auxiliar para exibir listas em uma área de texto com rolagem
    public static void displayList(String title, List<?> list) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum item para listar.", title, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append("ID: ").append(i).append(" -> ").append(list.get(i).toString()).append("\n");
        }
        
        JTextArea textArea = new JTextArea(sb.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 300)); // Define um bom tamanho
        JOptionPane.showMessageDialog(null, scrollPane, title, JOptionPane.INFORMATION_MESSAGE);
    }
}