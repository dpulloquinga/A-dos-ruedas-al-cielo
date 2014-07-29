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
public class Rutas_WinEDT extends javax.swing.JInternalFrame {

    /**
     * Creates new form Rutas_Win
     */

    String ruta;
    public Rutas_WinEDT() {
        initComponents();
        txt_origen.setText(null);
        txt_destino.setText(null);
        txt_tiempo.setText(null);
        pic_imagen.setIcon(null);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_destino = new javax.swing.JTextField();
        txt_origen = new javax.swing.JTextField();
        txt_tiempo = new javax.swing.JTextField();
        pic_imagen = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Formulario de ingreso de Rutas");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Origen:");

        jLabel4.setText("Destino:");

        jLabel5.setText("Tiempo:");

        pic_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_imagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));
        pic_imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_imagenMouseClicked(evt);
            }
        });

        btn_ingresar.setText("Actualizar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        jButton1.setText("Cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_origen, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txt_nombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ingresar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pic_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ingresar)
                            .addComponent(btn_cancelar)))
                    .addComponent(pic_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
    BaseDatos bd = new  BaseDatos();
       if (bd.updateRutas(txt_nombre.getSelectedItem().toString(), txt_origen.getText(), txt_destino.getText(),Integer.parseInt(txt_tiempo.getText()),ruta)) {
           JOptionPane.showMessageDialog(rootPane,"Ruta Ingresada correctamente");
             txt_origen.setText(null);
        txt_destino.setText(null);
        txt_tiempo.setText(null);
        pic_imagen.setIcon(null);
       }
       else{
            JOptionPane.showMessageDialog(rootPane,"Ha ocurrido un error, intente nuevamente");
         txt_origen.setText(null);
        txt_destino.setText(null);
        txt_tiempo.setText(null);
        pic_imagen.setIcon(null);
       
       }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void pic_imagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_imagenMouseClicked
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
    }//GEN-LAST:event_pic_imagenMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BaseDatos bd = new BaseDatos();
        LinkedList lista;
        lista = new LinkedList();
        lista =  bd.ObtenerRuta_datos(txt_nombre.getSelectedItem().toString());
        if (lista!=null) {
            txt_origen.setText(lista.get(0).toString());
            txt_destino.setText(lista.get(1).toString());
            txt_tiempo.setText(lista.get(2).toString());
            ruta = lista.get(3).toString();
            cargarFotoBandera(ruta);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pic_imagen;
    private javax.swing.JTextField txt_destino;
    private javax.swing.JComboBox txt_nombre;
    private javax.swing.JTextField txt_origen;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables

public final  void asignar(){
    LinkedList lista = new LinkedList();
   
    BaseDatos bd = new BaseDatos();
        lista = bd.obtenerNombreRutas();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Object lista1 : lista) {
            model.addElement(lista1);
        }
        txt_nombre.setModel(model);
    }


public void cargarFotoBandera(String imagen) {
        if (imagen.startsWith("/")) {
            Image preview = Toolkit.getDefaultToolkit().getImage(imagen);
            if (preview != null) {
                pic_imagen.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen.getWidth(), pic_imagen.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen.setIcon(icon);
                
            } else {
                System.out.println("Error");
            }

        } else {
            String ruta2 = "/Users/davidpulloquinga/Documents/Proyectos/Integrador/Integrador/" + imagen;
            System.out.println(ruta2 + "esta por este lado");
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta2);
            if (preview != null) {
                pic_imagen.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(pic_imagen.getWidth(), pic_imagen.getHeight(), Image.SCALE_DEFAULT));
                pic_imagen.setIcon(icon);
                
            }
        }

    }


}