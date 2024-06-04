
package b.Entidades;


public class Colectivo {
    
    private int ID_Colectivo;
    private String Matricula;
    private String Marca;
    private String Modelo;
    private int Capacidad; 
    private boolean Estado;

    public Colectivo() {
    }

    public Colectivo(int ID_Colectivo, String Matricula, String Marca, String Modelo, int Capacidad, boolean Estado) {
        this.ID_Colectivo = ID_Colectivo;
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
    }

    public Colectivo(String Matricula, String Marca, String Modelo, int Capacidad, boolean Estado) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
    }

    public int getID_Colectivo() {
        return ID_Colectivo;
    }

    public void setID_Colectivo(int ID_Colectivo) {
        this.ID_Colectivo = ID_Colectivo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
