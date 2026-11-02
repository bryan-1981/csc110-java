import javax.swing.JFrame;

public class PetApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pet Profile Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PetPanel());
        frame.pack();
        frame.setVisible(true);
    }
}