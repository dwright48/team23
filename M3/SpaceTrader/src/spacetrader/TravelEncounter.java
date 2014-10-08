/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.Timer;
import java.util.Random;


/**
 *
 * @author YaxiongLiu
 */
public class TravelEncounter extends javax.swing.JFrame {

    private int dist;
    Random rand = new Random();
    int encNum;
    boolean stop;
    final int delay = 500;
    Timer timer = new Timer(delay, null);
    ActionListener myal = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dist%3 == 0) {
                    jLabel1.setText("Travelling");
                    jLabel1.repaint();
                }
                //if ((oDist-dist)>20) {
                if (!stop){
                    encNum = rand.nextInt(50);
                    if((encNum >35) && (encNum<38)) {
                        policeEnc.setVisible(true);
                        stop = true;
                        timer.stop();
                    } else if ((encNum>21) && (encNum<25)) {
                        traderEnc.setVisible(true);
                        stop = true;
                        timer.stop();
                    } else if ((encNum>6) && (encNum<9)) {
                        pirateEnc.setVisible(true);
                        stop = true;
                        timer.stop();
                    }
                    jLabel1.setText(jLabel1.getText() + ".");
                    jLabel1.repaint();
                    dist--;
                    jLabel2.setText("Remaining Distance: " + dist);
                    jLabel2.repaint();
                }
                //}

                //System.out.println(dist);
                if (dist < 0) { 
                    timer.stop();
                    dispose();
                }
            }
        };
    /**
     * Creates new form TravelEncounter
     */
    public TravelEncounter() {
        initComponents();
        timer.addActionListener(myal);
        dist = 20;
    }

    public TravelEncounter(double d) {
        initComponents();
        //dist = (int)Math.sqrt(Math.pow(Math.abs(nY-oY),2)+Math.pow(Math.abs(nX-oX),2));
        timer.addActionListener(myal);
        dist = (int)d;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        policeEnc = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        traderEnc = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pirateEnc = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        policeEnc.setMaximumSize(new java.awt.Dimension(400, 300));
        policeEnc.setMinimumSize(new java.awt.Dimension(400, 300));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("A wild police ship appears");

        javax.swing.GroupLayout policeEncLayout = new javax.swing.GroupLayout(policeEnc.getContentPane());
        policeEnc.getContentPane().setLayout(policeEncLayout);
        policeEncLayout.setHorizontalGroup(
            policeEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, policeEncLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(policeEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        policeEncLayout.setVerticalGroup(
            policeEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, policeEncLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        traderEnc.setMaximumSize(new java.awt.Dimension(400, 300));
        traderEnc.setMinimumSize(new java.awt.Dimension(400, 300));
        traderEnc.setPreferredSize(new java.awt.Dimension(400, 300));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Another trader appears and ignores you");

        javax.swing.GroupLayout traderEncLayout = new javax.swing.GroupLayout(traderEnc.getContentPane());
        traderEnc.getContentPane().setLayout(traderEncLayout);
        traderEncLayout.setHorizontalGroup(
            traderEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, traderEncLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(traderEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        traderEncLayout.setVerticalGroup(
            traderEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, traderEncLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pirateEnc.setMaximumSize(new java.awt.Dimension(400, 300));
        pirateEnc.setMinimumSize(new java.awt.Dimension(400, 300));

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("An wild pirate ship appears");

        javax.swing.GroupLayout pirateEncLayout = new javax.swing.GroupLayout(pirateEnc.getContentPane());
        pirateEnc.getContentPane().setLayout(pirateEncLayout);
        pirateEncLayout.setHorizontalGroup(
            pirateEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pirateEncLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(pirateEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        pirateEncLayout.setVerticalGroup(
            pirateEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pirateEncLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Travelling");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Remaining Distance:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(90, 90, 90))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        enc();
        //((Timer)evt.getSource()).stop();
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        policeEnc.dispose();
        enc();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        traderEnc.dispose();
        enc();
        // TODO add your handling code here:    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pirateEnc.dispose();
        enc();
        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TravelEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TravelEncounter nWin = new TravelEncounter();
                nWin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JDialog pirateEnc;
    private javax.swing.JDialog policeEnc;
    private javax.swing.JDialog traderEnc;
    // End of variables declaration//GEN-END:variables
    private void enc() {
        
        stop = false;
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) { }
        timer.restart();
    }
}
