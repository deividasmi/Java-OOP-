/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author WildsG
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    //Class variables
    ArrayList<Accessory> accessories;
    ArrayList<Clothes> clothes;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartDate = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        PassTime = new javax.swing.JButton();
        CurrentDateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsArea = new javax.swing.JTextArea();
        ShowItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartDate.setToolTipText("Enter Date in Format YY.MM.DD");

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        PassTime.setText("Pass Time by 1 Day");
        PassTime.setActionCommand("PassTime");
        PassTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTimeActionPerformed(evt);
            }
        });

        CurrentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentDateLabel.setText("CurrentDate");

        ItemsArea.setColumns(20);
        ItemsArea.setRows(5);
        jScrollPane1.setViewportView(ItemsArea);

        ShowItems.setText("Show Items");
        ShowItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CurrentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(StartDate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(ShowItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(PassTime)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CurrentDateLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(ShowItems, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartDate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PassTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        CurrentDateLabel.getAccessibleContext().setAccessibleName("label1");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    TimeManager time = new TimeManager();
    
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
          
            //variables for Start month,day and hour respectively
            int SY; int SM; int SD;
            //Setting Start Date values to their variables
            try{
            SY = Integer.parseInt(this.StartDate.getText().substring(0,2));
            SM = Integer.parseInt(this.StartDate.getText().substring(3,5));
            SD = Integer.parseInt(this.StartDate.getText().substring(6,8));
            
            //setting Start timeValue in TimeManager class
            time.setStartDate(SY,SM,SD);
            //output time
            CurrentDateLabel.setText("Start time - Year:"+time.getStartYear()+" Month:"+ time.getStartMonth()+" Day:"+time.getStartDay());
            }
            catch(Exception e){
                //alert box if exception is caught
                 JOptionPane.showMessageDialog(null,"Exception,There were errors in time input.Try again");
            }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void PassTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTimeActionPerformed
            time.addDay();
            CurrentDateLabel.setText("Start time - Year:"+time.getStartYear()+" Month:"+ time.getStartMonth()+" Day:"+time.getStartDay());
    }//GEN-LAST:event_PassTimeActionPerformed
    
    //outputs all clothes to TextArea
    private void ShowItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowItemsActionPerformed
        for(Clothes cl:clothes)
        {
            ItemsArea.append(cl.toString()+"\n");
        }
    }//GEN-LAST:event_ShowItemsActionPerformed
    //this is done at start
    public void setItems(ArrayList<Accessory> accessory,ArrayList<Clothes> clothes)
    {
        this.accessories = accessory;
        this.clothes = clothes;
    }
    //this is done at start
    public void initDefaultTime()
    {
        CurrentDateLabel.setText("Start time - Year:"+time.getStartYear()+" Month:"+ time.getStartMonth()+" Day:"+time.getStartDay());
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentDateLabel;
    private javax.swing.JTextArea ItemsArea;
    private javax.swing.JButton PassTime;
    private javax.swing.JButton ShowItems;
    private javax.swing.JTextField StartDate;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
