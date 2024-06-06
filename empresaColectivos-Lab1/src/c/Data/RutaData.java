/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.Data;

import b.Entidades.Conexion;
import b.Entidades.Ruta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author El Notaloko 2.1
 */
public class RutaData {
    
     private Connection con = null;

    public RutaData() {
        con = (Connection) Conexion.getConexion();
    }
    
    public void añadirRuta(Ruta ruta) {
        
        try {
            String sql = "INSERT INTO Ruta(ID_Ruta, Origen, Destino, Duracion_Estimada, Estado) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ruta.getID_Ruta());
            ps.setString(2, ruta.getOrigen());
            ps.setString(3, ruta.getDestino());
            ps.setTime(4, Time.valueOf(ruta.getDuracion_Estimada()));
            ps.setBoolean(5, ruta.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                  ruta.setID_Ruta(rs.getInt("ID_Ruta"));
                JOptionPane.showMessageDialog(null, "Ruta añadida con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex.getMessage());
        }
    }
    
        public List<Ruta> listarRutas() {

        List<Ruta> rutas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Ruta WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Ruta Rutas;
            while (rs.next()) {
                Rutas = new Ruta(); 

                Rutas.setID_Ruta(rs.getInt(" ID_Ruta"));
                Rutas.setOrigen(rs.getString("Origen"));
                Rutas.setDestino(rs.getString("Destino"));
                Rutas.setDuracion_Estimada(rs.getTime("Duracion_Estimada").toLocalTime());
                Rutas.setEstado(rs.getBoolean("Estado"));
                rutas.add(Rutas);               
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ruta " + ex.getMessage());
        }
        return rutas;
    }

    
        //Buscar rutas por origen             
        public Ruta buscarRutaPorOrigen(String origen) {
        Ruta rutas = null;
        String sql = "SELECT ID_Ruta, Origen, Destino, Duracion_Estimada, Estado FROM Ruta WHERE Origen = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(2,origen );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                rutas = new Ruta();               
                rutas.setID_Ruta(rs.getInt(" ID_Ruta"));
                rutas.setOrigen(rs.getString("Origen"));
                rutas.setDestino(rs.getString("Destino"));
                rutas.setDuracion_Estimada(rs.getTime("Duracion_Estimada").toLocalTime());
                rutas.setEstado(rs.getBoolean("Estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta " + ex.getMessage());
        }
        return rutas;
    }
        
        
       //Buscar rutas por Destino     
       public Ruta buscarRutaPorDestino(String destino) {
        Ruta rutas = null;
        String sql = "SELECT ID_Ruta, Origen, Destino, Duracion_Estimada, Estado FROM Ruta WHERE Destino = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(3,destino );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                rutas = new Ruta();               
                rutas.setID_Ruta(rs.getInt(" ID_Ruta"));
                rutas.setOrigen(rs.getString("Origen"));
                rutas.setDestino(rs.getString("Destino"));
                rutas.setDuracion_Estimada(rs.getTime("Duracion_Estimada").toLocalTime());
                rutas.setEstado(rs.getBoolean("Estado"));              

            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta " + ex.getMessage());
        }
        return rutas;
    } 
       
       public Ruta buscarRutaPorId(int ID_Ruta) {         
        Ruta rutas = null;
        String sql = "SELECT ID_Ruta, Origen, Destino, Duracion_Estimada, Estado FROM Ruta WHERE ID_Ruta = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,ID_Ruta );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                rutas = new Ruta();               
                rutas.setID_Ruta(rs.getInt(" ID_Ruta"));
                rutas.setOrigen(rs.getString("Origen"));
                rutas.setDestino(rs.getString("Destino"));
                rutas.setDuracion_Estimada(rs.getTime("Duracion_Estimada").toLocalTime());
                rutas.setEstado(rs.getBoolean("Estado"));              
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta " + ex.getMessage());
        }
        return rutas;
    } 
        
    
}
