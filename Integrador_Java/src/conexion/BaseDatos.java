/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {

    Connection conexion;
    Statement st;
    
    public BaseDatos(String host, String user, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/cielo", user, pass);
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
}
