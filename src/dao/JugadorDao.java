/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import canchas.Jugador;
/**
 *
 * @author alumno
 */
public class JugadorDao {
    
    Conexion con;
    
    public void AddJugador(Jugador ju){
        con=Conexion.getInstance();
        String sql;
        sql="insert into Jugador values("+ju.getDni()+",'"+ju.getNombre()+"','"+ju.getApellido()+"');";
        con.ejecutarSQL(sql);
    }
    
    public void Eliminar(int dni){
        con=Conexion.getInstance();
        String sql;
        sql="delete from Persona where Dni="+dni;
        con.ejecutarSQL(sql);
        
    }
    
}
