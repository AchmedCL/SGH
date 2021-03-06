/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.Cama;

import VentanaBoolean.VentanaFail;
import VentanaBoolean.VentanaSucess;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import principal.*;

public class VentanaAgregarCama extends javax.swing.JFrame {

    private Hospital hospi;
    private Secundaria sec;
    
    public VentanaAgregarCama() {
        initComponents();
        sec= new Secundaria();
    }

    VentanaAgregarCama(ActionEvent evt, Hospital hospi) {
        initComponents();
        setHospital(hospi);
        sec= new Secundaria();
    }
    
    public void setHospital(Hospital hospi){
        this.hospi = hospi;
        sec= new Secundaria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero = new javax.swing.JTextField();
        Numero = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        numeroSala = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        Codigo1 = new javax.swing.JLabel();
        Sala = new javax.swing.JLabel();
        Codigo3 = new javax.swing.JLabel();
        Codigo4 = new javax.swing.JLabel();
        Codigo5 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        Numero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Numero.setText("Número");

        botonVolver.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        numeroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroSalaActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                botonAgregarInputMethodTextChanged(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        Codigo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Codigo1.setText("Código");

        Sala.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Sala.setText("Numero Sala");

        Codigo3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Codigo3.setText("Especialidad");

        Codigo4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Codigo4.setText("Especialidad");

        Codigo5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Codigo5.setText("Especialidad");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sala))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 30, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Codigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Codigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Codigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        numero.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        
    }//GEN-LAST:event_numeroActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        final VentanaMenuCama vr ;
        vr = new VentanaMenuCama(evt,hospi);
        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    vr.setVisible(true);
                    vr.setLocationRelativeTo(null);
                    VentanaAgregarCama.this.dispose();
                } catch (final Exception excep) {
                    System.exit(0);
                }
            }
        });
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        if(sec.validarNumeros(this.numero.getText())==true)
        {
             int numeroCama = Integer.parseInt(this.numero.getText());
             
            if(sec.validarNumeros(this.numeroSala.getText())==true)
            {
                int sala = Integer.parseInt(this.numeroSala.getText());
                
                if(this.codigo.getText().equals("")==false)
                {
                    String codigoVerificador = this.codigo.getText();
                    
                    if(this.especialidad.getText().equals("")==false)
                    {
                        String especialidad = this.especialidad.getText();
                        
                        if(hospi.agregarCama(sala,numeroCama,codigoVerificador,null,especialidad)==true)
                        {
                            VentanaSucess ok = new VentanaSucess(evt,hospi);
                            try{
                                ok.setVisible(true);
                                ok.setLocationRelativeTo(null);
                                VentanaAgregarCama.this.dispose();
                            }catch (final Exception excep) {
                                System.exit(0);
                            }
                        } else {
                            VentanaFail ok = new VentanaFail(evt,hospi);
                            try{
                                ok.setVisible(true);
                                ok.setLocationRelativeTo(null);
                                VentanaAgregarCama.this.dispose();
                            }catch (final Exception excep) {
                                System.exit(0);
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "La especialidad de la cama ingresada no es valida");
                        int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente la especialidad?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(valor==JOptionPane.NO_OPTION)
                        {
                        VentanaFail ok = new VentanaFail(evt,hospi);
                        ok.setVisible(true);
                        ok.setLocationRelativeTo(null);
                        Ventanas.Cama.VentanaAgregarCama.this.dispose();
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El codigo de la cama ingresado no es valido");
                    int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el codigo?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(valor==JOptionPane.NO_OPTION)
                    {
                    VentanaFail ok = new VentanaFail(evt,hospi);
                    ok.setVisible(true);
                    ok.setLocationRelativeTo(null);
                    Ventanas.Cama.VentanaAgregarCama.this.dispose();
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El numero de la sala ingresado no es valido");
                int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el numero?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(valor==JOptionPane.NO_OPTION)
                {
                    VentanaFail ok = new VentanaFail(evt,hospi);
                    ok.setVisible(true);
                    ok.setLocationRelativeTo(null);
                    Ventanas.Cama.VentanaAgregarCama.this.dispose();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero de la cama no es valido");
                int valor=JOptionPane.showConfirmDialog(this,"¿Desea ingresar nuevamente el numero?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(valor==JOptionPane.NO_OPTION)
                {
                    VentanaFail ok = new VentanaFail(evt,hospi);
                    ok.setVisible(true);
                    ok.setLocationRelativeTo(null);
                    Ventanas.Cama.VentanaAgregarCama.this.dispose();
                }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void numeroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSalaActionPerformed
       
    }//GEN-LAST:event_numeroSalaActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
 
    }//GEN-LAST:event_codigoActionPerformed

    private void botonAgregarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_botonAgregarInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarInputMethodTextChanged

    private void especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenuCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaAgregarCama().setVisible(true);
            }
        });
    }
    /*public void cerrarAplicacion()
    {
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
               public void windowClosing(WindowEvent e){
                   confirmarSalida();
               }
            });
            this.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //confirmar salida
    public void confirmarSalida()
    {
        int valor=JOptionPane.showConfirmDialog(this,"¿Está seguro de querer cerrar esta aplicacion?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(valor==JOptionPane.YES_OPTION)
           {
                JOptionPane.showMessageDialog(null,"Gracias por su visita, Hasta pronto","Gracias",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
           }
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo1;
    private javax.swing.JLabel Codigo3;
    private javax.swing.JLabel Codigo4;
    private javax.swing.JLabel Codigo5;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Sala;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField especialidad;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField numeroSala;
    // End of variables declaration//GEN-END:variables
}
