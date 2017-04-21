/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
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
        initDefaultTime();
    }

    //Class variables
    ArrayList<Accessory> accessories;
    ArrayList<Clothes> clothes;
    // models are for jlists
    DefaultListModel cartModel = new DefaultListModel();
    DefaultListModel model = new DefaultListModel();
    //variable for transfering items to cart and vice versa
    Object selectedItem;
    Object selectedCartItem;
    ArrayList<Object> cartObjects = new ArrayList();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartDate = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        PassTime = new javax.swing.JButton();
        CurrentDateLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemsList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CartList = new javax.swing.JList<>();
        AddToCartButton = new javax.swing.JButton();
        RemoveFromCartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("eShopFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        StartDate.setToolTipText("Enter Date in Format YYYY.MM.DD");

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
        CurrentDateLabel.setMaximumSize(new java.awt.Dimension(120, 16));

        ItemsList.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
        ItemsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ItemsList);

        CartList.setBorder(new javax.swing.border.MatteBorder(null));
        CartList.setToolTipText("");
        CartList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CartList.setMaximumSize(new java.awt.Dimension(100, 100));
        CartList.setMinimumSize(new java.awt.Dimension(100, 100));
        CartList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CartList);

        AddToCartButton.setText("Add to cart");
        AddToCartButton.setToolTipText("");
        AddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartButtonActionPerformed(evt);
            }
        });

        RemoveFromCartButton.setText("Remove Item");
        RemoveFromCartButton.setMaximumSize(new java.awt.Dimension(95, 25));
        RemoveFromCartButton.setMinimumSize(new java.awt.Dimension(95, 25));
        RemoveFromCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFromCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(PassTime)))
                        .addContainerGap(340, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(RemoveFromCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoveFromCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
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
            SY = Integer.parseInt(this.StartDate.getText().substring(0,4));
            SM = Integer.parseInt(this.StartDate.getText().substring(5,7));
            SD = Integer.parseInt(this.StartDate.getText().substring(8,10));
            
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
    
    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
        try{
        cartModel.addElement(selectedItem.toString());
        CartList.setModel(cartModel);
        cartObjects.add(selectedItem);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Item was not selected");
        }
        
       
    }//GEN-LAST:event_AddToCartButtonActionPerformed

    private void CartListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartListMouseClicked
        selectedCartItem = CartList.getSelectedValue();
    }//GEN-LAST:event_CartListMouseClicked

    private void ItemsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsListMouseClicked
        selectedItem = ItemsList.getSelectedValue();
        
    }//GEN-LAST:event_ItemsListMouseClicked

    private void RemoveFromCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromCartButtonActionPerformed
        cartModel.removeElement(selectedCartItem);
        CartList.setModel(cartModel);
        cartObjects.remove(selectedCartItem);
    }//GEN-LAST:event_RemoveFromCartButtonActionPerformed
    
   //this is done at start
    public void setItems(ArrayList<Accessory> accessory,ArrayList<Clothes> clothes)
    {
        this.accessories = accessory;
        this.clothes = clothes;
        
    }
    //this is done at start
    private void initDefaultTime()
    {
        CurrentDateLabel.setText("Start time - Year:"+time.getStartYear()+" Month:"+ time.getStartMonth()+" Day:"+time.getStartDay());
    }
    public void UpdateItemList()
    {   
        
        for(Clothes cl:clothes)
        {   
            model.addElement(cl); 
        }
        for(Accessory ac:accessories){
            model.addElement(ac);
        }
        ItemsList.setModel(model);
  
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
    private javax.swing.JButton AddToCartButton;
    private javax.swing.JList<String> CartList;
    private javax.swing.JLabel CurrentDateLabel;
    private javax.swing.JList<String> ItemsList;
    private javax.swing.JButton PassTime;
    private javax.swing.JButton RemoveFromCartButton;
    private javax.swing.JTextField StartDate;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
