/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab8ex1;

/**
 *
 * @author Faith
 */
import javax.swing.*;
import java.awt.*;

public class backgroundColors extends javax.swing.JFrame {

    /**
     * Creates new form backgroundColors
     */
    public backgroundColors() {
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

        radioRed = new javax.swing.JRadioButton();
        radioYellow = new javax.swing.JRadioButton();
        radioWhite = new javax.swing.JRadioButton();
        radioGray = new javax.swing.JRadioButton();
        radioGreen = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioRed.setText("Red");
        radioRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRedActionPerformed(evt);
            }
        });

        radioYellow.setText("Yellow");
        radioYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioYellowActionPerformed(evt);
            }
        });

        radioWhite.setText("White");
        radioWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioWhiteActionPerformed(evt);
            }
        });

        radioGray.setText("Gray");
        radioGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGrayActionPerformed(evt);
            }
        });

        radioGreen.setText("Green");
        radioGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioGreen)
                    .addComponent(radioYellow)
                    .addComponent(radioRed)
                    .addComponent(radioWhite)
                    .addComponent(radioGray))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(radioRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioYellow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioWhite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioGray)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioGreen)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRedActionPerformed
        this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_radioRedActionPerformed

    private void radioYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioYellowActionPerformed
        this.getContentPane().setBackground(Color.yellow);
    }//GEN-LAST:event_radioYellowActionPerformed

    private void radioWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioWhiteActionPerformed
        this.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_radioWhiteActionPerformed

    private void radioGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGrayActionPerformed
        this.getContentPane().setBackground(Color.gray);
    }//GEN-LAST:event_radioGrayActionPerformed

    private void radioGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGreenActionPerformed
        this.getContentPane().setBackground(Color.green);
    }//GEN-LAST:event_radioGreenActionPerformed

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
            java.util.logging.Logger.getLogger(backgroundColors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(backgroundColors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(backgroundColors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(backgroundColors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new backgroundColors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton radioGray;
    private javax.swing.JRadioButton radioGreen;
    private javax.swing.JRadioButton radioRed;
    private javax.swing.JRadioButton radioWhite;
    private javax.swing.JRadioButton radioYellow;
    // End of variables declaration//GEN-END:variables
}
