package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModernButton extends JButton {

    private Color color = new Color(0, 120, 255);

    public ModernButton(String texto) {

        super(texto);
        // Remove os focos e as bordas padrão para garantir um design moderno, limpo e plano
        setFocusPainted(false);

        setBorderPainted(false);

        setContentAreaFilled(false);

        setForeground(Color.WHITE);

        setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        18
                )
        );

        setCursor(
                new Cursor(Cursor.HAND_CURSOR)
        );

        setOpaque(false);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {

                color = new Color(0, 180, 255);

                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {

                color = new Color(0, 120, 255);

                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setColor(color);

        g2.fillRoundRect(
                0,
                0,
                getWidth(),
                getHeight(),
                35,
                35
        );

        FontMetrics fm = g2.getFontMetrics();

        Rectangle r = new Rectangle(
                0,
                0,
                getWidth(),
                getHeight()
        );

        int x = (r.width - fm.stringWidth(getText())) / 2;

        int y = (r.height - fm.getHeight()) / 2 + fm.getAscent();

        g2.setColor(Color.WHITE);

        g2.setFont(getFont());

        g2.drawString(getText(), x, y);
    }
}

