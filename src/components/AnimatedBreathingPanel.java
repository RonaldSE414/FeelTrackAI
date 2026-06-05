
package components;

import javax.swing.*;
import java.awt.*;

public class AnimatedBreathingPanel extends JPanel {

    private int size = 90;

    private boolean growing = true;

    public AnimatedBreathingPanel() {

        setOpaque(false);

        javax.swing.Timer timer =
                new javax.swing.Timer(
                        40,
                        e -> {

                            if(growing) {

                                size += 2;

                                if(size >= 170) {

                                    growing = false;
                                }

                            } else {

                                size -= 2;

                                if(size <= 90) {

                                    growing = true;
                                }
                            }

                            repaint();
                        }
                );

        timer.start();
    }

  @Override
protected void paintComponent(Graphics g) {

    // Chama o método da classe pai para limpar e preparar o painel antes do desenho
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );
}
        int x = getWidth()/2 - size/2;

        int y = getHeight()/2 - size/2;

        // GLOW EXTERNO

        g2.setColor(
                new Color(0,255,255,40)
        );

        g2.fillOval(
                x - 15,
                y - 15,
                size + 30,
                size + 30
        );

        // CIRCULO PRINCIPAL

        g2.setColor(
                new Color(0,200,255)
        );

        g2.fillOval(
                x,
                y,
                size,
                size
        );

        // TEXTO

        g2.setColor(Color.WHITE);

        g2.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        22
                )
        );

        g2.drawString(
                "Respire",
                getWidth()/2 - 45,
                getHeight()/2 + 8
        );
    }
}
