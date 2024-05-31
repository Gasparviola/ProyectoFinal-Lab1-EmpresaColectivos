
package Entidades;

import java.time.LocalTime;


public class Ruta {
 
    private int ID_Ruta;
    private String Origen;
    private String Destino;
    private LocalTime Duración_Estimada;
    private boolean Estado;

    public Ruta() {
    }

    public Ruta(int ID_Ruta, String Origen, String Destino, LocalTime Duración_Estimada, boolean Estado) {
        this.ID_Ruta = ID_Ruta;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Duración_Estimada = Duración_Estimada;
        this.Estado = Estado;
    }

    public Ruta(String Origen, String Destino, LocalTime Duración_Estimada, boolean Estado) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Duración_Estimada = Duración_Estimada;
        this.Estado = Estado;
    }

    public int getID_Ruta() {
        return ID_Ruta;
    }

    public void setID_Ruta(int ID_Ruta) {
        this.ID_Ruta = ID_Ruta;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public LocalTime getDuración_Estimada() {
        return Duración_Estimada;
    }

    public void setDuración_Estimada(LocalTime Duración_Estimada) {
        this.Duración_Estimada = Duración_Estimada;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    

}
