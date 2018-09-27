/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canchas;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Reserva {
    
    
    private Date fechaReserva;
    private Equipo equipo1;
    private Equipo equipo2;

    public Reserva(Date fechaReserva, Equipo equipo1, Equipo equipo2) {
        this.fechaReserva = fechaReserva;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fechaReserva=" + fechaReserva + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + '}';
    }
    
}
