package view;

import components.GradientPanel;
import components.ModernButton;
import components.RoundedPanel;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame {

    public HomeView() {

        setTitle("FeelTrack AI");

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

        // ====================================================
        // LOGO
        // ====================================================

        JLabel logo =
                new JLabel("FeelTrack AI");

        logo.setForeground(Color.WHITE);

        logo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        54
                )
        );

        logo.setBounds(90,80,500,70);

        // ====================================================
        // SUBTITULO
        // ====================================================

        JLabel subtitulo =
                new JLabel(

                        "<html>"

                        + "Plataforma Inteligente de "
                        + "Acompanhamento Emocional"

                        + "<br><br>"

                        + "Tecnologia + Bem-estar + IA"

                        + "</html>"
                );

        subtitulo.setForeground(
                new Color(240,240,240)
        );

        subtitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        26
                )
        );

        // CORRIGIDO
        subtitulo.setBounds(
                95,
                180,
                650,
                180
        );

        // ====================================================
        // LINHA VISUAL
        // ====================================================

        JPanel linha =
                new JPanel();

        linha.setBackground(
                new Color(255,255,255,120)
        );

        linha.setBounds(
                100,
                350,
                550,
                3
        );

        // ====================================================
        // CARD PRINCIPAL
        // ====================================================

        RoundedPanel card =
                new RoundedPanel(

                        // MAIS PREMIUM
                        new Color(
                                255,
                                255,
                                255,
                                45
                        )
                );

        card.setLayout(null);

        card.setBounds(
                850,
                100,
                420,
                520
        );

        JLabel tituloCard =
                new JLabel("IA Emocional");

        tituloCard.setForeground(Color.WHITE);

        tituloCard.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        34
                )
        );

        tituloCard.setBounds(
                40,
                40,
                300,
                40
        );

        // ====================================================
        // TEXTO DO CARD
        // ====================================================

        JLabel texto =
                new JLabel(

                        "<html>"

                        + "• Detecta sinais de burnout<br><br>"

                        + "• Analisa emoções em tempo real<br><br>"

                        + "• Auxilia colaboradores e RH<br><br>"

                        + "• Gera recomendações inteligentes<br><br>"

                        + "• Plataforma focada em saúde mental<br><br>"

                        + "• Ambiente acolhedor e intuitivo"

                        + "</html>"
                );

        texto.setForeground(Color.WHITE);

        texto.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        20
                )
        );

        texto.setBounds(
                40,
                120,
                330,
                280
        );

        card.add(tituloCard);

        card.add(texto);

        // ====================================================
        // BOTÕES
        // ====================================================

        ModernButton entrar =
                new ModernButton("ENTRAR");

        entrar.setBounds(
                100,
                420,
                240,
                60
        );

        entrar.addActionListener(e -> {

            dispose();

            new LoginView();
        });

        ModernButton cadastrar =
                new ModernButton("CRIAR CONTA");

        cadastrar.setBounds(
                380,
                420,
                260,
                60
        );

        cadastrar.addActionListener(e -> {

            dispose();

            new CadastroView();
        });

        // ====================================================
        // FRASE
        // ====================================================

        JLabel frase =
                new JLabel(
                        "\"Cuidar da mente também é produtividade.\""
                );

        frase.setForeground(
                new Color(240,240,240)
        );

        frase.setFont(
                new Font(
                        "Segoe UI",
                        Font.ITALIC,
                        22
                )
        );

        frase.setBounds(
                100,
                620,
                700,
                40
        );

        // ====================================================
        // GLOW
        // ====================================================

        JPanel glow =
                new JPanel();

        glow.setBackground(
                new Color(255,255,255,35)
        );

        // CORRIGIDO
        glow.setBounds(
                920,
                120,
                280,
                280
        );

        // ====================================================
        // ADD
        // ====================================================

        background.add(glow);

        background.add(logo);

        background.add(subtitulo);

        background.add(linha);

        background.add(entrar);

        background.add(cadastrar);

        background.add(frase);

        background.add(card);

        add(background);
    }
}
