package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

    private PanelEntradaDatos miPanelEntradaDatos;
    private PanelInformacion miPanelResultados;
    private PanelOperaciones miPanelOperaciones;
    private PanelUsuario miPanelUsuario;

    // Metodos

    // Metodo constructor
    public VentanaPrincipal() {

        // Contenedor de la ventana
        setLayout(null);

        // Crear y agregar el panel a la ventana
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 250, 360);
        add(miPanelEntradaDatos);

        // Crear y agregar el panel a la ventana
        miPanelOperaciones = new PanelOperaciones(this);
        miPanelOperaciones.setBounds(10, 250, 250, 115);
        add(miPanelOperaciones);

        // Crear y agregar el panel a la ventana
        miPanelResultados = new PanelInformacion();
        miPanelResultados.setBounds(10, 375, 570, 115);
        add(miPanelResultados);

        // Crear y agregar el panel a la ventana//
        miPanelUsuario = new PanelUsuario();
        miPanelUsuario.setBounds(260, 10, 480, 360);
        add(miPanelUsuario);

        // Caracteristicas de la ventanta
        setTitle("BeLineal");
        setSize(600, 540);
        // setLocation(100,100);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    // Operaciones principales
    public void salir() {
        JOptionPane.showMessageDialog(null, "Bye bye...");
        System.exit(0);
    }

    public void buscar() {
        try {
            int h = Integer.parseInt(miPanelOperaciones.geth());
            String ha = "";
            switch (h) {
                case 1:
                    ha = "Matias";
                    break;
                case 2:
                    ha = "David";
                    break;
                case 3:
                    ha = "sebastian";
                    break;
                case 4:
                    ha = "marta";
                    break;
                case 5:
                    ha = "laura";
                    break;
                case 6:
                    ha = "camilo";
                    break;
                case 7:
                    ha = "Uribe";
                    break;
                case 8:
                    ha = "samuel";
                    break;
                case 9:
                    ha = "Santiago";
                    break;
                case 10:
                    ha = "Pedro";
                    break;

                default:
                    ha = "Inserte un numero de 1 a 10 para ver informacion del domiciliario.";
                    break;
            }
            // Envio de caracteristicas
            miPanelResultados.setResultado(ha);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en dato de entrada", "Domicilio", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void reservar() {
        try {
            int h = Integer.parseInt(miPanelOperaciones.geth());

            // Envio de caracteristicas
            miPanelUsuario.pintar(h);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en dato de entrada", "Domicilio", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelar() {

        miPanelResultados.borrarResultado();

    }

}
