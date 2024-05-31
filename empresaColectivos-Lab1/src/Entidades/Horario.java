
package Entidades;

import java.time.LocalTime;


public class Horario {
    
    private int ID_Horario;
    private Ruta ruta;
    private LocalTime Hora_Salida;
    private LocalTime Hora_Llegada;
    private boolean Estado;

    public Horario() {
    }

    public Horario(int ID_Horario, Ruta ruta, LocalTime Hora_Salida, LocalTime Hora_Llegada, boolean Estado) {
        this.ID_Horario = ID_Horario;
        this.ruta = ruta;
        this.Hora_Salida = Hora_Salida;
        this.Hora_Llegada = Hora_Llegada;
        this.Estado = Estado;
    }

    public Horario(Ruta ruta, LocalTime Hora_Salida, LocalTime Hora_Llegada, boolean Estado) {
        this.ruta = ruta;
        this.Hora_Salida = Hora_Salida;
        this.Hora_Llegada = Hora_Llegada;
        this.Estado = Estado;
    }

    public int getID_Horario() {
        return ID_Horario;
    }

    public void setID_Horario(int ID_Horario) {
        this.ID_Horario = ID_Horario;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalTime getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(LocalTime Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

    public LocalTime getHora_Llegada() {
        return Hora_Llegada;
    }

    public void setHora_Llegada(LocalTime Hora_Llegada) {
        this.Hora_Llegada = Hora_Llegada;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
