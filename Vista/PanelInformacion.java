package Vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelInformacion extends JPanel {
    // Elementos del panel (atributos)
    private JTextArea taResultado;
    private JScrollPane spResultado;

    // Metodos

    // Constructor
    public PanelInformacion() {
        // contenedor del panel
        setLayout(null);
        this.setBackground(Color.WHITE);

        // Creación y adicion del area de texto resultado
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10, 15, 550, 95);
        add(spResultado);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Informacion");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    // Metodos auxiliares
    public void setResultado(String rta) {
        taResultado.append(rta + "\n");
    }

    public void borrarResultado() {
        taResultado.setText("");
    }
}