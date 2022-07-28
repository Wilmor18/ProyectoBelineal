package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JPanel {
    // Atributos

    private JLabel lbDomicilios;
    private JLabel lbDomicilios1;
    private JLabel lbDomicilios2;
    private JLabel lbDomicilios3;
    private JLabel lbDomicilios4;
    private JLabel lbDomicilios5;
    private JLabel lbDomicilios6;
    private JLabel lbDomicilios7;
    private JLabel lbDomicilios8;
    private JLabel lbDomicilios9;
    private JLabel lbDomicilios10;

    int[] H = new int[10];
    int s = 0;
    Boolean[] E = new Boolean[10];

    // Metodo Constructor
    public PanelUsuario() {
        // contenedor del panel
        setLayout(null);
        this.setBackground(Color.WHITE);

        // Crear y agregar etiqueta duracion
        lbDomicilios = new JLabel("Domicilios Petro", JLabel.CENTER);
        lbDomicilios.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios.setForeground(Color.orange);
        lbDomicilios.setBounds(50, 20, 240, 40);
        add(lbDomicilios);

        // Crear y agregar etiqueta domicilio
        lbDomicilios1 = new JLabel("1", JLabel.CENTER);
        lbDomicilios1.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios1.setForeground(Color.orange);
        lbDomicilios1.setBounds(28, 85, 30, 30);
        add(lbDomicilios1);

        // Crear y agregar etiqueta domicilio
        lbDomicilios2 = new JLabel("2", JLabel.CENTER);
        lbDomicilios2.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios2.setForeground(Color.orange);
        lbDomicilios2.setBounds(28, 140, 30, 30);
        add(lbDomicilios2);

        // Crear y agregar etiqueta domicilio
        lbDomicilios3 = new JLabel("3", JLabel.CENTER);
        lbDomicilios3.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios3.setForeground(Color.orange);
        lbDomicilios3.setBounds(28, 195, 30, 30);
        add(lbDomicilios3);

        // Crear y agregar etiqueta domicilio
        lbDomicilios4 = new JLabel("4", JLabel.CENTER);
        lbDomicilios4.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios4.setForeground(Color.orange);
        lbDomicilios4.setBounds(28, 250, 30, 30);
        add(lbDomicilios4);

        // Crear y agregar etiqueta domicilio
        lbDomicilios5 = new JLabel("5", JLabel.CENTER);
        lbDomicilios5.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios5.setForeground(Color.orange);
        lbDomicilios5.setBounds(28, 305, 30, 30);
        add(lbDomicilios5);

        // Crear y agregar etiqueta domicilio
        lbDomicilios6 = new JLabel("6", JLabel.CENTER);
        lbDomicilios6.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios6.setForeground(Color.orange);
        lbDomicilios6.setBounds(258, 80, 30, 40);
        add(lbDomicilios6);

        // Crear y agregar etiqueta domicilio
        lbDomicilios7 = new JLabel("7", JLabel.CENTER);
        lbDomicilios7.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios7.setForeground(Color.orange);
        lbDomicilios7.setBounds(258, 135, 30, 40);
        add(lbDomicilios7);

        // Crear y agregar etiqueta domicilio
        lbDomicilios8 = new JLabel("8", JLabel.CENTER);
        lbDomicilios8.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios8.setForeground(Color.orange);
        lbDomicilios8.setBounds(258, 190, 40, 40);
        add(lbDomicilios8);

        // Crear y agregar etiqueta domicilio
        lbDomicilios9 = new JLabel("9", JLabel.CENTER);
        lbDomicilios9.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios9.setForeground(Color.orange);
        lbDomicilios9.setBounds(258, 245, 40, 40);
        add(lbDomicilios9);

        // Crear y agregar etiqueta domicilio
        lbDomicilios10 = new JLabel("10", JLabel.CENTER);
        lbDomicilios10.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios10.setForeground(Color.orange);
        lbDomicilios10.setBounds(258, 300, 40, 40);
        add(lbDomicilios10);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Domicilios Petro");
        borde.setTitleColor(Color.orange);
        setBorder(borde);

        E[0] = false;
        E[1] = false;
        E[2] = false;
        E[3] = false;
        E[4] = false;
        E[5] = false;
        E[6] = false;
        E[7] = false;
        E[8] = false;
        E[9] = false;

    }

    // Metodo para Dibujar las habitaciones

    public void paintComponent(Graphics g) {
        H[0] = 1;
        H[1] = 2;
        H[2] = 3;
        H[3] = 4;
        H[4] = 5;
        H[5] = 6;
        H[6] = 7;
        H[7] = 8;
        H[8] = 9;
        H[9] = 10;

        // Capturo ancho y alto del panel
        // int w = this.getWidth();
        // int h = this.getHeight();

        // Llama al metodo paintcomponet de la super clase
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Defino Habitaciones
        if (H[0] == s) {

            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(10, 80, 75, 40);

        } else {
            if (E[0] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(10, 80, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(10, 80, 75, 40);
            }
        }

        if (H[1] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(10, 135, 75, 40);
        } else {
            if (E[1] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(10, 135, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(10, 135, 75, 40);
            }
        }

        if (H[2] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(10, 190, 75, 40);
        } else {
            if (E[2] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(10, 190, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(10, 190, 75, 40);
            }
        }

        if (H[3] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(10, 245, 75, 40);
        } else {
            if (E[3] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(10, 245, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(10, 245, 75, 40);
            }
        }

        if (H[4] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(10, 300, 75, 40);
        } else {
            if (E[4] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(10, 300, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(10, 300, 75, 40);
            }
        }

        if (H[5] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(240, 80, 75, 40);
        } else {
            if (E[5] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(240, 80, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(240, 80, 75, 40);
            }
        }

        if (H[6] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(240, 135, 75, 40);
        } else {
            if (E[6] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(240, 135, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(240, 135, 75, 40);
            }
        }

        if (H[7] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(240, 190, 75, 40);
        } else {
            if (E[7] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(240, 190, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(240, 190, 75, 40);
            }
        }

        if (H[8] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(240, 245, 75, 40);
        } else {
            if (E[8] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(240, 245, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(240, 245, 75, 40);
            }
        }

        if (H[9] == s) {
            g2.setColor(new Color(250, 0, 0));
            g2.fillRect(240, 300, 75, 40);
        } else {
            if (E[9] == true) {
                g2.setColor(new Color(250, 0, 0));
                g2.fillRect(240, 300, 75, 40);
            } else {
                g2.setColor(new Color(0, 0, 250));
                g2.fillRect(240, 300, 75, 40);
            }
        }

    }

    public void pintar(int h) {
        s = h;

        if (H[0] == s) {
            E[0] = true;
        }

        if (H[1] == s) {
            E[1] = true;
        }

        if (H[2] == s) {
            E[2] = true;
        }

        if (H[3] == s) {
            E[3] = true;
        }

        if (H[4] == s) {
            E[4] = true;
        }

        if (H[5] == s) {
            E[5] = true;
        }

        if (H[6] == s) {
            E[6] = true;
        }

        if (H[7] == s) {
            E[7] = true;
        }

        if (H[8] == s) {
            E[8] = true;
        }

        if (H[9] == s) {
            E[9] = true;
        }

        repaint();

    }

}