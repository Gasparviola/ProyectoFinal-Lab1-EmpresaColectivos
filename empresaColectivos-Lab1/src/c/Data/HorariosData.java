package c.Data;

import b.Entidades.Conexion;
import b.Entidades.Horario;
import b.Entidades.Ruta;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class HorariosData {

    private Connection con = null;
    private RutaData rd = new RutaData();

    public HorariosData(RutaData rd) {
        con = (Connection) Conexion.getConexion();
        this.rd = rd;
    }
    //Los usuarios deben poder añadir horarios a las rutas, especificando la hora de salida y llegada.
    public void añadirHorario(Horario horario) {
        if (horario == null || horario.getRuta() == null) {
            System.out.println("[añadirHorario] Error: El objeto Horario o su Ruta está nulo.");
            return; 
        }
    
        if (horario.getRuta().getID_Ruta() == 0) {
            System.out.println("[añadirHorario] Error: no se puede guardar. "
                + "Horario tiene ruta dada de baja o no tiene ID_Ruta definido. "
                + horario.debugToString());
                return;  
        }
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

            String sql = "SELECT * FROM Horario WHERE ID_Ruta = ? AND Estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, ID_Ruta);
            ResultSet rs = ps.executeQuery();
            Ruta rut = rd.buscarRutasPorID(rs.getInt("ID_Ruta"));
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
        
    
     public Horario buscarHorarioPorHoraLlegada(LocalTime Hora_Llegada) {
        Horario horarios = null;
        try {
            String sql = "SELECT * FROM Horario WHERE Horario.Hora_Llegada = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(Hora_Llegada));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                horarios = new Horario();
                horarios.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutasPorID(rs.getInt("ID_Ruta"));
                horarios.setRuta(rut);
                horarios.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horarios.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horarios.setEstado(rs.getBoolean("Estado"));
                
                System.out.println("Encontrado: " + horarios.debugToString());
            } else {
                System.out.println("No se ha encontrado horario con Hora_LLegada = " + Hora_Llegada);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Horario.buscarHorario] "
                    + "Error" + e.getErrorCode() + ": " + e.getMessage());
            e.printStackTrace();
        }
        return horarios;
    }
       
    
    
    public Horario buscarHorarioPorHoraSalida(LocalTime Hora_Salida) {
        Horario horarios = null;
        try {
            String sql = "SELECT * FROM Horario WHERE Horario.Hora_Salida = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(Hora_Salida));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                horarios = new Horario();
                horarios.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutasPorID(rs.getInt("ID_Ruta"));
                horarios.setRuta(rut);
                horarios.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horarios.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horarios.setEstado(rs.getBoolean("Estado"));
                
                System.out.println("Encontrado: " + horarios.debugToString());
            } else {
                System.out.println("No se ha encontrado horario con Hora_Salida = " + Hora_Salida);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Horario.buscarHorario] "
                    + "Error" + e.getErrorCode() + ": " + e.getMessage());
            e.printStackTrace();
        }
        return horarios;
    }
    
         
    
    public Horario buscarHorario(int ID_Horario) {
        Horario horarios = null;
        try {
            String sql = "SELECT * FROM Horario WHERE Horario.ID_Horario = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Horario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                horarios = new Horario();
                horarios.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutasPorID(rs.getInt("ID_Ruta"));
                horarios.setRuta(rut);
                horarios.setHora_Salida(rs.getTime("Hora_Salida").toLocalTime());
                horarios.setHora_Llegada(rs.getTime("Hora_Llegada").toLocalTime());
                horarios.setEstado(rs.getBoolean("Estado"));
                
                System.out.println("Encontrado: " + horarios.debugToString());
            } else {
                System.out.println("No se ha encontrado horario con ID_Horario = " + ID_Horario);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Horario.buscarHorario] "
                    + "Error" + e.getErrorCode() + ": " + e.getMessage());
            e.printStackTrace();
        }
        return horarios;
    }
    
    
    
    
    public List<Horario> listarHorarios() {
        List<Horario> listaHorario = new ArrayList();
        try {
            String sql = "SELECT * FROM Horario";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Horario horario;
            while (rs.next()) {
                horario = new Horario();
                horario.setID_Horario(rs.getInt("ID_Horario"));
                Ruta rut = rd.buscarRutasPorID(rs.getInt("ID_Ruta"));
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
            String sql = "UPDATE Horario SET ID_Ruta=?, Hora_Salida=?, Hora_Llegada=?, Estado=? WHERE ID_Horario=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getID_Ruta());
            ps.setTime(2, Time.valueOf(horario.getHora_Salida()));
            ps.setTime(3, Time.valueOf(horario.getHora_Llegada()));
            ps.setBoolean(4, horario.isEstado());
            ps.setInt(5, horario.getID_Horario());
            int filas = ps.executeUpdate();
            if (filas > 0) { 
                System.out.println("Horario modificado");
            } else { 
                result = false;
                System.out.println("No se pudo modificar al horario indicado");
            }
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
            String sql = "UPDATE Horario SET Estado=false WHERE ID_Horario=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHorario);
            int filas = ps.executeUpdate();
            if (filas > 0) { 
                System.out.println("Horario dado de baja");
            } else { 
                result = false;
                System.out.println("No se pudo dar de baja al Horario");
            }
            ps.close();
        } catch (SQLException e) {
            result = false;
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }
        return result;
    }
}
