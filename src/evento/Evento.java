/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento;

import canchas.Cancha;
import dao.CanchaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import ventana.VentanaPrincipal;

/**
 *
 * @author alumno
 */
public class Evento extends WindowAdapter implements ActionListener {

    CanchaDao canchaDao = new CanchaDao();
    private final JComboBox comboCancha;

    public Evento(JComboBox comboCancha) {
        this.comboCancha = comboCancha;
    }
    public void windowOpened(WindowEvent e) {

        List<Cancha> canchas = canchaDao.devolverCancha();

        for (Cancha cancha : canchas) {
            comboCancha.addItem(cancha.getCiudad());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
