/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canchas;

/**
 *
 * @author alumno
 */
public class Cancha {
    
    
 private int idCancha;
 private String ciudad;

    public Cancha(int idCancha, String ciudad) {
        this.idCancha = idCancha;
        this.ciudad = ciudad;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cancha{" + "idCancha=" + idCancha + ", ciudad=" + ciudad + '}';
    }
 
}
