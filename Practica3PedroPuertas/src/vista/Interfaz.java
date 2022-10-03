/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Lista;
import controlador.Nodo;
import java.awt.GridLayout;
import java.util.GregorianCalendar;
import modelo.Cuenta;

/**
 *
 * @author alumno
 */
public class Interfaz extends javax.swing.JFrame {
    
    private Lista <Cuenta> listado;
    private Cuenta actual;
    private Nodo aux;
    private static int contador = 2;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        iniciarLista();
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

        fieldPanel = new javax.swing.JPanel();
        numeroField = new javax.swing.JTextField();
        fechaField = new javax.swing.JTextField();
        saldoField = new javax.swing.JTextField();
        propietarioField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        numeroLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        propietarioLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numeroField.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        numeroField.setEnabled(false);

        fechaField.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        fechaField.setEnabled(false);

        saldoField.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        saldoField.setEnabled(false);

        propietarioField.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        propietarioField.setEnabled(false);

        javax.swing.GroupLayout fieldPanelLayout = new javax.swing.GroupLayout(fieldPanel);
        fieldPanel.setLayout(fieldPanelLayout);
        fieldPanelLayout.setHorizontalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numeroField)
                    .addComponent(fechaField)
                    .addComponent(saldoField)
                    .addComponent(propietarioField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap())
        );
        fieldPanelLayout.setVerticalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propietarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        numeroField.setText("" + actual.getNumero());
        fechaField.setText("" + actual.getFecha().toInstant());
        saldoField.setText("" + actual.getSaldo() + " €");
        propietarioField.setText("" + actual.getPropietario());

        numeroLabel.setText("Número:");

        fechaLabel.setText("Fecha:");

        saldoLabel.setText("Saldo:");

        propietarioLabel.setText("Propietario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propietarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(numeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propietarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botonAnterior.setText("Anterior");
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonAceptar.setText("Aceptar");
        botonAceptar.setEnabled(false);
        botonAceptar.setVisible(false);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.setVisible(false);
        botonCancelar.setEnabled(false);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonNuevo)
                .addGap(133, 133, 133)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAnterior)
                    .addComponent(botonSiguiente)
                    .addComponent(botonNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        // TODO add your handling code here:
        
        if(aux.getSiguiente() == null){
            botonSiguiente.setEnabled(false);
        }else{
            aux = aux.getSiguiente();
            actual = (Cuenta) aux.getDato();
            if(!botonAnterior.isEnabled()){
                botonAnterior.setEnabled(true);
            }else if(aux.getSiguiente() == null){
                botonSiguiente.setEnabled(false);
            }
        }
    
        numeroField.setText("" + actual.getNumero());
        fechaField.setText("" + actual.getFecha().toInstant());
        saldoField.setText("" + actual.getSaldo() + " €");
        propietarioField.setText("" + actual.getPropietario());
        
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        // TODO add your handling code here:
        
        if(aux.getAnterior() == null){
            botonAnterior.setEnabled(false);
        }else{
            aux = aux.getAnterior();
            actual = (Cuenta) aux.getDato();
            if(!botonSiguiente.isEnabled()){
                botonSiguiente.setEnabled(true);
            }else if(aux.getAnterior() == null){
                botonAnterior.setEnabled(false);
            }
        }

        numeroField.setText("" + actual.getNumero());
        fechaField.setText("" + actual.getFecha().toInstant());
        saldoField.setText("" + actual.getSaldo() + " €");
        propietarioField.setText("" + actual.getPropietario());
        
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        // TODO add your handling code here:
        
        botonAnterior.setVisible(false);
        botonSiguiente.setVisible(false);
        botonNuevo.setVisible(false);
        botonAceptar.setVisible(true);
        botonCancelar.setVisible(true);
        botonAceptar.setEnabled(true);
        botonCancelar.setEnabled(true);

        saldoField.setEditable(true);
        propietarioField.setEditable(true);
        saldoField.setEnabled(true);
        propietarioField.setEnabled(true);

        numeroField.setText("");
        fechaField.setText("");
        saldoField.setText("");
        propietarioField.setText(""); 
        
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        
        botonSiguiente.setVisible(true);
        botonAnterior.setVisible(true);
        botonNuevo.setVisible(true);
        botonCancelar.setVisible(false);
        botonAceptar.setVisible(false);
        botonCancelar.setEnabled(false);
        botonAceptar.setEnabled(false);

        botonAnterior.setEnabled(true);
        botonSiguiente.setEnabled(false);

        saldoField.setEditable(false);
        propietarioField.setEditable(false);
        saldoField.setEnabled(false);
        propietarioField.setEnabled(false);

        try {
            double s = Double.parseDouble(saldoField.getText());
            listado.insertar(new Cuenta(contador++, new GregorianCalendar(), s, propietarioField.getText()));

        } catch (NumberFormatException nf) {
            System.out.println(saldoField.getText() + ", no es un número.");
        }

        aux = listado.getFin();

        actual = (Cuenta) aux.getDato();

        numeroField.setText("" + actual.getNumero());
        fechaField.setText("" + actual.getFecha().toInstant());
        saldoField.setText("" + actual.getSaldo() + " €");
        propietarioField.setText("" + actual.getPropietario());
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        
        botonSiguiente.setVisible(true);
        botonAnterior.setVisible(true);
        botonNuevo.setVisible(true);
        botonCancelar.setVisible(false);
        botonAceptar.setVisible(false);
        botonCancelar.setEnabled(false);
        botonAceptar.setEnabled(false);
        saldoField.setEditable(false);
        propietarioField.setEditable(false);
        saldoField.setEnabled(false);
        propietarioField.setEnabled(false);

        if(aux.getSiguiente() == null){
            botonSiguiente.setEnabled(false);
            botonAnterior.setEnabled(true);
        }else if(aux.getAnterior() == null){
            botonAnterior.setEnabled(false);
            botonSiguiente.setEnabled(true);
        }else{
            botonAnterior.setEnabled(true);
            botonSiguiente.setEnabled(true);
        }

        numeroField.setText("" + actual.getNumero());
        fechaField.setText("" + actual.getFecha().toInstant());
        saldoField.setText("" + actual.getSaldo() + " €");
        propietarioField.setText("" + actual.getPropietario());
        
    }//GEN-LAST:event_botonCancelarActionPerformed


    public void iniciarLista(){
        listado = new Lista<Cuenta>();
        
        listado.insertar(new Cuenta());
        listado.insertar(new Cuenta(contador++, new GregorianCalendar(), 2300, "Alberto García"));
        listado.insertar(new Cuenta(contador++, new GregorianCalendar(), 21130, "Roberto Brasero"));
        
        aux = listado.getInicio();
        
        actual = (Cuenta) aux.getDato();
    }
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {     
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField fechaField;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JPanel fieldPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField numeroField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField propietarioField;
    private javax.swing.JLabel propietarioLabel;
    private javax.swing.JTextField saldoField;
    private javax.swing.JLabel saldoLabel;
    // End of variables declaration//GEN-END:variables
}
