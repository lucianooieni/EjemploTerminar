package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agus_
 */
public class Conexion 
{
    private static Connection cn;
    
    private static Conexion instance;
     public static Conexion getInstance()
    {
        if(instance==null)
        {
            instance = new Conexion();
        }
        return instance;
    }
    private Conexion()
    {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/canchaFutbol","root","");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void ejecutarSQL(String sql){
      try {
        cn.createStatement().execute(sql);
      } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    public ResultSet consultar(String sql)
    {
        try{
        Statement st = cn.createStatement();
        ResultSet consulta = st.executeQuery(sql);
        return consulta;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null; 
    }
            
    
}