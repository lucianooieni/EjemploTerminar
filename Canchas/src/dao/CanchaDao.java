/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import canchas.Cancha;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class CanchaDao {

    Conexion con = Conexion.getInstance();

    public List<Cancha> devolverCancha() {

        List<Cancha> canchas = new ArrayList();
        try {
            ResultSet rs = con.consultar("select * from Cancha");

            while (rs.next()) {
                Cancha cancha = new Cancha(
                        rs.getInt("idCancha"),
                        rs.getString("ciudad")
                );
                canchas.add(cancha);

            }

        } catch (SQLException ex) {
            Logger.getLogger(CanchaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return canchas;

    }

}
