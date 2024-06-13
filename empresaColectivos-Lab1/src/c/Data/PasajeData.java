package c.Data;

import b.Entidades.Colectivo;
import b.Entidades.Conexion;
import b.Entidades.Pasaje;
import b.Entidades.Pasajero;
import b.Entidades.Ruta;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PasajeData {
    
    private Connection connection;
    private final PasajerosData pasajeroData;
    private final ColectivoData colectivoData;
    private final RutaData rutaData;

    public PasajeData(PasajerosData pasajeroData,ColectivoData colectivoData,RutaData rutaData) {
        this.connection = Conexion.getConexion();
        this.colectivoData = colectivoData;
        this.pasajeroData= pasajeroData;
        this.rutaData= rutaData;
    }
    
    public boolean guardarPasaje(Pasaje pasaje) {
        if (pasaje == null || pasaje.getPasajero() == null || pasaje.getColectivo() == null || pasaje.getRuta() == null) {
            System.out.println("[guardarPasaje] Error: El objeto Pasaje o sus propiedades están nulos.");
            return false;  // Salir temprano si la condición se cumple
        }
//        if (pasaje.getID_Pasaje() == -1) {
//            System.out.println("[PasajeData.guardarSiniestro] Error: no se puede guardar. "
//                    + "Pasaje dado de baja o tiene ID_Pasaje definido. "
//                    + pasaje.debugToString());
//            return false;
//        }

        boolean resultado = false;
        try {
            String sql = "INSERT INTO Pasaje(ID_Pasaje,ID_Pasajero, ID_Colectivo, ID_Ruta, Fecha_Viaje, Hora_Viaje, Asiento, Precio) "
                    + "VALUES (?,?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasaje.getID_Pasaje());
            ps.setInt(2, pasaje.getPasajero().getID_Pasajero());
            ps.setInt(3, pasaje.getColectivo().getID_Colectivo());
            ps.setInt(4, pasaje.getRuta().getID_Ruta());
            ps.setDate(5, Date.valueOf(pasaje.getFecha_Viaje()) );
            ps.setTime(6, Time.valueOf(pasaje.getHora_Viaje()) );
            ps.setInt(7, pasaje.getAsiento());
            ps.setDouble(8, pasaje.getPrecio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setID_Pasaje(rs.getInt("ID_Pasaje"));
                resultado = true;
                System.out.println("[PasajeData.guardarPasaje] "
                        + "Agregado: " + pasaje.toString());
            } else {
                System.out.println("[PasajeData.guardarPasaje] "
                        + "No se pudo agregar: " + pasaje.toString());
            }
            ps.close();
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) { // Informar datos repetidos
                System.out.println("[PasajeData.guardarPasaje] "
                        + "Error: entrada duplicada para " + pasaje.toString());
            } else {
                e.printStackTrace();
            }
        }
        return resultado;
    }
    
    public Pasaje buscarPasaje(int ID_Pasaje) {
        
        Pasaje pasaje = null;
        try {    
            String sql = "SELECT * FROM Pasaje WHERE Pasaje.ID_Pasaje=?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID_Pasaje);


            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setID_Pasaje(rs.getInt("ID_Pasaje"));
                Pasajero paje = pasajeroData.buscarPasajero(rs.getInt("ID_Pasajero"));
                pasaje.setPasajero(paje);
                Colectivo cole = colectivoData.buscarColectivo(rs.getInt("ID_Colectivo"));
                pasaje.setColectivo(cole);              
                Ruta rut = rutaData.buscarRutasPorID(rs.getInt("ID_Ruta"));
                pasaje.setRuta(rut);
                pasaje.setFecha_Viaje(rs.getDate("Fecha_Viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("Hora_Viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getInt("Precio"));
                System.out.println("Encontrado: " + pasaje.toString());
            } else {
                System.out.println("No se encontro el Pasaje");
            }

            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }

        return pasaje;
    }
       
    
    
    public boolean modificarPasaje(Pasaje pasaje) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE Pasaje SET ID_Pasajero=?, ID_Colectivo=?, ID_Ruta=?, Fecha_Viaje=?, Hora_Viaje=?, Asiento=?, Precio=? WHERE ID_Pasaje=?";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pasaje.getPasajero().getID_Pasajero());
            ps.setInt(2, pasaje.getColectivo().getID_Colectivo());
            ps.setInt(3, pasaje.getRuta().getID_Ruta());
            ps.setDate(4, Date.valueOf(pasaje.getFecha_Viaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHora_Viaje()));
            ps.setInt(6,pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.setInt(8, pasaje.getID_Pasaje());

            // Ejecutar sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Pasaje Modificado");
            } else { 
                result = false;
                System.out.println("No se pudo modificar al pasaje indicado");
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
    
    public List<Pasaje> listarPasaje() {
        List<Pasaje> listaPasaje = new ArrayList();
        try {
            String sql = "SELECT * FROM Pasaje";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Pasaje pasaje;
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setID_Pasaje(rs.getInt("ID_Pasaje"));
                Pasajero paje = pasajeroData.buscarPasajero(rs.getInt("ID_Pasajero"));
                pasaje.setPasajero(paje);
                Colectivo cole = colectivoData.buscarColectivo(rs.getInt("ID_Colectivo"));
                pasaje.setColectivo(cole);
                Ruta rut = rutaData.buscarRutasPorID(rs.getInt("ID_Ruta"));
                pasaje.setRuta(rut);               
                pasaje.setFecha_Viaje(rs.getDate("Fecha_Viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("Hora_Viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                listaPasaje.add(pasaje);
            }                        

            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }

        return listaPasaje;
    }
    
    public List<Pasaje> listarPasajeActivos() {
        List<Pasaje> listaPasaje = new ArrayList();

        try {
            // Preparar sentencia SQL
            String sql = "SELECT * FROM Pasaje";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);

            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            // Si se encontro uno o mas alumnos, crear objetos de tipo Alumno con los datos obtenidos y añadirlos a 'alumnos'
            Pasaje pasaje;
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setID_Pasaje(rs.getInt("ID_Pasaje"));
                Pasajero paje = pasajeroData.buscarPasajero(rs.getInt("ID_Pasajero"));
                pasaje.setPasajero(paje);
                Colectivo cole = colectivoData.buscarColectivo(rs.getInt("ID_Colectivo"));
                pasaje.setColectivo(cole);
                Ruta rut = rutaData.buscarRutasPorID(rs.getInt("ID_Ruta"));
                pasaje.setRuta(rut);               
                pasaje.setFecha_Viaje(rs.getDate("Fecha_Viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("Hora_Viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                listaPasaje.add(pasaje);
            }                        

            // Cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }

        return listaPasaje;
    }
    
    public boolean eliminarPasaje(int idPasaje) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "DELETE FROM Pasaje WHERE ID_Pasaje=?";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPasaje);

            // Ejecutar la sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Pasaje dado de baja");
            } else { 
                result = false;
                System.out.println("No se pudo dar de baja al Pasaje");
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
