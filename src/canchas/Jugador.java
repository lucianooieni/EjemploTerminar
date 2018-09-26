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
public class Jugador {
    
    private int Dni;
    private String Nombre;
    private String Apellido;

    public Jugador(int Dni, String Nombre, String Apellido) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Dni=" + Dni + ", Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }
    
    
}
