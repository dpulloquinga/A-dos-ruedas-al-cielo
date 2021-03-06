/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.net.URL;
import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



public class BaseDatos {
    private static final String HOST="localhost";
    private static final String USER="root";
    private static final String PASS="";
    Connection conexion;
    Statement st;
    
    public BaseDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/cielo", USER, PASS);
            st = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean obtenerUsuario(String user, String password) {

        String sql = "SELECT * FROM usuarios_usuario WHERE nickname='" + user + "' AND password='" + password + "'";
        PreparedStatement ps;
        ResultSet rs;
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            return rs.first();

        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean addCiudad(String nombre,String descripcion,String poblacion,String bandera,String ciudad){
        PreparedStatement ps = null;
        String sql = "INSERT INTO `cielo`.`ciudades_ciudad`(`nombre`,`description`,`poblacion`,`bandera`,`imagen`)\n" +
"VALUES(?,?,?,?,?);";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setString(3, poblacion);
            ps.setString(4, bandera);
            ps.setString(5, ciudad);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    return false;
    }
    public boolean addGuia(String nombre, String apellido, String fecha,
            String cedula, String genero, String antiguedad, String email,
            String telefono, String foto, String about) {

        String sql = "INSERT INTO `cielo`.`guias_guia` (`nombre`, `apellido`,"
                + " `fecha_nacimiento`, `cedula`, `genero`, `antiguedad`,"
                + " `email`, `telefono`, `foto`, `descripcion`) "
                + "VALUES (?,?, ?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, fecha);
            ps.setString(4, cedula);
            ps.setString(5, genero);
            ps.setString(6, antiguedad);
            ps.setString(7, email);
            ps.setString(8, telefono);
            ps.setString(9, foto);
            ps.setString(10, about);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
  
    public boolean searchGuia(String cedula) {
        PreparedStatement ps=null;
        ResultSet rs ;
        String sql = "SELECT `cedula` FROM `cielo`.`guias_guia`;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs.first();

        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public String fillGuia(String cedula) {
        String nombre, apellido, fecha, cedul, genero, antiguedad, email, telefono, foto,
                descripcion;
        String split = "?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        String vuelta = null;
        String sql = "SELECT * FROM `cielo`.`guias_guia` where `cedula`=" + cedula + ";";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                fecha = rs.getDate("fecha_nacimiento").toString();
                cedul = rs.getString("cedula");
                genero = rs.getString("genero");
                antiguedad = rs.getString("antiguedad");
                email = rs.getString("email");
                telefono = rs.getString("telefono");
                foto = rs.getString("foto");
                descripcion = rs.getString("descripcion");

                vuelta = nombre + split + apellido + split +
                        fecha + split + cedul + split + genero + split +
                        antiguedad + split + email + split + telefono +
                        split + foto + split + descripcion;
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         System.out.println(vuelta);
        return vuelta;
    }
    
    public boolean addRuta(String nombre,String origen,String destino,String tiempo,String imagen){
        PreparedStatement ps = null;
        String sql = "INSERT INTO `cielo`.`rutas_ruta`(`nombre`,`origen`,`destino`,`tiempo`,`imagen`)\n" +
"VALUES(?,?,?,?,?);";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, origen);
            ps.setString(3, destino);
            ps.setString(4, tiempo);
            ps.setString(5, imagen);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    return false;
    }
    public boolean addGaleria(String nombre_galeria,String imagen_1,String descripcion_1,String imagen_2,String descripcion_2,String imagen_3,String descripcion_3){
        PreparedStatement ps = null;
        String sql = "INSERT INTO `cielo`.`galerias_galeria`(`nombre_galeria`,`imagen_1`,`descripcion_1`,`imagen_2`,`descripcion_2`,`imagen_3`,`descripcion_3`)\n" +
"VALUES(?,?,?,?,?,?,?);";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre_galeria);
            ps.setString(2, imagen_1);
            ps.setString(3, descripcion_1);
            ps.setString(4, imagen_2);
            ps.setString(5, descripcion_2);
            ps.setString(6, imagen_3);
            ps.setString(7, descripcion_3);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    return false;
    }
    public boolean addHospedaje(String nombre,String descripcion,int costo,String telefono,String direccion,String imagen){
        PreparedStatement ps = null;
        String sql = "INSERT INTO `cielo`.`hospedajes_hospedaje`(`nombre`,`descripcion`,`costo`,`telefono`,`direccion`,`imagen`)\n" +
"VALUES(?,?,?,?,?,?);";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, costo);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
            ps.setString(6, imagen);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    return false;
    }
    
