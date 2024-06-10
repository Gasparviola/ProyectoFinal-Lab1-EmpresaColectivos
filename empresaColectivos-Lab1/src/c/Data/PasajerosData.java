
package c.Data;

import b.Entidades.Conexion;
import b.Entidades.Pasajero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PasajerosData {
    
    private Connection con = null;

    public PasajerosData() {
        con = (Connection) Conexion.getConexion();
    }
    
    public void añadirPasajero(Pasajero pasajero) {
        
        try {
            String sql = "INSERT INTO Pasajero(ID_Pasajero, Nombre, Apellido, DNI, Correo, Telefono, Estado) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,pasajero.getID_Pasajero());
            ps.setString(2, pasajero.getNombre());
            ps.setString(3, pasajero.getApellido());
            ps.setString(4, pasajero.getDNI());
            ps.setString(5, pasajero.getCorreo());
            ps.setString(6, pasajero.getTelefono());
            ps.setBoolean(7, pasajero.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {               
                pasajero.setID_Pasajero(rs.getInt("ID_Pasajero"));
                JOptionPane.showMessageDialog(null, "Pasajero añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex.getMessage());
        }
    }
    
    
    public List<Pasajero> listarPasajeros() {

        List<Pasajero> pasajeros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Pasajero WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Pasajero Pasajeros;
            while (rs.next()) {
                Pasajeros = new Pasajero(); 
                Pasajeros.setID_Pasajero(rs.getInt("ID_Pasajero"));
                Pasajeros.setNombre(rs.getString("Nombre"));
                Pasajeros.setApellido(rs.getString("Apellido"));
                Pasajeros.setDNI(rs.getString("DNI"));
                Pasajeros.setCorreo(rs.getString("Correo"));
                Pasajeros.setTelefono(rs.getString("Telefono"));
                Pasajeros.setEstado(rs.getBoolean("Estado"));
                pasajeros.add(Pasajeros);                          
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
        return pasajeros;
    }
    
    public Pasajero buscarPasajero(int ID_Pasajero) {
        Pasajero pasajeros = null;
        String sql = "SELECT ID_Pasajero, Nombre, Apellido, DNI, Correo, Telefono, Estado FROM Pasajero WHERE ID_Pasajero = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,ID_Pasajero );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasajeros = new Pasajero();        
                pasajeros.setID_Pasajero(rs.getInt("ID_Pasajero"));
                pasajeros.setNombre(rs.getString("Nombre"));
                pasajeros.setApellido(rs.getString("Apellido"));
                pasajeros.setDNI(rs.getString("DNI"));
                pasajeros.setCorreo(rs.getString("Correo"));
                pasajeros.setTelefono(rs.getString("Telefono"));
                pasajeros.setEstado(rs.getBoolean("Estado"));                              
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
        return pasajeros;
    }
    
    
     public Pasajero buscarPasajeroPorNombre(String nombre) {
        Pasajero pasajeros = null;
        String sql = "SELECT ID_Pasajero, Nombre, Apellido, DNI, Correo, Teléfono, Estado FROM Pasajero WHERE Nombre = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(2,nombre );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasajeros = new Pasajero();        
                pasajeros.setID_Pasajero(rs.getInt("ID_Pasajero"));
                pasajeros.setNombre(rs.getString("Nombre"));
                pasajeros.setApellido(rs.getString("Apellido"));
                pasajeros.setDNI(rs.getString("DNI"));
                pasajeros.setCorreo(rs.getString("Correo"));
                pasajeros.setTelefono(rs.getString("Telefono"));
                pasajeros.setEstado(rs.getBoolean("Estado"));                              
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
        return pasajeros;
    }
    
    
     public Pasajero buscarPasajeroPorDni(String dni) {
        Pasajero pasajeros = null;
        String sql = "SELECT ID_Pasajero, Nombre, Apellido, DNI, Correo, Teléfono, Estado FROM Pasajero WHERE DNI = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(4,dni );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasajeros = new Pasajero();        
                pasajeros.setID_Pasajero(rs.getInt("ID_Pasajero"));
                pasajeros.setNombre(rs.getString("Nombre"));
                pasajeros.setApellido(rs.getString("Apellido"));
                pasajeros.setDNI(rs.getString("DNI"));
                pasajeros.setCorreo(rs.getString("Correo"));
                pasajeros.setTelefono(rs.getString("Telefono"));
                pasajeros.setEstado(rs.getBoolean("Estado"));                              
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
        return pasajeros;
    }
     
    
      public boolean modificarPasajero(Pasajero pasajero) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE Pasajero SET Nombre=?, Apellido=?, DNI=?, Correo=?, Telefono=?, Estado=? WHERE ID_Pasajero=?";

            // Prepared Statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setString(3, pasajero.getDNI());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isEstado());
            ps.setInt(7, pasajero.getID_Pasajero());

            // Ejecutar sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Pasajero modificado");
            } else { 
                result = false;
                System.out.println("No se pudo modificar el pasajero indicado");
            }

            // Cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            result = false;
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }

        return result;
    }
    
    

    public boolean eliminarPasajero(int idPasajero) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE Pasajero SET Estado=false WHERE ID_Pasajero=?";

            // Prepared Statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPasajero);

            // Ejecutar la sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Pasajero dado de baja");
            } else { 
                result = false;
                System.out.println("No se pudo dar de baja al Pasajero");
            }

            // Cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            result = false;
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }

        return result;
    }
     
     
     
}
