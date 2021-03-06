/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanas;

import conexion.BaseDatos;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author davidpulloquinga
 */
public final class Galerias_WinEDT extends javax.swing.JInternalFrame {

    /**
     * Creates new form Galerias_Win
     */
    String ruta1,ruta2,ruta3;
    public Galerias_WinEDT() {
        initComponents();
        asignar();
        this.btn_ingresar.setEnabled(false);
        pic_imagen1.setEnabled(false);
        pic_imagen2.setEnabled(false); 
        pic_imagen3.setEnabled(false);
        txt_about1.setEnabled(false);
        txt_about2.setEnabled(false);
        txt_about3.setEnabled(false);
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
        pic_imagen3 = new javax.swing.JLabel();
        pic_imagen1 = new javax.swing.JLabel();
        pic_imagen2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_about1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_about3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_about2 = new javax.swing.JTextArea();
        btn_ingresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_galeria = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(595, 595));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Formulario de ingreso de Galerias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        pic_imagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_imagen3.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen 3"));
        pic_imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_imagen3MouseClicked(evt);
            }
        });
        getContentPane().add(pic_imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 240, 130));

        pic_imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_imagen1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen 1"));
        pic_imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_imagen1MouseClicked(evt);
            }
        });
        getContentPane().add(pic_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 130));

        pic_imagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_imagen2.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen 2"));
        pic_imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_imagen2MouseClicked(evt);
            }
        });
        getContentPane().add(pic_imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 240, 130));

        txt_about1.setColumns(20);
        txt_about1.setLineWrap(true);
        txt_about1.setRows(5);
        jScrollPane4.setViewportView(txt_about1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 270, 120));

        txt_about3.setColumns(20);
        txt_about3.setLineWrap(true);
        txt_about3.setRows(5);
        jScrollPane5.setViewportView(txt_about3);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 270, 120));

        txt_about2.setColumns(20);
        txt_about2.setLineWrap(true);
        txt_about2.setRows(5);
        jScrollPane6.setViewportView(txt_about2);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 270, 120));

        btn_ingresar.setText("Actualizar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        jLabel2.setText("Nombre de la Galeria:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        cb_galeria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(cb_galeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 190, -1));

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
     BaseDatos bd = new BaseDatos();
       if (bd.updateGalerias(cb_galeria.getSelectedItem().toString(),ruta1,txt_about1.getText(),ruta2,txt_about2.getText(),ruta3,txt_about3.getText())) {
          JOptionPane.showMessageDialog(rootPane,"Galeria actualizada correctamente: "+cb_galeria.getSelectedItem().toString());
            txt_about1.setText(null);
            txt_about2.setText(null);
            txt_about3.setText(null);
           
            pic_imagen1.setIcon(null);
            pic_imagen2.setIcon(null);
            pic_imagen3.setIcon(null);
            this.btn_ingresar.setEnabled(false);
        pic_imagen1.setEnabled(false);
        pic_imagen2.setEnabled(false); 
        pic_imagen3.setEnabled(false);
        txt_about1.setEnabled(false);
        txt_about2.setEnabled(false);
        txt_about3.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Se ha producido un error");
            txt_about1.setText(null);
            txt_about2.setText(null);
            txt_about3.setText(null);
           
            pic_imagen1.setIcon(null);
            pic_imagen2.setIcon(null);
            pic_imagen3.setIcon(null);
            this.btn_ingresar.setEnabled(false);
        pic_imagen1.setEnabled(false);
        pic_imagen2.setEnabled(false); 
        pic_imagen3.setEnabled(false);
        txt_about1.setEnabled(false);
        txt_about2.setEnabled(false);
        txt_about3.setEnabled(false);
       
       }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void pic_imagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_imagen1MouseClicked
        // TODO add your handling code here:
        final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
             ruta1 = elegirImagen.getSelectedFile().getAbsolutePath();
            String nombre = elegirImagen.getSelectedFile().getName();
            System.out.println(ruta1);
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta1);
            if(preview != null){
                pic_imagen1.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen1.getWidth(), pic_imagen1.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen1.setIcon(icon);
            }
        }
    }//GEN-LAST:event_pic_imagen1MouseClicked

    private void pic_imagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_imagen2MouseClicked
        // TODO add your handling code here:
        final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
            ruta2 = elegirImagen.getSelectedFile().getAbsolutePath();
            String nombre = elegirImagen.getSelectedFile().getName();
            System.out.println(ruta2);
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta2);
            if(preview != null){
                pic_imagen2.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen2.getWidth(), pic_imagen2.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen2.setIcon(icon);
            }
        }
    }//GEN-LAST:event_pic_imagen2MouseClicked

    private void pic_imagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_imagen3MouseClicked
        // TODO add your handling code here:
        final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
             ruta3 = elegirImagen.getSelectedFile().getAbsolutePath();
            String nombre = elegirImagen.getSelectedFile().getName();
            System.out.println(ruta3);
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta3);
            if(preview != null){
                pic_imagen3.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen3.getWidth(), pic_imagen3.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen3.setIcon(icon);
            }
        }
    }//GEN-LAST:event_pic_imagen3MouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         BaseDatos bd = new BaseDatos();
        LinkedList lista;
        lista = new LinkedList();
        lista =  bd.ObtenerGaleria_datos(cb_galeria.getSelectedItem().toString());
        if (lista!=null) {
           ruta1= lista.get(0).toString();
           ruta2= lista.get(2).toString();
          ruta3= lista.get(4).toString();
           txt_about1.setText(lista.get(1).toString());
            
           txt_about2.setText(lista.get(3).toString());
           txt_about3.setText( lista.get(5).toString());
            cargarImagen1(ruta1);
            cargarImagen2(ruta2);
            cargarImagen3(ruta3);
            this.btn_ingresar.setEnabled(false);
        pic_imagen1.setEnabled(true);
        pic_imagen2.setEnabled(true); 
        pic_imagen3.setEnabled(true);
        txt_about1.setEnabled(true);
        txt_about2.setEnabled(true);
        txt_about3.setEnabled(true);
        btn_ingresar.setEnabled(true);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JComboBox cb_galeria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel pic_imagen1;
    private javax.swing.JLabel pic_imagen2;
    private javax.swing.JLabel pic_imagen3;
    private javax.swing.JTextArea txt_about1;
    private javax.swing.JTextArea txt_about2;
    private javax.swing.JTextArea txt_about3;
    // End of variables declaration//GEN-END:variables

    public  void asignar(){
    LinkedList lista = new LinkedList();
   
    BaseDatos bd = new BaseDatos();
        lista = bd.obtenerNombreGalerias();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Object lista1 : lista) {
            model.addElement(lista1);
        }
        cb_galeria.setModel(model);
    }
    public void cargarImagen1(String imagen){
        if (imagen.startsWith("/")) {
            Image preview = Toolkit.getDefaultToolkit().getImage(imagen);
            if (preview != null) {
                pic_imagen1.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen1.getWidth(), pic_imagen1.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen1.setIcon(icon);
                btn_ingresar.setEnabled(true);
            } else {
                System.out.println("Error");
            }

        } else {
            String rutados = "/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/" + imagen;
            System.out.println(rutados + "esta por este lado");
            Image preview = Toolkit.getDefaultToolkit().getImage(rutados);
            if (preview != null) {
                pic_imagen1.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen1.getWidth(), pic_imagen1.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen1.setIcon(icon);
                btn_ingresar.setEnabled(true);
            }
        }
    
    }
    
     public void cargarImagen2(String imagen){
        if (imagen.startsWith("/")) {
            Image preview = Toolkit.getDefaultToolkit().getImage(imagen);
            if (preview != null) {
                pic_imagen2.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen2.getWidth(), pic_imagen2.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen2.setIcon(icon);
                btn_ingresar.setEnabled(true);
            } else {
                System.out.println("Error");
            }

        } else {
            String rutados = "/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/" + imagen;
            System.out.println(rutados + "esta por este lado");
            Image preview = Toolkit.getDefaultToolkit().getImage(rutados);
            if (preview != null) {
                pic_imagen2.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen2.getWidth(), pic_imagen2.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen2.setIcon(icon);
                btn_ingresar.setEnabled(true);
            }
        }
    
    }
      public void cargarImagen3(String imagen){
        if (imagen.startsWith("/")) {
            Image preview = Toolkit.getDefaultToolkit().getImage(imagen);
            if (preview != null) {
                pic_imagen3.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen3.getWidth(), pic_imagen3.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen3.setIcon(icon);
                btn_ingresar.setEnabled(true);
            } else {
                System.out.println("Error");
            }

        } else {
            String rutados = "/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/" + imagen;
            System.out.println(rutados + "esta por este lado");
            Image preview = Toolkit.getDefaultToolkit().getImage(rutados);
            if (preview != null) {
                pic_imagen3.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen3.getWidth(), pic_imagen3.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen3.setIcon(icon);
                btn_ingresar.setEnabled(true);
            }
        }
    
    }

}
