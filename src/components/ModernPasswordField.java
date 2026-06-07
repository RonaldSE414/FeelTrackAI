package components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
/// Esse código foi escrito para criar um botão arredondado
/// Com o uso de EmptyBorder para dar um design simples para esse botão
/// E por último, uma cor intuitiva (azul vibrante) para convidar o usuário a apertá-lo
public class ModernPasswordField extends JPasswordField {

    public ModernPasswordField() {

        setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        setForeground(new Color(40,40,40));

        setBackground(Color.WHITE);

        setBorder(
                new EmptyBorder(
                        10,
                        15,
                        10,
                        15
                )
        );

        setCaretColor(new Color(0,120,255));
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setColor(getBackground());

        g2.fillRoundRect(
                0,
                0,
                getWidth(),
                getHeight(),
                30,
                30
        );

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setColor(new Color(220,220,220));

        g2.drawRoundRect(
                0,
                0,
                getWidth()-1,
                getHeight()-1,
                30,
                30
        );
    }
}

