
package b.Entidades;

import java.time.LocalTime;


public class Ruta {
 
    private int ID_Ruta;
    private String Origen;
    private String Destino;
    private LocalTime Duracion_Estimada;
    private boolean Estado;

    public Ruta() {
    }

    public Ruta(int ID_Ruta, String Origen, String Destino, LocalTime Duracion_Estimada, boolean Estado) {
        this.ID_Ruta = ID_Ruta;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Duracion_Estimada = Duracion_Estimada;
        this.Estado = Estado;
    }

    public Ruta(String Origen, String Destino, LocalTime Duracion_Estimada, boolean Estado) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Duracion_Estimada = Duracion_Estimada;
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

    public LocalTime getDuracion_Estimada() {
        return Duracion_Estimada;
    }

    public void setDuracion_Estimada(LocalTime Duración_Estimada) {
        this.Duracion_Estimada = Duración_Estimada;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String debugToString() {
        return "Ruta{" + "ID_Ruta=" + ID_Ruta + ", Origen=" + Origen + ", Destino=" + Destino + ", Duracion_Estimada=" + Duracion_Estimada + ", Estado=" + Estado + '}';
    }

    @Override
    public String toString() {
        return ID_Ruta + " (Origen=" + Origen + ", Destino=" + Destino + ", Duracion_Estimada=" + Duracion_Estimada + ")";
    }
    
    
}