    public boolean addUser(String nickname,String password,String email,String nombre,String apellido){
        PreparedStatement ps = null;
        String sql = "INSERT INTO `cielo`.`usuarios_usuario`(`nickname`,`password`,`email`,`nombre`,`apellido`)\n" +
"VALUES(?,?,?,?,?);";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nickname);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, nombre);
            ps.setString(5, apellido);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

    public LinkedList ObtenerCiudad_nombre() {
        PreparedStatement ps = null;
        ResultSet rs=null;
        LinkedList lista = new LinkedList();
        String sql = "SELECT `nombre` FROM `cielo`.`ciudades_ciudad`;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista;
    }

    public LinkedList ObtenerCiudad_datos(String ciudad) {
        Statement ps = null;
        ResultSet rs;
        LinkedList lista = new LinkedList();
       
        System.out.println(ciudad);
        String sql = "SELECT * FROM `cielo`.`ciudades_ciudad` WHERE nombre = '"+ciudad+"';";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.createStatement();
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                lista.add(rs.getString("nombre"));
                lista.add(rs.getString("description") );
                lista.add(rs.getString("poblacion") );
                lista.add(rs.getString("bandera") );
                lista.add(rs.getString("imagen"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }
    
     public boolean updateCiudad(String nombre,String descripcion,String poblacion,String bandera,String ciudad){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE `cielo`.`ciudades_ciudad`SET `description` =?,`poblacion` =? ,`bandera` =? ,`imagen` = ? WHERE `nombre` =? ;";
         System.out.println(sql);
        
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1,descripcion);
            ps.setString(2, poblacion);
            ps.setString(3, bandera);
            ps.setString(4, ciudad);
            ps.setString(5, nombre);
            
             int a = ps.executeUpdate();
            conexion.commit();
            if (a==1) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

    public LinkedList obtenerNombreGalerias() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        String sql = "SELECT `nombre_galeria` FROM `cielo`.`galerias_galeria`;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("nombre_galeria"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista;

    }
    public LinkedList ObtenerGaleria_datos(String galeria) {
        Statement ps = null;
        ResultSet rs;
        LinkedList lista = new LinkedList();

        String sql = "SELECT * FROM `cielo`.`galerias_galeria` WHERE nombre_galeria = '"+galeria+"';";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.createStatement();
            rs = ps.executeQuery(sql);
            lista.clear();
            while (rs.next()) {
 
                lista.add(rs.getString("imagen_1") );
                lista.add(rs.getString("descripcion_1") );
                lista.add(rs.getString("imagen_2") );
                lista.add(rs.getString("descripcion_2") );
                lista.add(rs.getString("imagen_3") );
                lista.add(rs.getString("descripcion_3") );
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }
    
    
    public boolean updateGalerias(String nombre,String imagen_1,String descripcion_1,String imagen_2,String descripcion_2,String imagen_3,String descripcion_3){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE `cielo`.`galerias_galeria`SET `imagen_1` =?,`descripcion_1` =? ,`imagen_2` =? ,`descripcion_2` = ? ,`imagen_3` = ?,`descripcion_3` = ? WHERE `nombre_galeria` =? ;";
         System.out.println(sql);
        
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1,imagen_1);
            ps.setString(2, descripcion_1);
            ps.setString(3, imagen_2);
            ps.setString(4, descripcion_2);
            ps.setString(5, imagen_3);
            ps.setString(6, descripcion_3);
            ps.setString(7, nombre);
            
             int a = ps.executeUpdate();
            conexion.commit();
            if (a==1) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
    
    
    public LinkedList obtenerNombreHospedajes() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        String sql = "SELECT `nombre` FROM `cielo`.`hospedajes_hospedaje`;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista;

    }
    
    
    public LinkedList ObtenerHospedaje_datos(String hospedaje) {
        Statement ps = null;
        ResultSet rs;
        LinkedList lista = new LinkedList();

        String sql = "SELECT * FROM `cielo`.`hospedajes_hospedaje` WHERE nombre = '"+hospedaje+"';";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.createStatement();
            rs = ps.executeQuery(sql);
            lista.clear();
            while (rs.next()) {
 
                lista.add(rs.getString("descripcion") );
                lista.add(rs.getString("costo") );
                lista.add(rs.getString("telefono") );
                lista.add(rs.getString("direccion") );
                lista.add(rs.getString("imagen") );
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }
    
    public boolean updateHospedajes(String nombre,String descripcion,int costo,String telefono,String direccion,String imagen){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE `cielo`.`hospedajes_hospedaje`SET `descripcion` =?,`costo` =? ,`telefono` =? ,`direccion` = ? ,`imagen` = ? WHERE `nombre` =? ;";
         System.out.println(sql);
        
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1,descripcion);
            ps.setInt(2, costo);
            ps.setString(3, telefono);
            ps.setString(4, direccion);
            ps.setString(5, imagen);
            ps.setString(6, nombre);
             int a = ps.executeUpdate();
            conexion.commit();
            if (a==1) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
    
    
    public LinkedList obtenerNombreRutas() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        String sql = "SELECT * FROM cielo.rutas_ruta;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista;

    }
    
       public LinkedList ObtenerRuta_datos(String ruta) {
        Statement ps = null;
        ResultSet rs;
        LinkedList lista = new LinkedList();

        String sql = "SELECT * FROM `cielo`.`rutas_ruta` WHERE nombre = '" + ruta + "';";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.createStatement();
            rs = ps.executeQuery(sql);
            lista.clear();
            while (rs.next()) {

                lista.add(rs.getString("origen"));
                lista.add(rs.getString("destino"));
                lista.add(rs.getString("tiempo"));
                lista.add(rs.getString("imagen"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }

  public boolean updateRutas(String nombre,String origen,String destino,int tiempo,String imagen){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE `cielo`.`rutas_ruta`SET `origen` =?,`destino` =? ,`tiempo` =? ,`imagen` = ? WHERE `nombre` =? ;";
         System.out.println(sql);
        
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1,origen);
            ps.setString(2, destino);
            ps.setInt(3, tiempo);
            ps.setString(4, imagen);
            ps.setString(5, nombre);
             int a = ps.executeUpdate();
            conexion.commit();
            if (a==1) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
         
       
 public LinkedList obtenerNombreNick() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        String sql = "SELECT * FROM cielo.usuarios_usuario;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("nickname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista;

    }   
       
   public boolean updateUsuarios(String nickname,String password,String email,String nombre,String apellido){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE `cielo`.`usuarios_usuario`SET `password` =?,`email` =? ,`nombre` =? ,`apellido` = ? WHERE `nickname` =? ;";
         System.out.println(sql);
        
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            ps.setString(1,password);
            ps.setString(2, email);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, nickname);
             int a = ps.executeUpdate();
            conexion.commit();
            if (a==1) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }    
       
   public LinkedList ObtenerUsuarios_datos(String usuario) {
        Statement ps = null;
        ResultSet rs;
        LinkedList lista = new LinkedList();

        String sql = "SELECT * FROM `cielo`.`usuarios_usuario` WHERE nickname = '" + usuario + "';";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.createStatement();
            rs = ps.executeQuery(sql);
            lista.clear();
            while (rs.next()) {

                lista.add(rs.getString("password"));
                lista.add(rs.getString("email"));
                lista.add(rs.getString("nombre"));
                lista.add(rs.getString("apellido"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }   
   
   
   public LinkedList obtenerNombreGuias() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        String sql = "SELECT * FROM cielo.guias_guia;";
        try {
            conexion.setAutoCommit(false);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("cedula"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista;

    }
   public void reporteGuia() throws SQLException, JRException{
    JasperReport jasperReport;
     JasperPrint jasperPrint;
     try{
        String  in="/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/Integrador_Java/src/reportes/guia.jasper";
        jasperReport=(JasperReport)JRLoader.loadObject(in);
        jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap() , conexion );
        JasperViewer vw = new JasperViewer(jasperPrint,false);
        vw.setTitle("Reporte de Guia");
        vw.setVisible(true);
        
    }catch (JRException ex){
        System.err.println( "Error iReport: " + ex.getMessage() );
    }
       
   
   }
   
   
}
