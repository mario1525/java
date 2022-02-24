package botones;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pruebaeventos {

    public static void main(String[] args) {
        marcobotones mimarco = new marcobotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class marcobotones extends JFrame {

    public marcobotones() {
        setTitle("marco botones de colores");
        setBounds(700, 300, 500, 300);

        laminabotones milamina = new laminabotones();
        add(milamina);

    }
}

class laminabotones extends JPanel implements ActionListener {

    JButton botonazul = new JButton("azul");
    JButton botonamarillo = new JButton("amarillo");
    JButton botonrojo = new JButton("rojo");
    JButton botonverde = new JButton("verde");
    JButton botonnegro = new JButton("negro");
    JButton botonnaranja = new JButton("naranja");
    JButton botonmorado = new JButton("morado");
    JButton botonrosado = new JButton("rosado");
    JButton botongris = new JButton("gris");

    public laminabotones() {
        add(botonazul);
        add(botonamarillo);
        add(botonrojo);
        add(botonverde);
        add(botonnegro);
        add(botonmorado);
        add(botonrosado);
        add(botongris);
        add(botonnaranja);

        botonazul.addActionListener(this);
        botonamarillo.addActionListener(this);
        botonrojo.addActionListener(this);
        botonverde.addActionListener(this);
        botonnegro.addActionListener(this);
        botonmorado.addActionListener(this);
        botonrosado.addActionListener(this);
        botongris.addActionListener(this);
        botonnaranja.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object pulse_aqui = e.getSource();
        if (pulse_aqui == botonazul) {
            setBackground(Color.blue);

        } else if (pulse_aqui == botonamarillo) {
            setBackground(Color.YELLOW);
        } else if (pulse_aqui == botonverde) {
            setBackground(Color.green);
        } else if (pulse_aqui == botonrojo) {
            setBackground(Color.red);
        }else if (pulse_aqui == botonnegro) {
            setBackground(Color.black);
        }else if (pulse_aqui == botonnaranja) {
            setBackground(Color.orange);
        }else if (pulse_aqui == botonrosado) {
            setBackground(Color.pink);
        }else if (pulse_aqui == botonmorado) {
            setBackground(Color.MAGENTA);
        }else{
           setBackground(Color.gray); 
        }

    }
}
