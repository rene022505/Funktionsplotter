import java.awt.Color;
import java.awt.Graphics;

public class MeinPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        zeichneKoordinatensystem(g);
        System.out.println("w:" + getWidth() + "h" + getHeight());
        zeichneKreuz(g, 100, 100);
        drawXp3(g);
    }

    private void zeichneKoordinatensystem(Graphics g) {
        // x-Achse
        g.drawLine(transformX(-(getWidth() / 2)), transformY(0), transformX(getWidth() / 2), transformY(0));
        // Pfeile x-Achse
        g.drawLine(transformX(getWidth() / 2), transformY(0), transformX(getWidth() / 2 - 10), transformY(10));
        g.drawLine(transformX(getWidth() / 2), transformY(0), transformX(getWidth() / 2 - 10), transformY(-10));

        // y-Achse
        g.drawLine(transformX(0), transformY(getHeight() / 2), transformX(0), transformY(-(getWidth() / 2)));
        // Pfeile y-Achse
        g.drawLine(transformX(-10), transformY(getHeight() / 2 - 10), transformX(0), transformY(getHeight() / 2));
        g.drawLine(transformX(10), transformY(getHeight() / 2 - 10), transformX(0), transformY(getHeight() / 2));

        // x-Achse Striche
        for (int i = 0; i < getWidth() / 2; i += 10)
            g.drawLine(transformX(i), transformY(0), transformX(i), transformY(3));
        for (int i = 0; i > -(getWidth() / 2); i -= 10)
            g.drawLine(transformX(i), transformY(0), transformX(i), transformY(3));    
        // y-Achse Striche
        for (int i = 0; i < getHeight() / 2; i += 10)
            g.drawLine(transformX(0), transformY(i), transformX(3), transformY(i));
        for (int i = 0; i > -(getHeight() / 2); i -= 10)
            g.drawLine(transformX(0), transformY(i), transformX(3), transformY(i));
    }

    private void zeichneKreuz(Graphics g, int xd, int yd) {
        g.setColor(Color.RED);
        g.drawLine(transformX(xd - 5), transformY(yd - 5), transformX(xd + 5), transformY(yd + 5));
        g.drawLine(transformX(xd - 5), transformY(yd + 5), transformX(xd + 5), transformY(yd - 5));
        g.setColor(Color.BLACK);
    }

    public int transformX(int x) {
        return (getWidth() / 2 + x);
    }

    public int transformY(int y) {
        return (getHeight() / 2 - y);
    }

    public void drawXp3(Graphics g) {
    }
}
