import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contenedores");
        frame.setContentPane(new VentanaJtabbedPane().JPanelVtabbed);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}