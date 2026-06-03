package view;

import components.GradientPanel;
import components.ModernButton;
import components.RoundedPanel;

import controller.AssistenteIAController;
import model.RespostaIA;

import javax.swing.*;
import java.awt.*;

public class AssistenteIAView extends JFrame {

    private JTextArea conversa;

    private JTextField pergunta;

    private AssistenteIAController controller;

    public AssistenteIAView() {

        controller =
                new AssistenteIAController();

        setTitle("Assistente IA");

        setSize(1400,800);

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

        // SIDEBAR

        JPanel sidebar =
                new JPanel();

        sidebar.setBackground(
                new Color(8,25,45)
        );

        sidebar.setBounds(
                0,
                0,
                260,
                800
        );

        sidebar.setLayout(null);

        JLabel logo =
                new JLabel("FeelTrack AI");

        logo.setForeground(
                Color.WHITE
        );

        logo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28
                )
        );

        logo.setBounds(
                30,
                40,
                220,
                40
        );

        ModernButton voltar =
                new ModernButton(
                        "Dashboard"
                );

        voltar.setBounds(
                20,
                700,
                210,
                48
        );

        voltar.addActionListener(e -> {

            dispose();

            new DashboardView();
        });

        sidebar.add(logo);
        sidebar.add(voltar);

        // TITULO

        JLabel titulo =
                new JLabel(
                        "Assistente Virtual IA"
                );

        titulo.setForeground(
                Color.WHITE
        );

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        36
                )
        );

        titulo.setBounds(
                320,
                40,
                600,
                40
        );

        JLabel sub =
                new JLabel(
                        "Converse com a inteligência artificial"
                );

        sub.setForeground(
                new Color(
                        220,
                        220,
                        220
                )
        );

        sub.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        sub.setBounds(
                323,
                85,
                500,
                25
        );

        // CARD

        RoundedPanel card =
                new RoundedPanel(
                        Color.WHITE
                );

        card.setLayout(null);

        card.setBounds(
                320,
                140,
                980,
                560
        );

        conversa =
                new JTextArea();

        conversa.setEditable(false);

        conversa.setLineWrap(true);

        conversa.setWrapStyleWord(true);

        conversa.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        conversa.setText(
        "🤖 FeelTrack AI\n\n"
        + "Olá, "
        + util.Sessao.nomeUsuario
        + "!\n\n"
        + "Sou seu assistente emocional.\n"
        + "Como posso ajudar hoje?\n\n"
);

        JScrollPane scroll =
                new JScrollPane(
                        conversa
                );

        scroll.setBounds(
                30,
                30,
                920,
                370
        );

        pergunta =
                new JTextField();

        pergunta.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        pergunta.setBounds(
                30,
                440,
                700,
                50
        );

        ModernButton enviar =
                new ModernButton(
                        "ENVIAR"
                );

        enviar.setBounds(
                760,
                440,
                180,
                50
        );

        enviar.addActionListener(e -> {

            enviarMensagem();
        });

        card.add(scroll);

        card.add(pergunta);

        card.add(enviar);

        background.add(sidebar);

        background.add(titulo);

        background.add(sub);

        background.add(card);

        add(background);
    }

    private void enviarMensagem() {

        String texto =
                pergunta.getText();

        if(texto.isBlank()) {

            return;
        }

        conversa.append(
                "👤 Você:\n"
                + texto
                + "\n\n"
        );

        pergunta.setText("");

        conversa.append(
                "🤖 IA:\nPensando...\n\n"
        );

        SwingUtilities.invokeLater(() -> {

            RespostaIA resposta =
                    controller.enviarMensagem(
                            texto
                    );

            String atual =
                    conversa.getText();

            atual =
                    atual.replace(
                            "🤖 IA:\nPensando...\n\n",
                            "🤖 IA:\n"
                            + resposta.getResposta()
                            + "\n\n"
                    );

            conversa.setText(
                    atual
            );
        });
    }
}