package view;

import components.GradientPanel;
import components.ModernButton;
import components.ModernPasswordField;
import components.ModernTextField;
import components.RoundedPanel;

import dao.UsuarioDAO;
import model.Usuario;
import util.Sessao;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    public LoginView() {

        setTitle("FeelTrack AI - Login");

        setSize(1400, 800);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);

        criarTela();

        setVisible(true);
    }

    private void criarTela() {

        GradientPanel background =
                new GradientPanel();

        background.setLayout(null);

        // =================================================
        // LADO ESQUERDO
        // =================================================

        JLabel logo =
                new JLabel("FeelTrack AI");

        logo.setForeground(Color.WHITE);

        logo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        52
                )
        );

        logo.setBounds(80,90,500,60);

        JLabel subtitulo =
                new JLabel(
                        "<html>"
                                + "Plataforma Inteligente de "
                                + "Acompanhamento Emocional"
                                + "</html>"
                );

        subtitulo.setForeground(
                new Color(230,230,230)
        );

        subtitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        28
                )
        );

        subtitulo.setBounds(85,180,550,90);

        JLabel frase =
                new JLabel(
                        "\"Sua saúde mental importa.\""
                );

        frase.setForeground(
                new Color(240,240,240)
        );

        frase.setFont(
                new Font(
                        "Segoe UI",
                        Font.ITALIC,
                        24
                )
        );

        frase.setBounds(85,650,500,40);

        // =================================================
        // CARD LOGIN
        // =================================================

        RoundedPanel card =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        card.setLayout(null);

        card.setBounds(820,110,420,540);

        JLabel titulo =
                new JLabel("Entrar");

        titulo.setForeground(
                new Color(20,20,20)
        );

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        38
                )
        );

        titulo.setBounds(45,40,250,50);

        JLabel desc =
                new JLabel(
                        "Faça login para continuar"
                );

        desc.setForeground(
                new Color(100,100,100)
        );

        desc.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        17
                )
        );

        desc.setBounds(48,88,250,25);

        // EMAIL

        JLabel emailLabel =
                new JLabel("Email");

        emailLabel.setForeground(
                new Color(40,40,40)
        );

        emailLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16
                )
        );

        emailLabel.setBounds(50,150,200,25);

        ModernTextField campoEmail =
                new ModernTextField();

        campoEmail.setBounds(50,180,320,50);

        // SENHA

        JLabel senhaLabel =
                new JLabel("Senha");

        senhaLabel.setForeground(
                new Color(40,40,40)
        );

        senhaLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16
                )
        );

        senhaLabel.setBounds(50,260,200,25);

        ModernPasswordField campoSenha =
                new ModernPasswordField();

        campoSenha.setBounds(50,290,320,50);

        // BOTÃO

        ModernButton entrar =
                new ModernButton("ENTRAR");

        entrar.setBounds(50,390,320,55);

        entrar.addActionListener(e -> {

            String email =
                    campoEmail.getText();

            String senha =
                    String.valueOf(
                            campoSenha.getPassword()
                    );

            if(email.isEmpty()
                    || senha.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Preencha todos os campos"
                );

                return;
            }

            UsuarioDAO dao =
                    new UsuarioDAO();

            Usuario usuario =
                    dao.autenticar(
                            email,
                            senha
                    );

            if(usuario != null){

                Sessao.nomeUsuario =
                        usuario.getNome();

                dispose();

                new DashboardView();

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Email ou senha inválidos"
                );
            }
        });

        // CADASTRO

        JLabel cadastroTexto =
                new JLabel(
                        "Não possui conta?"
                );

        cadastroTexto.setForeground(
                new Color(100,100,100)
        );

        cadastroTexto.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15
                )
        );

        cadastroTexto.setBounds(95,470,150,25);

        JButton criarConta =
                new JButton("Criar Conta");

        criarConta.setFocusPainted(false);

        criarConta.setBorderPainted(false);

        criarConta.setContentAreaFilled(false);

        criarConta.setForeground(
                new Color(0,120,255)
        );

        criarConta.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15
                )
        );

        criarConta.setBounds(215,468,120,28);

        criarConta.addActionListener(e -> {

            dispose();

            new CadastroView();
        });

        // ADD

        card.add(titulo);

        card.add(desc);

        card.add(emailLabel);

        card.add(campoEmail);

        card.add(senhaLabel);

        card.add(campoSenha);

        card.add(entrar);

        card.add(cadastroTexto);

        card.add(criarConta);

        background.add(logo);

        background.add(subtitulo);

        background.add(frase);

        background.add(card);

        add(background);
    }
}