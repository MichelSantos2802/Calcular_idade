package projeto;

import javax.swing.*;
import java.awt.*;

public class FormularioSimples {

    public static void main(String[] args) {

        // Cria a janela principal
        JFrame janela = new JFrame("Formulário Simples");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura o fechamento da janela
        janela.setSize(200, 150); // Define o tamanho da janela
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela

        // Cria o painel de conteúdo com layout em grade
        JPanel painelConteudo = new JPanel(new GridLayout(3, 2, 5, 5));

        // Cria os componentes do formulário
        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(15);

        JLabel labelEmail = new JLabel("Email:");
        JTextField campoEmail = new JTextField(15);

        JButton botaoEnviar = new JButton("Enviar");

        // Adiciona os componentes ao painel de conteúdo
        painelConteudo.add(labelNome);
        painelConteudo.add(campoNome);
        painelConteudo.add(labelEmail);
        painelConteudo.add(campoEmail);
        painelConteudo.add(new JLabel()); // Adiciona um espaço vazio no layout
        painelConteudo.add(botaoEnviar);

        // Adiciona o painel de conteúdo à janela
        janela.add(painelConteudo);

        // Ação do botão Enviar
        botaoEnviar.addActionListener(e -> {
            // Obter o texto digitado nos campos de nome e email
            String nome = campoNome.getText();
            String email = campoEmail.getText();
            System.out.println(campoNome.getText());
            System.out.println(campoEmail.getText());

            // Exibir mensagem de confirmação
            JOptionPane.showMessageDialog(janela, "Nome: " + nome + "\nEmail: " + email);
        });
        	
        // Torna a janela visível
        janela.setVisible(true);
    }
}
