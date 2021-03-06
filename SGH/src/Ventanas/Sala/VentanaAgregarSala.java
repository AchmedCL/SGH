
package Ventanas.Sala;

import VentanaBoolean.VentanaFail;
import VentanaBoolean.VentanaSucess;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import principal.*;

public class VentanaAgregarSala extends javax.swing.JFrame {
    
    private Hospital hospi;
    private Secundaria sec;

    public VentanaAgregarSala() {
        initComponents();
        sec = new Secundaria();
    }

    VentanaAgregarSala(ActionEvent evt, Hospital hospi) {
        initComponents();
        setHospital(hospi);
        sec = new Secundaria();
    }
    
    public void setHospital(Hospital hospi){
        this.hospi = hospi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        Capacidad = new javax.swing.JLabel();
        Especialidad = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        capacidad = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        Piso = new javax.swing.JLabel();
        piso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre.setText("Nombre");

        Codigo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Codigo.setText("Código");

        Capacidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Capacidad.setText("Capacidad");

        Especialidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Especialidad.setText("Especialidad");

        botonVolver.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        Piso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Piso.setText("Piso");

        piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Piso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Capacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addComponent(Especialidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(codigo)
                            .addComponent(capacidad)
                            .addComponent(especialidad))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(piso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Piso, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(piso, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        nombre.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
    }//GEN-LAST:event_nombreActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        final VentanaMenuSala vr ;
        vr = new VentanaMenuSala(evt,hospi);
        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    vr.setVisible(true);
                    vr.setLocationRelativeTo(null);
                    VentanaAgregarSala.this.dispose();
                } catch (final Exception excep) {
                    System.exit(0);
                } 
            }
        });
    }//GEN-LAST:event_botonVolverActionPerformed

    private void especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadActionPerformed

    private void pisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisoActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        if(this.nombre.getText().equals("")==false)
        {
            String nombreSala = this.nombre.getText();
            
            if(this.especialidad.getText().equals("")==false)
            {
                String sector=this.especialidad.getText();
                
                if(this.codigo.getText().equals("")==false)
                {
                    int numero = Integer.parseInt(this.codigo.getText());

                    if(sec.validarNumeros(this.capacidad.getText())==true)
                    {
                        int capacidadMaxima = Integer.parseInt(this.capacidad.getText());

                        if(sec.validarNumeros(this.piso.getText())==true)
                        {
                            int nivel = Integer.parseInt(this.piso.getText());

                            if(hospi.agregarSala(nombreSala,capacidadMaxima,numero,null,sector,nivel)==true){
                                VentanaSucess ok = new VentanaSucess(evt,hospi);
                                try{
                                    ok.setVisible(true);
                                    ok.setLocationRelativeTo(null);
                                    VentanaAgregarSala.this.dispose();
                                }catch (final Exception excep) {
                                    System.exit(0);
                                }
                            } else {
                                VentanaFail ok = new VentanaFail(evt,hospi);
                                try{
                                    ok.setVisible(true);
                                    ok.setLocationRelativeTo(null);
                                    VentanaAgregarSala.this.dispose();
                                }catch (final Exception excep) {
                                    System.exit(0);
                                }
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "El piso en el cual se encuentra sala ingresado es incorrecto");
                            int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el piso?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                            if(valor==JOptionPane.NO_OPTION)
                            {
                                VentanaFail ok = new VentanaFail(evt,hospi);
                                ok.setVisible(true);
                                ok.setLocationRelativeTo(null);
                                VentanaAgregarSala.this.dispose();
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "La capacidad de la sala ingresada es incorrecta");
                        int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente la cantidad?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(valor==JOptionPane.NO_OPTION)
                        {
                            VentanaFail ok = new VentanaFail(evt,hospi);
                            ok.setVisible(true);
                            ok.setLocationRelativeTo(null);
                            VentanaAgregarSala.this.dispose();
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El codigo de la sala ingresado es incorrecto");
                    int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el codigo?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(valor==JOptionPane.NO_OPTION)
                    {
                        VentanaFail ok = new VentanaFail(evt,hospi);
                        ok.setVisible(true);
                        ok.setLocationRelativeTo(null);
                        VentanaAgregarSala.this.dispose();
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La especialidad de la sala ingresada es incorrecta");
                int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente la especialidad?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(valor==JOptionPane.NO_OPTION)
                {
                    VentanaFail ok = new VentanaFail(evt,hospi);
                    ok.setVisible(true);
                    ok.setLocationRelativeTo(null);
                    VentanaAgregarSala.this.dispose();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El nombre de la sala ingresado es incorrecto");
            int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el nombre?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(valor==JOptionPane.NO_OPTION)
            {
                VentanaFail ok = new VentanaFail(evt,hospi);
                ok.setVisible(true);
                ok.setLocationRelativeTo(null);
                VentanaAgregarSala.this.dispose();
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMenuSala().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Capacidad;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Especialidad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Piso;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField especialidad;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField piso;
    // End of variables declaration//GEN-END:variables
}
