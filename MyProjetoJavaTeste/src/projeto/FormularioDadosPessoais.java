package projeto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioDadosPessoais {
    public static void main(String[] args) {
        // Criar o frame principal
        JFrame frame = new JFrame("Dados Pessoais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Criar o painel principal e definir o layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10)); // GridLayout com 6 linhas e 2 colunas

        // Criar e adicionar os componentes
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        JTextField telefoneField = new JTextField(20);

        JLabel enderecoLabel = new JLabel("Endereço:");
        JTextField enderecoField = new JTextField(20);

        JLabel profissaoLabel = new JLabel("Profissão:");
        JTextField profissaoField = new JTextField(20);

        JButton enviarButton = new JButton("Enviar");

        // Adicionar componentes ao painel
        panel.add(nomeLabel);
        panel.add(nomeField);

        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(telefoneLabel);
        panel.add(telefoneField);

        panel.add(enderecoLabel);
        panel.add(enderecoField);

        panel.add(profissaoLabel);
        panel.add(profissaoField);

        panel.add(new JLabel()); // Espaço vazio
        panel.add(enviarButton);

        // Adicionar painel ao frame
        frame.add(panel);

        // Adicionar ação para o botão Enviar
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String email = emailField.getText();
                String telefone = telefoneField.getText();
                String endereco = enderecoField.getText();
                String profissao = profissaoField.getText();
                JOptionPane.showMessageDialog(null, "Dados salvo na base", "Alerta", JOptionPane.WARNING_MESSAGE);

                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("Telefone: " + telefone);
                System.out.println("Endereço: " + endereco);
                System.out.println("Profissão: " + profissao);
            }
        
        
        });
        
        // Exibir o frame
        frame.setVisible(true);
        
    }
}
