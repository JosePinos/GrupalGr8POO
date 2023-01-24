import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaSplit extends JFrame {

    JSplitPane jsArriba;
    JList<String> jlItems;
    JLabel jlImagen;

    public VentanaSplit(){
        super("EJEMPLO DE JSPLITPANE");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        crearGui();
        setVisible(true);
    }

    private void crearGui(){
        String[] items = {"Imagen 1", "Imagen 2"};
        jlItems = new JList<>(items);
        JScrollPane jsList = new JScrollPane(jlItems);
        jlItems.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                evento_jlItems();
            }



        });

        jlImagen = new JLabel();
        JScrollPane jsImagen = new JScrollPane(jlImagen);

        jsArriba = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jsList,jsImagen);
        jsArriba.setOneTouchExpandable(true);//muestra triangulitos para moverse
        jsArriba.setDividerLocation(120);

        add(jsArriba);
    }

    private void evento_jlItems(){
        String item = jlItems.getSelectedValue();
        System.out.println(item);
        ImageIcon img = null;

        switch (item){

            case "Imagen 1":{
                img = new ImageIcon( getClass().getResource("Imagenes/CPPlogo.png") );
            }
            break;

            case "Imagen 2":{
                img = new ImageIcon( getClass().getResource("Imagenes/Javalogo.png") );
            }
            break;

        }//fin del switch
        jlImagen.setIcon(img);
    }

    public static void main(String[] args) {
        VentanaSplit v = new VentanaSplit();
    }


}


