import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJtabbedPane {
    private JTabbedPane tabbedPane1;
    private JButton enviarButton;
    public JPanel JPanelVtabbed;
    private JButton otroBotonButton;
    private JTextArea textArea1;
    private JLabel label;
    private JTextField textField1;
    private JTextField textField2;
    private JButton textButton;
    private JButton negroButton;

    public VentanaJtabbedPane() {


    enviarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Esto es un mensaje");
        }
    });
        otroBotonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Otro mensaje uwu");
            }
        });
        otroBotonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1, text2;
                text1 = textField1.getText();
                text2 = textField2.getText();
                JOptionPane.showMessageDialog(null, text1 + " " + text2);
            }
        });
        textButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setForeground(Color.GREEN);
            }
        });
        negroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setForeground(Color.BLACK);
            }
        });
    }
}
