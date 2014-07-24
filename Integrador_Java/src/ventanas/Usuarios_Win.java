/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanas;

import conexion.BaseDatos;
import javax.swing.JOptionPane;

/**
 *
 * @author davidpulloquinga
 */
public class Usuarios_Win extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios_Win
     */
    private static final String HOST="localhost";
    private static final String USER="root";
    private static final String PASS="";
    public Usuarios_Win() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nick = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Formulario para ingreso de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 6, -1, -1));

        jLabel2.setText("Nickname:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 46, -1, -1));

        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 92, -1, -1));

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 138, -1, -1));

        jLabel5.setText("Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 228, -1, -1));

        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 182, -1, -1));
        getContentPane().add(txt_nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 40, 161, -1));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 86, 161, -1));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 132, 161, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 176, 161, -1));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 222, 161, -1));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 64, -1, -1));

        btn_cancelar.setText("Cancelar");
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 101, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                BaseDatos bd = new BaseDatos(HOST,USER,PASS);
                if (bd.addUser(txt_nick.getText(), txt_pass.getText(), txt_email.getText(),txt_nombre.getText(), txt_apellido.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Usuario Ingresada conrrectamente");
                }
                else
                    JOptionPane.showMessageDialog(rootPane,"Se ha producido un error");
            }
        };
        runnable.run();
    }//GEN-LAST:event_btn_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nick;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pass;
    // End of variables declaration//GEN-END:variables
}
