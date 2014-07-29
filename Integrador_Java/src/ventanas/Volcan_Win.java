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

/**
 *
 * @author davidpulloquinga
 */
public class Volcan_Win extends javax.swing.JInternalFrame {

    /**
     * Creates new form Volcan_Win
     */
    String ruta;
    BaseDatos baseDatos = new BaseDatos();
    public Volcan_Win() {
        
        initComponents();
        LinkedList lista = new LinkedList();
       lista =  baseDatos.obtenerNombreRutas();
       DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Object lista1 : lista) {
            model.addElement(lista1);
        }
        combo_rutas.setModel(model);
       
        LinkedList lista1 = new LinkedList();
       lista1 =  baseDatos.obtenerNombreRutas();
       model.removeAllElements();
        for (Object lista2 : lista1) {
            model.addElement(lista2);
        }
        combo_rutas.setModel(model);
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
        pic_imagen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_riesg = new javax.swing.JTextField();
        txt_altitud = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_about = new javax.swing.JTextArea();
        btn_cargar = new javax.swing.JButton();
        combo_rutas = new javax.swing.JComboBox();
        combo_ciudad = new javax.swing.JComboBox();
        combo_guias = new javax.swing.JComboBox();
        combo_hospedaje = new javax.swing.JComboBox();
        combo_galerias = new javax.swing.JComboBox();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Formulario para ingreso de Volcanes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 6, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 46, -1, -1));

        jLabel3.setText("Altitud:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 92, -1, -1));

        jLabel4.setText("Riesgo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 138, -1, -1));

        pic_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_imagen.setText("Foto:");
        pic_imagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        getContentPane().add(pic_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 139, 150));

        jLabel6.setText("Descripción:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, -1, -1));

        jLabel7.setText("Rutas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 323, -1, -1));

        jLabel8.setText("Guias:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 365, -1, -1));

        jLabel9.setText("Galerias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 488, -1, -1));

        jLabel10.setText("Hospedaje:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 443, -1, -1));

        jLabel11.setText("Ciudad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 399, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 40, 174, -1));
        getContentPane().add(txt_riesg, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 132, 174, -1));
        getContentPane().add(txt_altitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 86, 174, -1));

        txt_about.setColumns(20);
        txt_about.setRows(5);
        jScrollPane1.setViewportView(txt_about);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 104));

        btn_cargar.setText("Cargar");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        getContentPane().add(combo_rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 250, -1));

        getContentPane().add(combo_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 250, -1));

        getContentPane().add(combo_guias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 250, -1));

        getContentPane().add(combo_hospedaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 250, -1));

        getContentPane().add(combo_galerias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:
        final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
                ruta = elegirImagen.getSelectedFile().getAbsolutePath();
                String nombre = elegirImagen.getSelectedFile().getName();
            System.out.println(ruta);
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta);
            if(preview != null){
                pic_imagen.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen.getWidth(), pic_imagen.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen.setIcon(icon);
            }
        }
      
    }//GEN-LAST:event_btn_cargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargar;
    private javax.swing.JComboBox combo_ciudad;
    private javax.swing.JComboBox combo_galerias;
    private javax.swing.JComboBox combo_guias;
    private javax.swing.JComboBox combo_hospedaje;
    private javax.swing.JComboBox combo_rutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pic_imagen;
    private javax.swing.JTextArea txt_about;
    private javax.swing.JTextField txt_altitud;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_riesg;
    // End of variables declaration//GEN-END:variables
}
