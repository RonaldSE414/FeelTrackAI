package view;

import components.GradientPanel;
import components.ModernButton;
import components.RoundedPanel;

import model.EstadoEmocional;
import model.HumorIA;
import model.MensagemIA;

import javax.swing.*;
import java.awt.*;

public class ResultadoIAView extends JFrame {

    public ResultadoIAView() {

        setTitle("Resultado IA");

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

        JLabel titulo =
                new JLabel(
                        "Resultado da IA"
                );

        titulo.setForeground(Color.WHITE);

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        38
                )
        );

        titulo.setBounds(80,40,500,40);

        RoundedPanel card =
                new RoundedPanel(
                        Color.WHITE
                );

        card.setLayout(null);

        card.setBounds(80,130,1200,520);

        String emoji =
                HumorIA.gerarHumor(
                        EstadoEmocional.nivelEstresse
                );

        JLabel estado =
                new JLabel(
                        emoji
                        + " "
                        + EstadoEmocional.estado
                );

        estado.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        42
                )
        );

        estado.setBounds(60,40,500,50);

        JLabel nivel =
                new JLabel(
                        "Nível emocional detectado: "
                        + EstadoEmocional.nivelEstresse
                        + "%"
                );

        nivel.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        24
                )
        );

        nivel.setBounds(60,120,500,40);

        JTextArea mensagem =
                new JTextArea();

        mensagem.setEditable(false);

        mensagem.setOpaque(false);

        mensagem.setLineWrap(true);

        mensagem.setWrapStyleWord(true);

        mensagem.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        22
                )
        );

        mensagem.setText(

                MensagemIA.gerarMensagem(
                        EstadoEmocional.nivelEstresse
                )

                + "\n\n"

                + EstadoEmocional.recomendacao
        );

        mensagem.setBounds(
                60,
                210,
                900,
                150
        );

        JProgressBar barra =
                new JProgressBar();

        barra.setValue(
                EstadoEmocional.nivelEstresse
        );

        barra.setBounds(
                60,
                400,
                700,
                35
        );

        barra.setStringPainted(true);

        ModernButton voltar =
                new ModernButton(
                        "VOLTAR AO DASHBOARD"
                );

        voltar.setBounds(
                420,
                460,
                350,
                55
        );

        voltar.addActionListener(e -> {

            dispose();

            new DashboardView();
        });

        card.add(estado);

        card.add(nivel);

        card.add(mensagem);

        card.add(barra);

        card.add(voltar);

        background.add(titulo);

        background.add(card);

        add(background);
    }
}