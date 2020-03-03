import javax.swing.JFrame;

public class MeinFrame extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        MeinPanel mp = new MeinPanel();
        JFrame f = new JFrame();

        f.setSize(718, 747);
        f.setDefaultCloseOperation(3);
        f.setTitle("Koordinaten System");
        f.add(mp);
        f.setVisible(true);
    }
}
