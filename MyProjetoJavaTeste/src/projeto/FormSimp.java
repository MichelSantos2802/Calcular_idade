package projeto;
import javax.swing.*;
import java.awt.*;

public class FormSimp {

    public static void main(String[] args) {
        JFrame janela = new JFrame("FORMULÁRIO BÁSICO DE DADOS PESSOAIS");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // CONFIGURA O FECHAMENTO DA JANELA
        janela.setSize(490, 190); // DEFINE O TAMANHO DA JANELA
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela

        // PAINEL DE CONTEÚDO COM LAYOUT EM GRADE 
        JPanel painelConteudo = new JPanel(new GridLayout(6, 4, 7, 7));//TAMANHO DOS CAMPOS EM VERTICAL E HORIZONTAL
        
        // CAMPOS DO FORMULÁRIO
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField campoNome = new JTextField(15);

        JLabel emailLabel = new JLabel("Email:");
        JTextField campoEmail = new JTextField(15);
        
        JLabel enderecoLabel = new JLabel("Seu endereço com Nº:");
        JTextField campoEndereco = new JTextField(15);
        
        JLabel telefoneLabel = new JLabel("Seu telefone:");
        JTextField campoTelefone = new JTextField(12);
        
        JLabel senhaLabel = new JLabel("Sua senha:");
        JPasswordField campoSenha = new JPasswordField(15); // JPasswordField para senha
        
        JButton botaoEnviar = new JButton("Enviar");// botão enviar

        painelConteudo.add(nomeLabel);
        painelConteudo.add(campoNome);
        painelConteudo.add(emailLabel);
        painelConteudo.add(campoEmail);        
        painelConteudo.add(enderecoLabel);
        painelConteudo.add(campoEndereco);
        painelConteudo.add(telefoneLabel);
        painelConteudo.add(campoTelefone);
        painelConteudo.add(senhaLabel);
        painelConteudo.add(campoSenha);
        
        painelConteudo.add(botaoEnviar);
        painelConteudo.add(new JLabel()); // Adiciona um espaço vazio no layout
        
        janela.add(painelConteudo);

        botaoEnviar.addActionListener(e -> {
            // Obter o texto digitado nos campos de nome, email e senha
            String nome = campoNome.getText();
            String email = campoEmail.getText();
            String senha = new String(campoSenha.getPassword()); // Obter a senha do JPasswordField

            // Verificar a senha
            if ("passatempo".equals(senha)) {
                // Carregar a imagem
                ImageIcon imagem = new ImageIcon("imagem.png");

                // Mostrar a imagem em um JOptionPane
                JOptionPane.showMessageDialog(janela, "Senha correta\nNome: " + nome + "\nEmail: " + email, "Informação", JOptionPane.INFORMATION_MESSAGE, imagem);
            } else {
                JOptionPane.showMessageDialog(janela, "Senha incorreta");
            }
        });
        
        janela.setVisible(true);
    }
}
