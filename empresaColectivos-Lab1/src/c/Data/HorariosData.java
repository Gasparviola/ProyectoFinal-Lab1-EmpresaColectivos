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
    public void añadirPasajero(Horario horario) {

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
    
    
    
    //Los usuarios deben poder buscar horarios por ruta u horario de salida.
//    public Horario buscarRutaPorId(int ID_Ruta) {         
//        Horario horarios = null;
//        String sql = "SELECT * FROM Horario WHERE  ID_Ruta = ? AND Estado = 1";
//        PreparedStatement ps = null;
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(2,ID_Ruta );
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                horarios = new Horario();
//                horarios.setID_Horario(rs.getInt("ID_Horario"));
//                horarios.setRuta(rs.getInt("ID_Ruta"));
//                rutas.setID_Ruta(rs.getInt(" ID_Ruta"));
//                rutas.setOrigen(rs.getString("Origen"));
//                rutas.setDestino(rs.getString("Destino"));
//                rutas.setDuración_Estimada(rs.getTime("Duración_Estimada").toLocalTime());
//                rutas.setEstado(rs.getBoolean("Estado"));              
//                
//            } else {
//                JOptionPane.showMessageDialog(null, "No existe la ruta");               
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta " + ex.getMessage());
//        }
//        return horarios;
//    } 
    
    

}
