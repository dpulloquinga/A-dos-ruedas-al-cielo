/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanas;

import java.awt.Component;

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
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
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
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

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

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 610));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Reporte de Guias");
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
        menuCiudad.add(jMenuItem5);

        menuBar.add(menuCiudad);

        jMenu1.setText("Galerias");

        jMenuItem6.setText("Agregar");
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
        jMenu2.add(jMenuItem9);

        menuBar.add(jMenu2);

        jMenu3.setText("Rutas");

        jMenuItem10.setText("Agregar");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Actualizar");
        jMenu3.add(jMenuItem11);

        menuBar.add(jMenu3);

        jMenu4.setText("Usuarios");

        jMenuItem12.setText("Agregar");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Actualizar");
        jMenu4.add(jMenuItem13);

        menuBar.add(jMenu4);

        jMenu5.setText("Busqueda");

        jMenuItem14.setText("Guias");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Ciudades");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Galerias");
        jMenu5.add(jMenuItem16);

        jMenuItem19.setText("Hospedajes");
        jMenu5.add(jMenuItem19);

        jMenuItem17.setText("Rutas");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Volcanes");
        jMenu5.add(jMenuItem18);

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
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        Ciudad_Win ciudad = new Ciudad_Win();
        Component add = desktopPane.add(ciudad);
       ciudad.setVisible(true);
       
    }//GEN-LAST:event_contentMenuItemActionPerformed

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
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
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
