
package view;

import components.AnimatedBreathingPanel;
import components.GradientPanel;
import components.ModernButton;
import components.RoundedPanel;

import javax.swing.*;
import java.awt.*;

public class DashboardView extends JFrame {

    public DashboardView() {

        setTitle("FeelTrack AI");

        setSize(1500, 850);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);

        criarTela();

        setVisible(true);
    }

    private void criarTela() {

        GradientPanel background = new GradientPanel();

        background.setLayout(null);

        // ====================================================
        // SIDEBAR
        // ====================================================

        JPanel sidebar = new JPanel();

        sidebar.setBackground(new Color(8, 25, 45));

        sidebar.setBounds(0,0,260,850);

        sidebar.setLayout(null);

        JLabel logo = new JLabel("FeelTrack AI");

        logo.setForeground(Color.WHITE);

        logo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28
                )
        );

        logo.setBounds(30,40,220,40);

        JLabel sub = new JLabel("Mental Health System");

        sub.setForeground(new Color(180,180,180));

        sub.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15
                )
        );

        sub.setBounds(32,78,200,25);

        // MENU

        ModernButton dashboard =
                new ModernButton("Dashboard");

        dashboard.setBounds(20,170,210,48);

        ModernButton questionario =
                new ModernButton("Questionário");
        
        ModernButton assistenteIA =
        new ModernButton("🤖 Assistente IA");

assistenteIA.setBounds(
        20,
        300,
        210,
        48
);

assistenteIA.addActionListener(e -> {

    dispose();

    new AssistenteIAView();
});

        questionario.setBounds(20,235,210,48);

        questionario.addActionListener(e -> {

            dispose();

            new QuestionarioView();
        });

        ModernButton suporte =
                new ModernButton("Suporte");

        suporte.setBounds(
        20,
        365,
        210,
        48
);

        suporte.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    null,
                    "SUPORTE EMOCIONAL\n\n"
                            + "CVV: 188\n"
                            + "WhatsApp: (86) 99999-9999\n"
                            + "Email: suporte@feeltrack.com"
            );
        });

        ModernButton relax =
                new ModernButton("Relaxamento");

        relax.setBounds(
        20,
        430,
        210,
        48
);

        relax.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    null,
                    "Faça uma pausa.\n\n"
                            + "Respire lentamente.\n"
                            + "Alongue o corpo.\n"
                            + "Descanse sua mente."
            );
        });

        ModernButton sair =
                new ModernButton("Sair");

        sair.setBounds(20,720,210,48);

        sair.addActionListener(e -> {

            dispose();

            new HomeView();
        });

        sidebar.add(logo);
sidebar.add(sub);

sidebar.add(dashboard);
sidebar.add(questionario);
sidebar.add(assistenteIA);

