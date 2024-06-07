package c.Data;

import b.Entidades.Colectivo;
import b.Entidades.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahue
 */
public class ColectivoData {

    private Connection connection;

    public ColectivoData() {
        this.connection = Conexion.getConexion();
    }

    public boolean guardarColectivo(Colectivo colectivo) {
        boolean result = true;

        try {
            // preparar la estructura de la sentencia SQL
            String sql;
            if (colectivo.getID_Colectivo() == -1) {
                sql = "INSERT INTO colectivo(Matrícula, Marca, Modelo, Capacidad, Estado) VALUES(?,?,?,?,?)";

            } else {
                sql = "INSERT INTO colectivo(ID_Colectivo, Matrícula, Marca, Modelo, Capacidad, Estado) VALUES(?,?,?,?,?,?)";
            }

            //prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setBoolean(5, colectivo.isEstado());

            //si ID_colectiv es igual a -1, entonces se asigna automaticamente
            if (colectivo.getID_Colectivo() == -1) {
                ps.setInt(6, colectivo.getID_Colectivo());
            }

            //ejecutar la sentencia sql
            int filas = ps.executeUpdate();

            // comunicar resultado por consola
            if (filas > 0) {
                System.out.println("Colectivo agregado");
            } else {
                result = false;
                System.out.println("No se pudo agregar Colectivo");
            }

            // cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            result = false;
            int errorCode = e.getErrorCode();
            if (errorCode == 1062) {  //colectivo repetido
                System.out.println("[Error " + errorCode + "] (Colectivo repetido)");
        } else {
                System.out.println("[Error " + errorCode + "]");
            }
            e.printStackTrace();
        }

        return result;
    }
    
    public Colectivo buscarColectivo(int idColectivo) {
        Colectivo colectivo = null;
        try {
            // Preparar sentencia SQL
            String sql = "SELECT * FROM colectivo WHERE ID_Colectivo;";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idColectivo);

            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            /* Si se encontro al colectivo, crear nuevo objeto de tipo colectivo con los datos obtenidos 
               y, en todo caso, comunicar el resultado por consola */
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setID_Colectivo(idColectivo);
                colectivo.setMatricula(rs.getString("Matricula"));
                colectivo.setMarca(rs.getString("Marca"));
                colectivo.setModelo(rs.getString("Modelo"));
                colectivo.setCapacidad(rs.getInt("Capacidad"));
                colectivo.setEstado(rs.getBoolean("Estado"));

                System.out.println("Se encontro el colectivo");
            } else {
                System.out.println("No se encontro el colectivo");
            }

            // Cerrar el preparedStatement
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
            // Preparar sentencia SQL
            String sql = "SELECT * FROM colectivo WHERE ID_Colectivo=? AND Estado=?;";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idColectivo);
            ps.setBoolean(2, estado);
            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            /* Si se encontró al alumno, crear nuevo objeto de tipo Alumno con los datos obtenidos 
               y, en todo caso, comunicar el resultado por consola */
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

            // Cerrar el preparedStatement
            ps.close();

        } catch (SQLException e) {
            System.out.println("[Error " + e.getErrorCode() + "] ");
            e.printStackTrace();
        }

        return colectivo;
    }
    
    public Colectivo buscarColectivoPorMatricula(String matricula) {
        /*
         * El proposito de esta funcion es poder buscar colectivos por matricula.
         */
        Colectivo colectivo = null;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "SELECT * FROM colectivo WHERE Matricula=?";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(2, matricula);

            // Ejecutar la sentencia SQL
            ResultSet rs = ps.executeQuery();

            /* Si se encontro al alumno, crear nuevo objeto de tipo Alumno con los datos obtenidos 
               y, en todo caso, comunicar el resultado por consola */
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setID_Colectivo(rs.getInt("ID_Colectivo"));
                colectivo.setMatricula(rs.getString("Matricula"));
                colectivo.setMarca(rs.getString("Marca"));
                colectivo.setModelo(rs.getString("Modelo"));
                colectivo.setCapacidad(rs.getInt("Modelo"));
                colectivo.setEstado(rs.getBoolean("Estado"));

                System.out.println("Se encontro el colectivo");
            } else {
                System.out.println("No se encontro el colectivo");
            }

            // Cerrar el preparedStatement
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
            // Preparar sentencia SQL
            String sql = "SELECT * FROM colectivo;";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);

            // Ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();

            // Si se encontro uno o mas alumnos, crear objetos de tipo Alumno con los datos obtenidos y añadirlos a 'alumnos'
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

            // Cerrar el preparedStatement
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
            // preparar la sentencia SQL
            String sql = "SELECT * FROM colectivo WHERE estado=?;";
            
            //prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setBoolean(1, estado);
            
            //ejecutar sentencia SQL
            ResultSet rs = ps.executeQuery();
            
            //si se encontro uno o mas colectivos, crear objetos de tipo colectivo con los datos obtenidos y añardilos a 'alumno'
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
            
            //cerrar el preparedStatement
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
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE colectivo SET ID_Colectivo=?, Matrícula=?, Marca=?, Modelo=?, Capacidad=?, Estado=? WHERE ID_Colectivo=?";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setBoolean(5, colectivo.isEstado());
            ps.setInt(6, colectivo.getID_Colectivo());

            // Ejecutar sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Colectivo Modificado");
            } else { 
                result = false;
                System.out.println("No se pudo modificar al colectivo indicado");
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
     
    public boolean eliminarColectivo(int idColectivo) {
        boolean result = true;

        try {
            // Preparar la estructura de la sentencia SQL
            String sql = "UPDATE colectivo SET Estado=false WHERE idColectivo=?";

            // Prepared Statement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idColectivo);

            // Ejecutar la sentencia SQL
            int filas = ps.executeUpdate();

            // Comunicar resultado por consola
            if (filas > 0) { 
                System.out.println("Colectivo dado de baja");
            } else { 
                result = false;
                System.out.println("No se pudo dar de baja al Colectivo");
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
