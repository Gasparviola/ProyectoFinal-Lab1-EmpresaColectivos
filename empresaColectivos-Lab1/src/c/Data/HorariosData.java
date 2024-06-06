package c.Data;

import b.Entidades.Conexion;
import b.Entidades.Horario;
import b.Entidades.Ruta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author El Notaloko 2.1
 */
public class HorariosData {

    private Connection con = null;
    private RutaData rd = new RutaData();

    public HorariosData(RutaData rd) {
        con = (Connection) Conexion.getConexion();
        this.rd = rd;
    }

    
    //Los usuarios deben poder añadir horarios a las rutas, especificando la hora de salida y llegada.
    public void añadirHorario(Horario horario) {

        try {
            String sql = "INSERT INTO Horario(ID_Horario, ID_Ruta, Hora_Salida, Hora_Llegada, Estado) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, horario.getID_Horario());
            ps.setInt(2, horario.getRuta().getID_Ruta());
            ps.setTime(3, Time.valueOf(horario.getHora_Salida()));
            ps.setTime(4, Time.valueOf(horario.getHora_Llegada()));
            ps.setBoolean(5, horario.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                horario.setID_Horario(rs.getInt("ID_Horario"));
                JOptionPane.showMessageDialog(null, "Horario añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex.getMessage());
        }
    }
  
    
    //Los usuarios deben poder visualizar los horarios disponibles para una ruta específica.
    public List<Horario> listarHorariosDisponibles(int ID_Ruta) {

        ArrayList<Horario> disponibles = new ArrayList<>();

        try {

            String sql = "SELECT   *   FROM  Horario  WHERE   ID_Ruta  =  ?  AND    Estado  =  1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, ID_Ruta);
            ResultSet rs = ps.executeQuery();

            Ruta rut = rd.buscarRutaPorId(rs.getInt("ID_Ruta"));

            if (rut != null) {
                
                while (rs.next()) {
                    
                    Horario horario = new Horario();
                    horario.setID_Horario(rs.getInt("ID_Horario"));
                    horario.setRuta(rut);
                    horario.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                    horario.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                    horario.setEstado(rs.getBoolean("Estado"));
                    disponibles.add(horario);    
                    
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "No existen horarios disponibles para esta ruta");
            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return disponibles;
    }
        
    
    public Horario buscarHorarioPorHoraLlegada(Time Hora_Llegada) {
        Horario horarios = null;
        String sql = "SELECT  *   FROM Horario WHERE Hora_Llegada = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setTime(4, Hora_Llegada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                horarios = new Horario();      
                horarios.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutaPorId(rs.getInt("ID_Ruta"));
                horarios.setRuta(rut);
                horarios.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horarios.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horarios.setEstado(rs.getBoolean("Estado"));                                                          
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Horario");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario " + ex.getMessage());
        }
        return horarios;
    }
    
    
    public Horario buscarHorarioPorHoraSalida(Time Hora_Salida) {
        Horario horarios = null;
        String sql = "SELECT  *   FROM Horario WHERE Hora_Salida = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setTime(3, Hora_Salida);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                horarios = new Horario();      
                horarios.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutaPorId(rs.getInt("ID_Ruta"));
                horarios.setRuta(rut);
                horarios.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horarios.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horarios.setEstado(rs.getBoolean("Estado"));                                                          
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Horario");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario " + ex.getMessage());
        }
        return horarios;
    }
     
     
    public Horario buscarHorarioSegunEstado(int idHorario, boolean estado) {
        Horario horario = null;
        try {
            // Preparar sentencia SQL
            String sql = "SELECT * FROM Horario WHERE ID_Horario=? AND Estado=?;";

            // Prepared Statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHorario);
            ps.setBoolean(2, estado);
            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                horario = new Horario();
                horario.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutaPorId(rs.getInt("ID_Ruta"));
                horario.setRuta(rut);
                horario.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horario.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("Estado"));
                               
                System.out.println("Se encontro el Horario ");
            } else {
                System.out.println("No se encontro el Horario");
            }

            // Cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }

        return horario;
    }
         
    
    public List<Horario> listarHorarios() {
        List<Horario> listaHorario = new ArrayList();

        try {
            String sql = "SELECT * FROM Horario;";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            Horario horario;
            while (rs.next()) {
                horario = new Horario();
                horario.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutaPorId(rs.getInt("ID_Ruta"));
                horario.setRuta(rut);
                horario.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horario.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("Estado"));   
                listaHorario.add(horario);
            }                        
           
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }

        return listaHorario;
    }
    
    
    public boolean modificarHorario(Horario horario) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE Horario SET ID_Ruta=?, Hora_Salida=?, Hora_Llegada=?, Estado=? WHERE ID_Horario=?";

            // Prepared Statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getID_Ruta());
            ps.setTime(2, Time.valueOf(horario.getHora_Salida()));
            ps.setTime(3, Time.valueOf(horario.getHora_Llegada()));
            ps.setBoolean(4, horario.isEstado());
            ps.setInt(5, horario.getID_Horario());

            // Ejecutar sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Horario modificado");
            } else { 
                result = false;
                System.out.println("No se pudo modificar al horario indicado");
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
    
    

    public boolean eliminarHorario(int idHorario) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE Horario SET Estado=false WHERE ID_Horario=?";

            // Prepared Statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHorario);

            // Ejecutar la sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Horario dado de baja");
            } else { 
                result = false;
                System.out.println("No se pudo dar de baja al Horario");
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
