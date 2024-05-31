
package Entidades;

public class Pasajero {
    
    private int ID_Pasajero ;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Correo;
    private String Telefono;
    private boolean Estado;

    public Pasajero() {
    }

    public Pasajero(int ID_Pasajero, String Nombre, String Apellido, String DNI, String Correo, String Telefono, boolean Estado) {
        this.ID_Pasajero = ID_Pasajero;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Estado = Estado;
    }

    public Pasajero(String Nombre, String DNI, String Correo, String Telefono, boolean Estado) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Estado = Estado;
    }

    public int getID_Pasajero() {
        return ID_Pasajero;
    }

    public void setID_Pasajero(int ID_Pasajero) {
        this.ID_Pasajero = ID_Pasajero;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
}
