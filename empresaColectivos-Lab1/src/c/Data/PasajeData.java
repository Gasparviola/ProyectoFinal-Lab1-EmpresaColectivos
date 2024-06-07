package c.Data;

import b.Entidades.Conexion;
import b.Entidades.Pasaje;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahue
 */
public class PasajeData {
    
    private Connection connection;
    private final PasajerosData pasajeroData;
    private final ColectivoData colectivoData;
    private final RutaData rutaData;

    public PasajeData(HorariosData horarioData, PasajerosData pasajeroData,ColectivoData colectivoData,RutaData rutaData) {
        this.connection = Conexion.getConexion();
        this.colectivoData = colectivoData;
        this.pasajeroData= pasajeroData;
        this.rutaData= rutaData;
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
            String sql = "INSERT INTO Pasaje(Id_Pasajero, ID_Colectivo, ID_Ruta, Fecha_Viaje, Hora_Viaje, Asiento, Precio) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasaje.getPasajero().getID_Pasajero());
            ps.setInt(2, pasaje.getColectivo().getID_Colectivo());
            ps.setInt(3, pasaje.getRuta().getID_Ruta());
            ps.setDate(4, Date.valueOf(pasaje.getFecha_Viaje()) );
            ps.setTime(5, Time.valueOf(pasaje.getHora_Viaje()) );
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
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
    
    public Pasaje buscarPasaje(int idPasaje) {
        Pasaje pasaje = null;
        try {
            // Preparar sentencia SQL
            String sql = "SELECT * FROM pasaje WHERE ID_Pasaje;";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPasaje);

            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            /* Si se encontro al colectivo, crear nuevo objeto de tipo colectivo con los datos obtenidos 
               y, en todo caso, comunicar el resultado por consola */
            if (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setID_Pasaje(idPasaje);
                pasaje.setFecha_Viaje(rs.getDate("fecha viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("hora viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getInt("Precio"));
                System.out.println("Se encontro el Pasaje");
            } else {
                System.out.println("No se encontro el Pasaje");
            }

            // Cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }

        return pasaje;
    }
    
//    public Pasaje buscarPasajePorHoraDeViaje(Date Fecha_Viaje) {
//        Pasaje pasaje = null;
//        try {
//            // Preparar sentencia SQL
//            String sql = "SELECT * FROM pasaje WHERE ID_Pasaje;";
//
//            // Prepared Statement
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setDate(1, Fecha_Viaje);
//
//            // Ejecutar sentencia SQL
//            ResultSet rs = ps.executeQuery();
//
//            /* Si se encontro al colectivo, crear nuevo objeto de tipo colectivo con los datos obtenidos 
//               y, en todo caso, comunicar el resultado por consola */
//            if (rs.next()) {
//                pasaje = new Pasaje();
//                pasaje.setFecha_Viaje(Fecha_Viaje);
//                pasaje.setFecha_Viaje(rs.getDate("fecha viaje").toLocalDate());
//                pasaje.setHora_Viaje(rs.getTime("hora viaje").toLocalTime());
//                pasaje.setAsiento(rs.getInt("Asiento"));
//                pasaje.setPrecio(rs.getInt("Precio"));
//                System.out.println("Se encontro el colectivo");
//            } else {
//                System.out.println("No se encontro el colectivo");
//            }
//
//            // Cerrar el preparedStatement
//            ps.close();
//
//        } catch (SQLException e) {
//            System.out.println("[Error " + e.getErrorCode() + "]");
//            e.printStackTrace();
//        }
//
//        return pasaje;
//    }
    
    
    
    public boolean modificarPasaje(Pasaje pasaje) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE Pasaje SET ID_Pasajero=?, ID_Colectivo=?, ID_Ruta=?, Fecha_Viaje=?, Hora_Viaje=?, Asiento=?, Precio=? WHERE ID_Pasaje";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pasaje.getPasajero().getID_Pasajero());
            ps.setInt(2, pasaje.getColectivo().getID_Colectivo());
            ps.setInt(3, pasaje.getRuta().getID_Ruta());
            ps.setDate(4, Date.valueOf(pasaje.getFecha_Viaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHora_Viaje()));
            ps.setDouble(6, pasaje.getPrecio());

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
            // Preparar sentencia SQL
            String sql = "SELECT * FROM Pasaje;";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);

            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            // Si se encontro uno o mas alumnos, crear objetos de tipo Alumno con los datos obtenidos y añadirlos a 'alumnos'
            Pasaje pasaje;
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setID_Pasaje(rs.getInt("ID_Colectivo"));
                pasaje.setPasajero(pasajeroData.buscarPasajero(rs.getInt("Id_Pasajero")));
                pasaje.setColectivo(colectivoData.buscarColectivo(rs.getInt("Id_Colectivo")));
                pasaje.setRuta(rutaData.buscarRutaPorId(rs.getInt("Id_Colectivo")));
                pasaje.setFecha_Viaje(rs.getDate("Fecha viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("Estado").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));
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
    
    public List<Pasaje> listarPasajeActivos() {
        List<Pasaje> listaPasaje = new ArrayList();

        try {
            // Preparar sentencia SQL
            String sql = "SELECT * FROM Pasaje;";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);

            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            // Si se encontro uno o mas alumnos, crear objetos de tipo Alumno con los datos obtenidos y añadirlos a 'alumnos'
            Pasaje pasaje;
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setID_Pasaje(rs.getInt("ID_Colectivo"));
                pasaje.setPasajero(pasajeroData.buscarPasajero(rs.getInt("Id_Pasajero")));
                pasaje.setColectivo(colectivoData.buscarColectivo(rs.getInt("Id_Colectivo")));
                pasaje.setRuta(rutaData.buscarRutaPorId(rs.getInt("Id_Colectivo")));
                pasaje.setFecha_Viaje(rs.getDate("Fecha viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("Estado").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));
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
            String sql = "UPDATE Pasaje SET Estado=false WHERE idPasaje=?";

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
