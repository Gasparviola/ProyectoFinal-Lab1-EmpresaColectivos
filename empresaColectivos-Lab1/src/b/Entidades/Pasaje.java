
package b.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Pasaje {
    
    private int ID_Pasaje;
    private Pasajero pasajero;
    private Colectivo colectivo;
    private Ruta ruta;
    private LocalDate Fecha_Viaje;
    private LocalTime Hora_Viaje;
    private int Asiento;
    private double Precio;

    public Pasaje() {
    }

    public Pasaje(int ID_Pasaje, Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate Fecha_Viaje, LocalTime Hora_Viaje, int Asiento, double Precio) {
        this.ID_Pasaje = ID_Pasaje;
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.Fecha_Viaje = Fecha_Viaje;
        this.Hora_Viaje = Hora_Viaje;
        this.Asiento = Asiento;
        this.Precio = Precio;
    }

    public Pasaje(Pasajero pasajero, Ruta ruta,Colectivo colectivo, LocalTime Hora_Viaje,LocalDate Fecha_Viaje, int Asiento, double Precio) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.colectivo = colectivo;
        this.Hora_Viaje = Hora_Viaje;
        this.Fecha_Viaje = Fecha_Viaje;
        this.Asiento = Asiento;
        this.Precio = Precio;
    }

    public int getID_Pasaje() {
        return ID_Pasaje;
    }

    public void setID_Pasaje(int ID_Pasaje) {
        this.ID_Pasaje = ID_Pasaje;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalDate getFecha_Viaje() {
        return Fecha_Viaje;
    }

    public void setFecha_Viaje(LocalDate Fecha_Viaje) {
        this.Fecha_Viaje = Fecha_Viaje;
    }

    public LocalTime getHora_Viaje() {
        return Hora_Viaje;
    }

    public void setHora_Viaje(LocalTime Hora_Viaje) {
        this.Hora_Viaje = Hora_Viaje;
    }

    public int getAsiento() {
        return Asiento;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String debugToString() {
        return "Pasaje{" + "ID_Pasaje=" + ID_Pasaje + ", ID_Pasajero=" + pasajero.getID_Pasajero() + ", ID_Colectivo=" + colectivo.getID_Colectivo() + ", ID_Ruta=" + ruta.getID_Ruta() + ", Fecha_Viaje=" + Fecha_Viaje + ", Hora_Viaje=" + Hora_Viaje + ", Asiento=" + Asiento + ", Precio=" + Precio + '}';
    }

    @Override
    public String toString() {
        if(pasajero != null && colectivo != null){           
          return "ID_Pasaje= " + ID_Pasaje + " Nombre Pasajero=" + pasajero.getNombre()+ " " + pasajero.getApellido() + ", Hora_Viaje=" + Hora_Viaje + ", Asiento=" + Asiento + ", IdColectivo=" + colectivo.getID_Colectivo()+ ")";
        }else if(pasajero == null && colectivo != null ){           
          return "ID_Pasaje= " + ID_Pasaje + " Nombre Pasajero= Eliminado o Dado de baja" +  ", Hora_Viaje=" + Hora_Viaje + ", Asiento=" + Asiento + ", IdColectivo=" + colectivo.getID_Colectivo()+ ")";
        }else if(pasajero != null && colectivo == null ){           
          return "ID_Pasaje= " + ID_Pasaje + " Nombre Pasajero=" + pasajero.getNombre()+ " " + pasajero.getApellido() + ", Hora_Viaje=" + Hora_Viaje + ", Asiento=" + Asiento + ", IdColectivo= Eliminado o dado de Baja"+ ")";
        }else{         
          return "ID_Pasaje= " + ID_Pasaje + ", Hora_Viaje=" + Hora_Viaje + ", Asiento=" + Asiento +")";
        }       
    }
    
    
}
