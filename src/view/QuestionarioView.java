package view;

import components.GradientPanel;
import components.ModernButton;
import components.RoundedPanel;

import model.EstadoEmocional;
import model.HistoricoEmocional;

import javax.swing.*;
import java.awt.*;

public class QuestionarioView extends JFrame {

    public QuestionarioView() {

        setTitle("Questionário IA");

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

        // SIDEBAR

        JPanel sidebar = new JPanel();

        sidebar.setBackground(
                new Color(8,25,45)
        );

        sidebar.setBounds(0,0,260,800);

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

        ModernButton voltar =
                new ModernButton("Dashboard");

        voltar.setBounds(20,700,210,48);

        voltar.addActionListener(e -> {

            dispose();

            new DashboardView();
        });

        sidebar.add(logo);

        sidebar.add(voltar);

        // TITULO

        JLabel titulo = new JLabel(
                "Análise Emocional Inteligente"
        );

        titulo.setForeground(Color.WHITE);

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        36
                )
        );

        titulo.setBounds(320,40,700,40);

        JLabel sub = new JLabel(
                "Responda as perguntas abaixo"
        );

        sub.setForeground(
                new Color(220,220,220)
        );

        sub.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        sub.setBounds(323,85,400,25);

        // CARD

        RoundedPanel card =
                new RoundedPanel(
                        new Color(255,255,255)
                );

        card.setLayout(null);

        card.setBounds(320,140,850,520);

        // ESTRESSE

        JLabel p1 = criarPergunta(
                "Como está seu nível de estresse?"
        );

        p1.setBounds(60,50,500,30);

        JSlider stress =
                criarSlider();

        stress.setBounds(60,90,700,60);

        JLabel valor1 =
                criarValorLabel();

        valor1.setBounds(770,90,50,40);

        stress.addChangeListener(e -> {

            valor1.setText(
                    String.valueOf(
                            stress.getValue()
                    )
            );
        });

        // CANSAÇO

        JLabel p2 = criarPergunta(
                "Você sente cansaço emocional?"
        );

        p2.setBounds(60,180,500,30);

        JSlider cansaco =
                criarSlider();

        cansaco.setBounds(60,220,700,60);

        JLabel valor2 =
                criarValorLabel();

        valor2.setBounds(770,220,50,40);

        cansaco.addChangeListener(e -> {

            valor2.setText(
                    String.valueOf(
                            cansaco.getValue()
                    )
            );
        });

        // MOTIVAÇÃO

        JLabel p3 = criarPergunta(
                "Como está sua motivação?"
        );

        p3.setBounds(60,310,500,30);

        JSlider motivacao =
                criarSlider();

        motivacao.setBounds(60,350,700,60);

        JLabel valor3 =
                criarValorLabel();

        valor3.setBounds(770,350,50,40);

        motivacao.addChangeListener(e -> {

            valor3.setText(
                    String.valueOf(
                            motivacao.getValue()
                    )
            );
        });

        // BOTAO

        ModernButton analisar =
                new ModernButton(
                        "ANALISAR COM IA"
                );

        analisar.setBounds(
                250,
                450,
                350,
                60
        );

        analisar.addActionListener(e -> {

            int media =
                    (
                            stress.getValue()
                            + cansaco.getValue()
                            + (10 - motivacao.getValue())
                    ) / 3;

            EstadoEmocional.nivelEstresse =
                    media * 10;

            HistoricoEmocional.historico.add(
                    EstadoEmocional.nivelEstresse
            );

            if(media >= 8) {

                EstadoEmocional.estado =
                        "CRÍTICO";

                EstadoEmocional.recomendacao =
                        "Sua IA identificou sinais elevados de desgaste emocional.";

            } else if(media >= 5) {

                EstadoEmocional.estado =
                        "MODERADO";

                EstadoEmocional.recomendacao =
                        "Foram detectados sinais moderados de estresse.";

            } else {

                EstadoEmocional.estado =
                        "SAUDÁVEL";

                EstadoEmocional.recomendacao =
                        "Seu estado emocional aparenta estabilidade.";
            }

            dispose();

            new ResultadoIAView();
        });

        card.add(p1);
        card.add(stress);
        card.add(valor1);

        card.add(p2);
        card.add(cansaco);
        card.add(valor2);

        card.add(p3);
        card.add(motivacao);
        card.add(valor3);

        card.add(analisar);

        background.add(sidebar);

        background.add(titulo);

        background.add(sub);

        background.add(card);

        add(background);
    }

    private JLabel criarPergunta(String texto) {

        JLabel lbl = new JLabel(texto);

        lbl.setForeground(
                new Color(30,30,30)
        );

        lbl.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        22
                )
        );

        return lbl;
    }

    private JLabel criarValorLabel() {

        JLabel lbl = new JLabel("0");

        lbl.setForeground(
                new Color(0,120,255)
        );

        lbl.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        24
                )
        );

        return lbl;
    }

    private JSlider criarSlider() {

        JSlider slider =
                new JSlider(0,10);

        slider.setOpaque(false);

        slider.setMajorTickSpacing(1);

        slider.setPaintTicks(true);

        slider.setPaintLabels(true);

        return slider;
    }
}