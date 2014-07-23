/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
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
        String sql = "SELECT * FROM `cielo`.`guias_guia`where `cedula`=" + cedula + ";";
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

                vuelta = nombre + split + apellido + split + fecha + split + cedul + split + genero + split + antiguedad + split + email + split + telefono + split + foto + split + descripcion;
               
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
}
