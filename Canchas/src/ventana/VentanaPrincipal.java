/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import evento.Evento;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author alumno
 */
public class VentanaPrincipal extends JFrame {

    JButton ok;
    JButton cancelar;

    public VentanaPrincipal() {
        setLayout(new FlowLayout());

        configVentana();

        JPanel panel = new LaminaFCE(this);

        add(panel);

        JPanel lamina = new LaminaJugadores();

        add(lamina);

        JPanel laminaBoton = new JPanel();

        ok = new JButton("Ok");
        cancelar = new JButton("Cancelar");

        laminaBoton.add(ok);
        laminaBoton.add(cancelar);

        add(laminaBoton);

        //this.addWindowListener(new Evento(comboCancha));

    }

    public void configVentana() {

        setTitle("Venatan Principal");

        setSize(500, 360);

        setLocationRelativeTo(this);

    }

    public static class LaminaFCE extends JPanel {

        public LaminaFCE(VentanaPrincipal ventanaPrincipal) {
            GridLayout grid = new GridLayout(3, 2);

            grid.setHgap(85);
            grid.setVgap(15);

            setLayout(grid);

            fecha = new JLabel("Fecha: ", JLabel.CENTER);

            cancha = new JLabel("Cancha", JLabel.CENTER);

            equipo1 = new JLabel("Equipo 1", JLabel.CENTER);
            
            

            campoFecha = new JTextField(10);

            comboCancha = new JComboBox();

            equipo2 = new JLabel("Equipo 2", JLabel.CENTER);
            
            

            add(fecha);

            add(campoFecha);

            add(cancha);

            add(comboCancha);

            add(equipo1);
            
            add(equipo2);
            
            
            ventanaPrincipal.addWindowListener(new Evento(comboCancha));
            
        }
        
        public void cargarCancha(){
            
            
            
        }

        JLabel fecha;

        JLabel cancha;

        JLabel equipo1;

        JTextField campoFecha;

        JComboBox comboCancha;

        JLabel equipo2;
        
        
    }

    class LaminaJugadores extends JPanel {

        LaminaJugadores() {

            GridLayout grid2 = new GridLayout(6, 1);

            grid2.setVgap(10);

            setLayout(grid2);

            configJugadres("Jugador 1: ");
            configJugadres("Jugador 2: ");
            configJugadres("Jugador 3: ");
            configJugadres("Jugador 4: ");
            configJugadres("Jugador 5: ");
            configJugadres("Jugador 6: ");

            configJugadres("Jugador 1: ");
            configJugadres("Jugador 2: ");
            configJugadres("Jugador 3: ");
            configJugadres("Jugador 4: ");
            configJugadres("Jugador 5: ");
            configJugadres("Jugador 6: ");

        }

        public void configJugadres(String nombre) {

            JLabel etiqueta = new JLabel(nombre, JLabel.CENTER);

            add(etiqueta);

            JTextField campo = new JTextField(10);

            add(campo);

        }

    }
}


