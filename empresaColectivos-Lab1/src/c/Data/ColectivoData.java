package c.Data;

import b.Entidades.Colectivo;
import b.Entidades.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahue
 */
public class ColectivoData {

    private Connection connection;

    public ColectivoData() {
        this.connection = Conexion.getConexion();
    }

    public void añadirColectivo(Colectivo colectivo) {
        
        try {
            String sql = "INSERT INTO Colectivo(ID_Colectivo, Matricula, Marca, Modelo, Capacidad, Estado) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,colectivo.getID_Colectivo());
            ps.setString(2, colectivo.getMatricula());
            ps.setString(3, colectivo.getMarca());
            ps.setString(4, colectivo.getModelo());
            ps.setInt(5, colectivo.getCapacidad());
            ps.setBoolean(6, colectivo.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {               
                colectivo.setID_Colectivo(rs.getInt("ID_Colectivo"));
                JOptionPane.showMessageDialog(null, "Colectivo añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex.getMessage());
        }
    }
    
    public Colectivo buscarColectivo(int ID_Colectivo) {
        Colectivo colectivo = null;
        try {
            String sql = "SELECT * FROM Colectivo WHERE ID_Colectivo = ? AND Estado = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID_Colectivo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setID_Colectivo(ID_Colectivo);
                colectivo.setMatricula(rs.getString("Matricula"));
                colectivo.setMarca(rs.getString("Marca"));
                colectivo.setModelo(rs.getString("Modelo"));
                colectivo.setCapacidad(rs.getInt("Capacidad"));
                colectivo.setEstado(rs.getBoolean("Estado"));
            } else {
                System.out.println("No se encontro el colectivo");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }
        return colectivo;
    }
    
    public Colectivo buscarColectivoSegunEstado(int idColectivo, boolean estado) {
        Colectivo colectivo = null;
        try {
            String sql = "SELECT * FROM colectivo WHERE ID_Colectivo=? AND Estado=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idColectivo);
            ps.setBoolean(2, estado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setID_Colectivo(idColectivo);
                colectivo.setMatricula(rs.getString("Matricula"));
                colectivo.setModelo(rs.getString("Modelo"));
                colectivo.setMarca(rs.getString("Marca"));
                colectivo.setCapacidad(rs.getInt("Capacidad"));
                colectivo.setEstado(estado);

                System.out.println("Se encontro el Colectivo ");
            } else {
                System.out.println("No se encontro al Colectivo");
            }
            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }
        return colectivo;
    }
    
    public Colectivo buscarColectivoPorMatricula(String matricula) {
        Colectivo colectivo = null;
        try {
            String sql = "SELECT * FROM Colectivo WHERE Matricula=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, matricula);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setID_Colectivo(rs.getInt("ID_Colectivo"));
                colectivo.setMatricula(rs.getString("Matricula"));
                colectivo.setMarca(rs.getString("Marca"));
                colectivo.setModelo(rs.getString("Modelo"));
                colectivo.setCapacidad(rs.getInt("Capacidad"));
                colectivo.setEstado(rs.getBoolean("Estado"));
                System.out.println("Se encontro el colectivo");
            } else {
                System.out.println("No se encontro el colectivo");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }
        return colectivo;
    }
    
    public List<Colectivo> listarColectivos() {
        List<Colectivo> listaColectivos = new ArrayList();
        try {
            String sql = "SELECT * FROM colectivo";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Colectivo colectivo;
            while (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setID_Colectivo(rs.getInt("ID_Colectivo"));
                colectivo.setMatricula(rs.getString("Matricula"));
                colectivo.setMarca(rs.getString("Marca"));
                colectivo.setModelo(rs.getString("Modelo"));
                colectivo.setCapacidad(rs.getInt("Capacidad"));
                colectivo.setEstado(rs.getBoolean("Estado"));
                listaColectivos.add(colectivo);
            }                        
            ps.close();
        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }
        return listaColectivos;
    }

    public List<Colectivo> listarColectivoSegunEstado(boolean estado) {
        List<Colectivo> colectivos = new ArrayList();
        try{
            String sql = "SELECT * FROM colectivo WHERE estado=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            Colectivo colectivo;
            while (rs.next()) {
                 colectivo = new Colectivo();
                 colectivo.setID_Colectivo(rs.getInt("ID_Colectivo"));
                 colectivo.setMatricula(rs.getString("Matricula"));
                 colectivo.setMarca(rs.getString("Marca"));
                 colectivo.setModelo(rs.getString("Modelo"));
                 colectivo.setCapacidad(rs.getInt("Capacidad"));
                 colectivo.setEstado(rs.getBoolean("Estado"));
            }
            ps.close();
        } catch (SQLException e){
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }
        return colectivos;
    }
    
    public boolean modificarColectivo(Colectivo colectivo) {
        boolean result = true;
        try {
            String sql = "UPDATE Colectivo SET  Matricula=?, Marca=?, Modelo=?, Capacidad=?, Estado=? WHERE ID_Colectivo=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setBoolean(5, colectivo.isEstado());
            ps.setInt(6, colectivo.getID_Colectivo());
            int filas = ps.executeUpdate();
            if (filas > 0) { 
                System.out.println("Colectivo Modificado");
            } else { 
                result = false;
                System.out.println("No se pudo modificar al colectivo indicado");
            }
            ps.close();
        } catch (SQLException e) {
            result = false;
            System.out.println("[Error " + e.getErrorCode() + "]");
            e.printStackTrace();
        }
        return result;
    }
     
    public boolean eliminarColectivo(int idColectivo) {
        boolean result = true;
        try {
            String sql = "UPDATE colectivo SET Estado=false WHERE ID_Colectivo=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idColectivo);
            int filas = ps.executeUpdate();
            if (filas > 0) { 
                System.out.println("Colectivo dado de baja");
            } else { 
                result = false;
                System.out.println("No se pudo dar de baja al Colectivo");
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