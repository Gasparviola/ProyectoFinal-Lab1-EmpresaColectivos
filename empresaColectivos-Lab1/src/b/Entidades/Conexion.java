/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.Entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author El Notaloko 2.1
 */
public class Conexion {
    private static String CLASS = "org.mariadb.jdbc.Driver";
    private static String url="jdbc:mariadb://localhost/transpuntanosl";
    private static String usuario="root";
    private static String password="";


    private static Conexion conexion=null;

     private Conexion() {
        try {
            //1)Cargar Drivers.
            Class.forName(CLASS);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }
    public static Connection getConexion() {
        Connection con=null;
      if(conexion == null){

           conexion= new Conexion();
        }
        try {
            //2)Establecer la Conexion.
            con = (Connection) DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }

        return con;
    }
}
