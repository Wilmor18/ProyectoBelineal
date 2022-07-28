package Vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {

    private JLabel lbImagen;
    private ImageIcon iImagen;
    // Metodos

    // Constructor
    public PanelEntradaDatos() {
        // contenedor del panel
        setLayout(null);
        this.setBackground(Color.WHITE);

        // Crear y agregar la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/moto.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(20, 15, 200, 200);
        add(lbImagen);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("BeLineal");
        borde.setTitleColor(Color.orange);
        setBorder(borde);

    }

}