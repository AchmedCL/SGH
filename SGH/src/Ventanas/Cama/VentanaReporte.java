
package Ventanas.Cama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import principal.*;


public class VentanaReporte extends javax.swing.JFrame {

    private Hospital hospi;
    private Cama cama; 
    
    public VentanaReporte() {
        initComponents();

    }
    
    public VentanaReporte(ActionEvent evt, Hospital hospi, Cama cama) {
        initComponents();
        setHospital(hospi);
        setCama(cama);
        mostrar(evt);
    }
    
    public void setHospital(Hospital hospi){
        this.hospi = hospi;
    }
    
    public void setCama(Cama cama){
        this.cama = cama;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Número = new javax.swing.JLabel();
        Código = new javax.swing.JLabel();
        Especialidad = new javax.swing.JLabel();
        CamaDisponible = new javax.swing.JLabel();
        Paciente = new javax.swing.JLabel();
        botonMostrar = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();
        disponibilidad = new javax.swing.JTextField();
        paciente = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Número.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Número.setText("Número cama");

        Código.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Código.setText("Código cama");

        Especialidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Especialidad.setText("Especialidad");

        CamaDisponible.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CamaDisponible.setText("Cama disponible");

        Paciente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Paciente.setText("RUN paciente");

        botonMostrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonMostrar.setText("Mostrar");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        numero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        codigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        especialidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        disponibilidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        paciente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Número)
                            .addComponent(Código)
                            .addComponent(Especialidad)
                            .addComponent(CamaDisponible)
                            .addComponent(Paciente))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numero)
                            .addComponent(codigo)
                            .addComponent(especialidad)
                            .addComponent(disponibilidad)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Número, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(Código, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(especialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(Especialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(disponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(CamaDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(botonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        mostrar(evt);
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        final VentanaMenuCama vr ;
        vr = new VentanaMenuCama(evt,hospi);
        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    vr.setVisible(true);
                    vr.setLocationRelativeTo(null);
                    VentanaReporte.this.dispose();
                } catch (final Exception excep) {
                    System.exit(0);
                } 
            }
        });
    }//GEN-LAST:event_botonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaReporte().setVisible(true);
                
            }
            
        });
    }
    public void mostrar(java.awt.event.ActionEvent evt)
    {
        this.numero.setText(Integer.toString(cama.getNumeroCama()));
        this.codigo.setText(cama.getCodigoCama());
        this.especialidad.setText(cama.getEspecialidad());
        if(cama.getCamaDisponible()==true){
            this.disponibilidad.setText("Sí");
            this.paciente.setText("No existe");
        } else{
            this.disponibilidad.setText("No");
            this.paciente.setText(cama.getRutPaciente());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CamaDisponible;
    private javax.swing.JLabel Código;
    private javax.swing.JLabel Especialidad;
    private javax.swing.JLabel Número;
    private javax.swing.JLabel Paciente;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField disponibilidad;
    private javax.swing.JTextField especialidad;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField paciente;
    // End of variables declaration//GEN-END:variables
}
