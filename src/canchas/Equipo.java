/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canchas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Equipo {
    
 private String nombre;
 List<Jugador> jugadores=new ArrayList<>();
 private int max_Jugadores;

    public Equipo(String nombre, int max_Jugadores) {
        this.nombre = nombre;
        this.max_Jugadores = max_Jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getMax_Jugadores() {
        return max_Jugadores;
    }

    public void setMax_Jugadores(int max_Jugadores) {
        this.max_Jugadores = max_Jugadores;
    }
 
 
         
}
