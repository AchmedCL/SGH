
package Ventanas.Enfermero;

import VentanaBoolean.VentanaFail;
import VentanaBoolean.VentanaSucess;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import principal.*;

public class VentanaAgregarEnfermero extends javax.swing.JFrame {
    
    private Hospital hospi;
    private Secundaria sec;
    
    public VentanaAgregarEnfermero() {
        initComponents();
        sec=new Secundaria();
    }

    VentanaAgregarEnfermero(ActionEvent evt, Hospital hospi) {
        initComponents();
        setHospital(hospi);
        sec=new Secundaria();
    }
    
    public void setHospital(Hospital hospi){
        this.hospi = hospi;
        sec=new Secundaria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Run = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        run = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre.setText("Nombre");

        Run.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Run.setText("RUN");

        Sexo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Sexo.setText("Sexo");

        botonVolver.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Run, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(run)
                            .addComponent(sexo))
                        .addGap(92, 92, 92))
                    .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Run, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        nombre.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
    }//GEN-LAST:event_nombreActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        final VentanaMenuEnfermero vr ;
        vr = new VentanaMenuEnfermero(evt,hospi);
        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                vr.setVisible(true);
                vr.setLocationRelativeTo(null);
                VentanaAgregarEnfermero.this.dispose();
                } catch (final Exception excep) {
                    System.exit(0);
                } 
            }
        });
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(this.nombre.getText().equals("")==false)
        {
            String nombre = this.nombre.getText();
            
            if(sec.validarRut(this.run.getText())==true)
            {
                String rut = this.run.getText();
                
                if(this.sexo.getText().equals("")==false)
                {
                    String sexo = this.sexo.getText();
                    
                    if(hospi.agregarEnfermeriaLista(nombre,rut,sexo)==true){
                        VentanaSucess ok = new VentanaSucess(evt,hospi);
                        ok.setVisible(true);
                        ok.setLocationRelativeTo(null);
                        VentanaAgregarEnfermero.this.dispose();
                    } else {
                        VentanaFail ok = new VentanaFail(evt,hospi);
                        ok.setVisible(true);
                        ok.setLocationRelativeTo(null);
                        VentanaAgregarEnfermero.this.dispose();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El sexo del enfermero ingresado no es valido");
                    int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el sexo?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(valor==JOptionPane.NO_OPTION)
                    {
                    VentanaFail ok = new VentanaFail(evt,hospi);
                    ok.setVisible(true);
                    ok.setLocationRelativeTo(null);
                    Ventanas.Enfermero.VentanaAgregarEnfermero.this.dispose();
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El rut del enfermero ingresado no es valido");
                int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el rut?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(valor==JOptionPane.NO_OPTION)
                {
                VentanaFail ok = new VentanaFail(evt,hospi);
                ok.setVisible(true);
                ok.setLocationRelativeTo(null);
                Ventanas.Enfermero.VentanaAgregarEnfermero.this.dispose();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El nombrer del enfermero ingresado no es valido");
            int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el nombre?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(valor==JOptionPane.NO_OPTION)
            {
            VentanaFail ok = new VentanaFail(evt,hospi);
            ok.setVisible(true);
            ok.setLocationRelativeTo(null);
            Ventanas.Enfermero.VentanaAgregarEnfermero.this.dispose();
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenuEnfermero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuEnfermero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuEnfermero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuEnfermero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaAgregarEnfermero().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Run;
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField run;
    private javax.swing.JTextField sexo;
    // End of variables declaration//GEN-END:variables
}
