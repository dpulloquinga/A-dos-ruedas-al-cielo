/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanas;

import conexion.BaseDatos;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author davidpulloquinga
 */
public final class Ciudad_WinEDT extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ciudad_Win
     */
       String bandera=null, imagen=null;
       String pathBandera,pathCiudad;
    String rutacity,ruta,nombre;
    String nombre1,nombre2;
    public Ciudad_WinEDT() {
        initComponents();
        txt_descripcion.setEnabled(false);
        txt_poblacion.setEnabled(false);
        btn_carbar_flag.setEnabled(false);
        btn_cargar_city.setEnabled(false);
        btn_ingresar.setEnabled(false);
        
        asignar();
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
        pic_bandera = new javax.swing.JLabel();
        pic_ciudad = new javax.swing.JLabel();
        txt_poblacion = new javax.swing.JTextField();
        btn_carbar_flag = new javax.swing.JButton();
        btn_cargar_city = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb_nombre = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 46, -1, -1));

        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("Poblacion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        pic_bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_bandera.setBorder(javax.swing.BorderFactory.createTitledBorder("Bandera"));
        getContentPane().add(pic_bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 150));

        pic_ciudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_ciudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudad"));
        getContentPane().add(pic_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 170));
        getContentPane().add(txt_poblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, -1));

        btn_carbar_flag.setText("Cargar");
        btn_carbar_flag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carbar_flagActionPerformed(evt);
            }
        });
        getContentPane().add(btn_carbar_flag, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        btn_cargar_city.setText("Cargar");
        btn_cargar_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargar_cityActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cargar_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel6.setText("Formulario de ingreso de Ciudades");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        cb_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_nombreMouseClicked(evt);
            }
        });
        getContentPane().add(cb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 160, -1));

        jButton1.setText("Cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 250, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_carbar_flagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carbar_flagActionPerformed
        // TODO add your handling code here:
            final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
                ruta = elegirImagen.getSelectedFile().getAbsolutePath();
                nombre1 = elegirImagen.getSelectedFile().getName();
            System.out.println(ruta);
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta);
            if(preview != null){
                pic_bandera.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_bandera.getWidth(), pic_bandera.getHeight(), Image.SCALE_DEFAULT));
                pic_bandera.setIcon(icon);
            }
        }
    }//GEN-LAST:event_btn_carbar_flagActionPerformed

    private void btn_cargar_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargar_cityActionPerformed
        // TODO add your handling code here:
          final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
                rutacity = elegirImagen.getSelectedFile().getAbsolutePath();
               nombre2 = elegirImagen.getSelectedFile().getName();
            System.out.println(rutacity);
            Image preview = Toolkit.getDefaultToolkit().getImage(rutacity);
            if(preview != null){
                pic_ciudad.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_ciudad.getWidth(), pic_ciudad.getHeight(), Image.SCALE_DEFAULT));
                pic_ciudad.setIcon(icon);
            }
        }
    }//GEN-LAST:event_btn_cargar_cityActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
        BaseDatos baseDatos =  new BaseDatos();
        if (baseDatos.updateCiudad(cb_nombre.getSelectedItem().toString(), txt_descripcion.getText(), txt_poblacion.getText(), ruta, rutacity)) {
            JOptionPane.showMessageDialog(rootPane,"Ingreso correcto");
            btn_carbar_flag.setEnabled(false);
            btn_cargar_city.setEnabled(false);
           txt_descripcion.setEnabled(false);
           txt_poblacion.setEnabled(false);
           cb_nombre.setSelectedIndex(0);
           txt_descripcion.setText("");
        txt_poblacion.setText("");
        pic_bandera.setIcon(null);
        pic_ciudad.setIcon(null);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Ingreso Incorrecto, se ha producido un error");
      
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void cb_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_nombreMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_nombreMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         TODO add your handling code here:
     
        BaseDatos bd = new BaseDatos();
        LinkedList lista;
        lista = new LinkedList();
        lista =  bd.ObtenerCiudad_datos(cb_nombre.getSelectedItem().toString());
        if (lista!=null) {
             txt_descripcion.setText(lista.get(1).toString());
            txt_poblacion.setText(lista.get(2).toString());
            bandera= lista.get(3).toString();
            imagen = lista.get(4).toString();
            rutacity = imagen;
            ruta = bandera;
        cargarFotoCiudad();
        cargarFotoBandera();
        btn_cancelar.setEnabled(true);
        btn_carbar_flag.setEnabled(true);
        btn_cargar_city.setEnabled(true);
        btn_ingresar.setEnabled(true);
        txt_descripcion.setEnabled(true);
        txt_poblacion.setEnabled(true);
        
        }
   
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_carbar_flag;
    private javax.swing.JButton btn_cargar_city;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JComboBox cb_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pic_bandera;
    private javax.swing.JLabel pic_ciudad;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_poblacion;
    // End of variables declaration//GEN-END:variables

public  void asignar(){
    LinkedList lista = new LinkedList();
   
    BaseDatos bd = new BaseDatos();
        lista = bd.ObtenerCiudad_nombre();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Object lista1 : lista) {
            model.addElement(lista1);
        }
        cb_nombre.setModel(model);
    }

    public void cargarFotoCiudad() {
        if (imagen.startsWith("/")) {
            Image preview = Toolkit.getDefaultToolkit().getImage(imagen);
            if (preview != null) {
                pic_ciudad.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_ciudad.getWidth(), pic_ciudad.getHeight(), Image.SCALE_DEFAULT));
                pic_ciudad.setIcon(icon);
                btn_cargar_city.setEnabled(true);
            } else {
                System.out.println("Error");
            }

        } else {
            String ruta2 = "/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/" + imagen;
            System.out.println(ruta2 + "esta por este lado");
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta2);
            if (preview != null) {
                pic_ciudad.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_ciudad.getWidth(), pic_ciudad.getHeight(), Image.SCALE_DEFAULT));
                pic_ciudad.setIcon(icon);
                btn_cargar_city.setEnabled(true);
            }
        }

    }
    public void cargarFotoBandera() {
        if (bandera.startsWith("/")) {
            Image preview = Toolkit.getDefaultToolkit().getImage(bandera);
            if (preview != null) {
                pic_bandera.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_bandera.getWidth(), pic_bandera.getHeight(), Image.SCALE_DEFAULT));
                pic_bandera.setIcon(icon);
                btn_carbar_flag.setEnabled(true);
            } else {
                System.out.println("Error");
            }

        } else {
            String ruta2 = "/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/" + bandera;
            System.out.println(ruta2 + "esta por este lado");
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta2);
            if (preview != null) {
                pic_bandera.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_bandera.getWidth(), pic_bandera.getHeight(), Image.SCALE_DEFAULT));
                pic_bandera.setIcon(icon);
                btn_carbar_flag.setEnabled(true);
            }
        }

    }


    public void copiarArchivos(String bandera) {
        try {
            try (FileInputStream fregis = new FileInputStream(bandera); 
                    FileOutputStream fsalida = new FileOutputStream("/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/cargas/ciudades/"+bandera, true)) {
                
                int b = fregis.read();
                while (b != -1) {
                    fsalida.write(b);
                    b = fregis.read();
                    
                }
                fsalida.flush();
            }
        } catch (IOException e) {
        }

    }
}
