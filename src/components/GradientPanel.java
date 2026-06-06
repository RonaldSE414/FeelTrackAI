
package components;

import javax.swing.*;
import java.awt.*;

/*
 * Painel personalizado que cria uma animação de respiração.
 * Um Timer altera continuamente o tamanho do círculo,
 * simulando os movimentos de inspiração e expiração.
 * O método paintComponent() desenha um efeito de brilho,
 * o círculo principal e o texto "Respire" centralizado.
 */

public class GradientPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY
        );

        int width = getWidth();

        int height = getHeight();

        Color color1 = new Color(10, 35, 66);

        Color color2 = new Color(25, 118, 210);

        Color color3 = new Color(38, 198, 218);

        GradientPaint gp = new GradientPaint(
                0,
                0,
                color1,
                width,
                height,
                color3
        );

        g2.setPaint(gp);

        g2.fillRect(
                0,
                0,
                width,
                height
        );
    }
}
