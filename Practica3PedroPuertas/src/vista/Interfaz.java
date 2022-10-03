/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Lista;
import controlador.Nodo;
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

        numeroField = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        propietarioLabel = new javax.swing.JLabel();
        fechaField = new javax.swing.JTextField();
        saldoField = new javax.swing.JTextField();
        propietarioField = new javax.swing.JTextField();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numeroField.setText("" + actual.getNumero());
        numeroField.setEnabled(false);

        labelNumero.setText("Número:");

        fechaLabel.setText("Fecha:");

        saldoLabel.setText("Saldo:");

        propietarioLabel.setText("Propietario:");

        fechaField.setText("" + actual.getFecha().toInstant());
        fechaField.setEnabled(false);

        saldoField.setText("" + actual.getSaldo() + " €");
        saldoField.setEnabled(false);

        propietarioField.setText("" + actual.getPropietario());
        propietarioField.setEnabled(false);

        botonAnterior.setEnabled(false);
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

        botonAceptar.setVisible(false);
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setVisible(false);
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(propietarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroField)
                            .addComponent(propietarioField)
                            .addComponent(saldoField)
                            .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonNuevo)
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCancelar)
                            .addComponent(botonSiguiente))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel)
                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoLabel)
                    .addComponent(saldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propietarioLabel)
                    .addComponent(propietarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAnterior)
                        .addComponent(botonSiguiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void iniciarLista(){
        listado = new Lista<Cuenta>();
        
        listado.insertar(new Cuenta());
        listado.insertar(new Cuenta(contador++, new GregorianCalendar(), 2300, "Alberto García"));
        listado.insertar(new Cuenta(contador++, new GregorianCalendar(), 21130, "Roberto Brasero"));
        
        aux = listado.getInicio();
        
        actual = (Cuenta) aux.getDato();
    }
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        
        botonSiguiente.setVisible(true);
        botonAnterior.setVisible(true);
        botonNuevo.setVisible(true);
        botonCancelar.setVisible(false);
        botonAceptar.setVisible(false);
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

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        // TODO add your handling code here:
        
        botonAnterior.setVisible(false);
        botonSiguiente.setVisible(false);
        botonNuevo.setVisible(false);
        botonAceptar.setVisible(true);
        botonCancelar.setVisible(true);
        
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
    private javax.swing.JLabel labelNumero;
    private javax.swing.JTextField numeroField;
    private javax.swing.JTextField propietarioField;
    private javax.swing.JLabel propietarioLabel;
    private javax.swing.JTextField saldoField;
    private javax.swing.JLabel saldoLabel;
    // End of variables declaration//GEN-END:variables
}