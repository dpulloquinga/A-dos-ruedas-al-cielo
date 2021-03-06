/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanas;

import conexion.BaseDatos;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author davidpulloquinga
 */
public class Main_Win extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
   

    
    public Main_Win() {
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

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        volcanes = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuGuia = new javax.swing.JMenu();
        updateGuia = new javax.swing.JMenuItem();
        addGuia = new javax.swing.JMenuItem();
        menuCiudad = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficas/Logo.png"))); // NOI18N
        jLabel1.setSize(new java.awt.Dimension(310, 85));
        desktopPane.add(jLabel1);
        jLabel1.setBounds(520, 510, 310, 85);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficas/logo_eucador_love.png"))); // NOI18N
        jLabel2.setSize(new java.awt.Dimension(76, 108));
        desktopPane.add(jLabel2);
        jLabel2.setBounds(750, 10, 76, 108);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficas/LOGO-PRINCIPAL7.png"))); // NOI18N
        desktopPane.add(jLabel3);
        jLabel3.setBounds(70, 150, 680, 210);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 610));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Reporte de Guias");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        jMenuItem1.setText("Reporte de Ciudades");
        fileMenu.add(jMenuItem1);

        jMenuItem2.setText("Reporte de Hospedajes");
        fileMenu.add(jMenuItem2);

        jMenuItem3.setText("Repore de Rutas");
        fileMenu.add(jMenuItem3);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        volcanes.setText("Volcanes");

        jMenuItem4.setText("Añadir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        volcanes.add(jMenuItem4);

        menuBar.add(volcanes);

        menuGuia.setMnemonic('e');
        menuGuia.setText("Guias");

        updateGuia.setMnemonic('t');
        updateGuia.setText("Añadir");
        updateGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGuiaActionPerformed(evt);
            }
        });
        menuGuia.add(updateGuia);

        addGuia.setText("Actualizar");
        addGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGuiaActionPerformed(evt);
            }
        });
        menuGuia.add(addGuia);

        menuBar.add(menuGuia);

        menuCiudad.setMnemonic('h');
        menuCiudad.setText("Ciudades");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Añadir");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        menuCiudad.add(contentMenuItem);

        jMenuItem5.setText("Actualizar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuCiudad.add(jMenuItem5);

        menuBar.add(menuCiudad);

        jMenu1.setText("Galerias");

        jMenuItem6.setText("Agregar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Actualizar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        menuBar.add(jMenu1);

        jMenu2.setText("Hospedajes");

        jMenuItem8.setText("Agregar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Actualizar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        menuBar.add(jMenu2);

        jMenu3.setText("Rutas");

        jMenuItem10.setText("Agregar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Actualizar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        menuBar.add(jMenu3);

        jMenu4.setText("Usuarios");

        jMenuItem12.setText("Agregar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Actualizar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        menuBar.add(jMenu4);

        jMenu5.setText("Busqueda");
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void updateGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGuiaActionPerformed
        // TODO add your handling code here:
         Guias_Win guias = new Guias_Win();
        desktopPane.add(guias);
        guias.setVisible(true);
    }//GEN-LAST:event_updateGuiaActionPerformed

    private void addGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGuiaActionPerformed
        // TODO add your handling code here:
        Guias_WinEDT guias_WinEDT = new Guias_WinEDT();
        desktopPane.add(guias_WinEDT);
        guias_WinEDT.setVisible(true);
    }//GEN-LAST:event_addGuiaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Galerias_WinEDT dT = new Galerias_WinEDT();
        desktopPane.add(dT);
        dT.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Hospedajes_Win hospedajes = new Hospedajes_Win();
        desktopPane.add(hospedajes);
        hospedajes.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        Ciudad_Win ciudad = new Ciudad_Win();
        Component add = desktopPane.add(ciudad);
       ciudad.setVisible(true);
       
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Galerias_Win galeria = new Galerias_Win();
        desktopPane.add(galeria);
        galeria.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Rutas_Win rutas = new Rutas_Win();
        desktopPane.add(rutas);
        rutas.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Usuarios_Win usuario = new Usuarios_Win();
        desktopPane.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Ciudad_WinEDT winEDT = new Ciudad_WinEDT();
        desktopPane.add(winEDT);
        winEDT.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Hospedajes_WinEDT dT = new Hospedajes_WinEDT();
        desktopPane.add(dT);
        dT.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
       Rutas_WinEDT  dT = new Rutas_WinEDT();
       desktopPane.add(dT);
       dT.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Usuarios_WinEDT uwedt = new Usuarios_WinEDT();
        desktopPane.add(uwedt);
        uwedt.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Volcan_Win volcan_Win = new Volcan_Win();
        desktopPane.add(volcan_Win);
        volcan_Win.setVisible(true);
               
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        try {
            // TODO add your handling code here:
            BaseDatos baseDatos = new BaseDatos();
            baseDatos.reporteGuia();
        } catch (SQLException | JRException ex) {
            Logger.getLogger(Main_Win.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_openMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addGuia;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCiudad;
    private javax.swing.JMenu menuGuia;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem updateGuia;
    private javax.swing.JMenu volcanes;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new Main_Win().setVisible(true);
        }
    }

}