sidebar.add(suporte);
sidebar.add(relax);
sidebar.add(sair);

        // ====================================================
        // TITULO
        // ====================================================

        JLabel titulo = new JLabel(
                "Dashboard Emocional"
        );

        titulo.setForeground(Color.WHITE);

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        36
                )
        );

        titulo.setBounds(310,35,500,40);

        JLabel subtitulo = new JLabel(
                "Monitoramento inteligente de bem-estar"
        );

        subtitulo.setForeground(
                new Color(220,220,220)
        );

        subtitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        subtitulo.setBounds(312,78,420,25);

        // ====================================================
        // CARD STATUS
        // ====================================================

        RoundedPanel status =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        status.setLayout(null);

        status.setBounds(310,140,280,150);

        JLabel st1 = new JLabel("Estado Atual");

        st1.setForeground(new Color(30,30,30));

        st1.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        24
                )
        );

        st1.setBounds(25,20,200,30);

        JLabel st2 = new JLabel("Estável");

        st2.setForeground(
                new Color(0,190,90)
        );

        st2.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        38
                )
        );

        st2.setBounds(25,70,220,45);

        status.add(st1);
        status.add(st2);

        // ====================================================
        // CARD IA
        // ====================================================

        RoundedPanel ia =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        ia.setLayout(null);

        ia.setBounds(620,140,350,150);

        JLabel iaTitulo = new JLabel(
                "Análise Inteligente"
        );

        iaTitulo.setForeground(
                new Color(30,30,30)
        );

        iaTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        24
                )
        );

        iaTitulo.setBounds(25,20,250,30);

        JLabel iaTexto = new JLabel(
                "<html>"
                        + "A IA detectou equilíbrio "
                        + "emocional nas últimas "
                        + "interações realizadas."
                        + "</html>"
        );

        iaTexto.setForeground(
                new Color(90,90,90)
        );

        iaTexto.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        16
                )
        );

        iaTexto.setBounds(25,65,280,60);

        ia.add(iaTitulo);
        ia.add(iaTexto);

        // ====================================================
        // CARD AJUDA
        // ====================================================

        RoundedPanel ajuda =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        ajuda.setLayout(null);

        ajuda.setBounds(1000,140,380,150);

        JLabel ajudaTitulo = new JLabel(
                "Dicas Rápidas"
        );

        ajudaTitulo.setForeground(
                new Color(30,30,30)
        );

        ajudaTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        24
                )
        );

        ajudaTitulo.setBounds(25,20,220,30);

        JLabel dicas = new JLabel(
                "<html>"
                        + "• Faça pausas<br>"
                        + "• Respire profundamente<br>"
                        + "• Hidrate-se<br>"
                        + "• Alongue o corpo"
                        + "</html>"
        );

        dicas.setForeground(
                new Color(90,90,90)
        );

        dicas.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        16
                )
        );

        dicas.setBounds(25,60,250,80);

        ajuda.add(ajudaTitulo);
        ajuda.add(dicas);

        // ====================================================
        // CARD RESPIRAÇÃO
        // ====================================================

        RoundedPanel respiracao =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        respiracao.setLayout(null);

        respiracao.setBounds(310,340,500,330);

        JLabel respTitulo = new JLabel(
                "Respiração Guiada"
        );

        respTitulo.setForeground(
                new Color(30,30,30)
        );

        respTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28
                )
        );

        respTitulo.setBounds(30,20,300,35);

        JLabel respSub = new JLabel(
                "Acompanhe o ritmo da animação"
        );

        respSub.setForeground(
                new Color(120,120,120)
        );

        respSub.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15
                )
        );

        respSub.setBounds(32,58,250,20);

        AnimatedBreathingPanel breathing =
                new AnimatedBreathingPanel();

        breathing.setBounds(90,90,300,210);

        respiracao.add(respTitulo);
        respiracao.add(respSub);
        respiracao.add(breathing);

        // ====================================================
        // CARD RELAXAMENTO
        // ====================================================

        RoundedPanel relaxamento =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        relaxamento.setLayout(null);

        relaxamento.setBounds(850,340,530,330);

        JLabel relaxTitulo = new JLabel(
                "Área de Relaxamento"
        );

        relaxTitulo.setForeground(
                new Color(30,30,30)
        );

        relaxTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28
                )
        );

        relaxTitulo.setBounds(30,20,350,35);

        JLabel relaxTexto = new JLabel(
                "<html>"
                        + "Respire lentamente.<br><br>"
                        + "Feche os olhos por alguns segundos.<br><br>"
                        + "Você merece equilíbrio emocional.<br><br>"
                        + "Sua saúde mental é importante."
                        + "</html>"
        );

        relaxTexto.setForeground(
                new Color(90,90,90)
        );

        relaxTexto.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        relaxTexto.setBounds(30,80,420,180);

        relaxamento.add(relaxTitulo);
        relaxamento.add(relaxTexto);

        // ====================================================
        // ADD COMPONENTES
        // ====================================================

        background.add(sidebar);

        background.add(titulo);
        background.add(subtitulo);

        background.add(status);
        background.add(ia);
        background.add(ajuda);

        background.add(respiracao);

        background.add(relaxamento);

        add(background);
    }
}



