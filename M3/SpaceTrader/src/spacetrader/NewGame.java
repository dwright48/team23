/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 * JFrame of new game window
 * 
 * @author YaxiongLiu
 */
public class NewGame extends javax.swing.JFrame {
    // variable declariation for the variables used in NewGmae class, also used to create the new Player
    private String nname = ""; // player's name
    private int npilot = 0; // pilot sp (skill points)
    private int nfighter = 0; // fighter sp
    private int ntrader = 0; // trader sp
    private int nengineer = 0; //engineer sp
    private int ninvestor = 0; // investor sp
    // end variable declariation
    
    /**
     * Creates new form NewGame
     */
    public NewGame() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();

        jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Error: Name cannot be empty");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("and the skill points must be fully allocated");

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(0, 83, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(56, 56, 56))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Skills");

        jLabel4.setText("Maximum");

        jLabel5.setText("Pilot");

        jLabel6.setText("Fighter");

        jLabel7.setText("Trader");

        jLabel8.setText("Engineer");

        jLabel9.setText("Investor");

        jLabel10.setText("15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel5))
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                                .addComponent(jSpinner3)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                    .addComponent(jSpinner2))))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // When button OK is clicked, a new game will be setup
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Store user's input into local variable
        nname = jTextField1.getText();
        npilot = (int)jSpinner1.getValue();
        nfighter = (int)jSpinner2.getValue();
        ntrader = (int)jSpinner3.getValue();
        nengineer = (int)jSpinner4.getValue();
        ninvestor = (int)jSpinner5.getValue();
        //end storing variables
        
        if ((npilot + nfighter + ntrader + nengineer + ninvestor != 15) || (nname.equals(""))) { 
            // when the totall skill points allocated is not 15 or the name is empty, show the error dialog
            jDialog1.setLocationRelativeTo(null);
            jDialog1.setVisible(true);
        } else { // otherwise create a new game
            SpaceTrader.player = new Player(nname, npilot, nfighter, ntrader, nengineer, ninvestor);// create new player based on user's input
            Universe gameUniverse = new Universe(); // create the universe
            System.out.println(gameUniverse.toString()); // Display the info of the universe to the console
            dispose(); // dispose the new game window
            new GameWindow(gameUniverse).setVisible(true);  // Show the game window
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // end jButton1ActionPerformed
    
   // end jTextField1ActionPerformed
    
    // when button Cancel is clicked, close the new game window
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose(); // close the NewGame window
        new WelcomeWin().setVisible(true); // open the welcome window again
    }//GEN-LAST:event_jButton2ActionPerformed
    // end jButton2ActionPerformed
    
    // OK button of the error diaglog, when it is clicked, dispose the error dialog
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.dispose(); // dispose the error dialog
    }//GEN-LAST:event_jButton3ActionPerformed
    // end jButton3ActionPerformed
    
    /** the pilot JSpinner state changed listener, when a skill point is allocated to pilot,
     *  the model of the 5 JSpinners will be updated, and decrement the unallocated skill points
    **/
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // change the range of the 5 JSpinner from 0 to the unallocated points
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        
        // decrement the unallocated skill points and update it on the window
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner1StateChanged
    
    /** the fighter JSpinner state changed listener, when a skill point is allocated to pilot,
     *  the model of the 5 JSpinners will be updated, and decrement the unallocated skill points
    **/
    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // change the range of the 5 JSpinner from 0 to the unallocated points
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        
        // decrement the unallocated skill points and update it on the window
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner2StateChanged

    /** the trader JSpinner state changed listener, when a skill point is allocated to pilot,
     *  the model of the 5 JSpinners will be updated, and decrement the unallocated skill points
    **/
    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        // change the range of the 5 JSpinner from 0 to the unallocated points
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        
        // decrement the unallocated skill points and update it on the window
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner3StateChanged

    /** the engineer JSpinner state changed listener, when a skill point is allocated to pilot,
     *  the model of the 5 JSpinners will be updated, and decrement the unallocated skill points
    **/
    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        // change the range of the 5 JSpinner from 0 to the unallocated points
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        
        // decrement the unallocated skill points and update it on the window
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner4StateChanged

    /** the investor JSpinner state changed listener, when a skill point is allocated to pilot,
     *  the model of the 5 JSpinners will be updated, and decrement the unallocated skill points
    **/
    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
        // change the range of the 5 JSpinner from 0 to the unallocated points
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        
        // decrement the unallocated skill points and update it on the window
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner5StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
