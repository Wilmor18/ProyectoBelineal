package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelOperaciones extends JPanel implements ActionListener {
    // Elementos del panel (atributos)
    private JButton btBuscar, btSalir, btReservar, btCancelar;
    private VentanaPrincipal venPrin;
    private JTextField tfdomicilio;

    // Metodos

    // Constructor
    public PanelOperaciones(VentanaPrincipal pVP) {
        // contenedor del panel
        setLayout(null);
        this.setBackground(Color.WHITE);

        // Creación de un objeto de tipo VentanaPrincipal
        venPrin = pVP;

        // Creación y adicion del boton Buscar
        btBuscar = new JButton("Buscar");
        btBuscar.setFont(new Font("Arial", Font.BOLD, 17));
        btBuscar.setForeground(Color.BLUE);
        btBuscar.setActionCommand("buscar");
        btBuscar.addActionListener(this);
        btBuscar.setBounds(120, 25, 100, 40);
        add(btBuscar);

        // Creación y adicion del boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", Font.BOLD, 17));
        btSalir.setForeground(Color.BLUE);
        btSalir.setActionCommand("salir");
        btSalir.addActionListener(this);
        btSalir.setBounds(120, 68, 100, 40);
        add(btSalir);

        // Creación y adicion del boton Reservar
        btReservar = new JButton("Reservar");
        btReservar.setFont(new Font("Arial", Font.BOLD, 12));
        btReservar.setForeground(Color.BLUE);
        btReservar.setActionCommand("reservar");
        btReservar.addActionListener(this);
        btReservar.setBounds(10, 25, 100, 40);
        add(btReservar);

        // Creación y adicion del boton Cancelar
        btCancelar = new JButton("Cancelar");
        btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
        btCancelar.setForeground(Color.BLUE);
        btCancelar.setActionCommand("cancelar");
        btCancelar.addActionListener(this);
        btCancelar.setBounds(10, 68, 100, 40);
        add(btCancelar);

        // Creacion y adicion del panel de texto
        tfdomicilio = new JTextField();
        tfdomicilio.setFont(new Font("Arial", Font.BOLD, 12));
        tfdomicilio.setForeground(Color.blue);
        tfdomicilio.setActionCommand("reservar");
        tfdomicilio.addActionListener(this);
        tfdomicilio.setBounds(65, 0, 100, 20);
        add(tfdomicilio);

    }

    // Método de atención de eventos

    public void actionPerformed(ActionEvent ae) {
        // Identificar el evento o comando generado
        String comando = ae.getActionCommand();
        if (comando.equals("buscar")) {
            // JOptionPane.showMessageDialog(null,"Se hizo clic en el boton Borrar");
            venPrin.buscar();
        }
        if (comando.equals("salir")) {
            // JOptionPane.showMessageDialog(null,"Se hizo clic en el boton Salir");
            venPrin.salir();
        }
        if (comando.equals("reservar")) {
            // JOptionPane.showMessageDialog(null,"Se hizo clic en el boton Reservar");
            venPrin.reservar();
        }
        if (comando.equals("cancelar")) {
            // JOptionPane.showMessageDialog(null,"Se hizo clic en el boton Cancelar");
            venPrin.cancelar();
        }
    }

    // metodo auxiliar//

    public String geth() {
        return tfdomicilio.getText();
    }
}
