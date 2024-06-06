package c.Data;

import b.Entidades.Conexion;
import b.Entidades.Pasaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nahue
 */
public class PasajeData {
    
    private Connection connection;

    public PasajeData() {
        this.connection = Conexion.getConexion();
    }
    
    public boolean guardarPasaje(Pasaje pasaje) {
        if (pasaje.getID_Pasaje() != -1) {
            System.out.println("[PasajeData.guardarSiniestro] Error: no se puede guardar. "
                    + "Pasaje dado de baja o tiene ID_Pasaje definido. "
                    + pasaje.debugToString());
            return false;
        }

        boolean resultado = false;
        try {
            String sql = "INSERT INTO siniestro(ID_Pasaje, Id_Pasajero, ID_Colectivo, ID_Ruta, Fecha_Viaje, Hora_Viaje, Asiento, Precio) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt (1, pasaje.getID_Pasaje());
            ps.setInt(2, pasaje.getPasajero().getID_Pasajero());
            ps.setInt(3, pasaje.getColectivo().getID_Colectivo());
            ps.setInt(4, pasaje.getRuta().getID_Ruta());
//            ps.setDate(5, pasaje.getFecha_Viaje());
//            ps.setDate(6, pasaje.getHora_Viaje());
            ps.setInt(7, pasaje.getAsiento());
            ps.setDouble(8, pasaje.getPrecio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setID_Pasaje(rs.getInt(1));
                resultado = true;
                System.out.println("[PasajeData.guardarPasaje] "
                        + "Agregado: " + pasaje.debugToString());
            } else {
                System.out.println("[PasajeData.guardarPasaje] "
                        + "No se pudo agregar: " + pasaje.debugToString());
            }
            ps.close();
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) { // Informar datos repetidos
                System.out.println("[PasajeData.guardarPasaje] "
                        + "Error: entrada duplicada para " + pasaje.debugToString());
            } else {
                e.printStackTrace();
            }
        }
        return resultado;
    }
    
    
}
