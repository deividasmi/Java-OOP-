/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.awt.Font;
import java.lang.reflect.Method;
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
        ItemsList.setFont(new Font("monospaced",Font.PLAIN,12));
        
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
    ArrayList<Accessory> cartAccessories = new ArrayList();
    ArrayList<Clothes> cartClothes = new ArrayList();
    
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
        ItemType = new javax.swing.JComboBox<>();
        ProceedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 764));
        setMinimumSize(new java.awt.Dimension(1024, 764));
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

        ItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clothes", "Accessories" }));
        ItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTypeActionPerformed(evt);
            }
        });

        ProceedButton.setText("Proceed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(PassTime))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(AddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RemoveFromCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoveFromCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(ProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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
            time.updateStocks(clothes, accessories);    
            CurrentDateLabel.setText("Start time - Year:"+time.getStartYear()+" Month:"+ time.getStartMonth()+" Day:"+time.getStartDay());
    }//GEN-LAST:event_PassTimeActionPerformed
    
    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
        try{
            boolean elementAdded = false;
            if(selectedItem.getClass().getName().equals("eshop.Clothes"))
            {
                Clothes selected = (Clothes) selectedItem;
                for(Clothes obj:cartClothes)
                {   
                    if(obj.getId() == selected.getId())
                    {
                        elementAdded = true;
                        selected.addCartAmount();

                    }
                   
                }
                if(!elementAdded)
                {
                    cartClothes.add(selected);
                }
               
            }
            elementAdded = false;
            if(selectedItem.getClass().getName().equals("eshop.Accessory"))
            {   
                
                Accessory selected = (Accessory) selectedItem;
                for(Accessory obj:cartAccessories)
                {   
                    if(obj.getId() == selected.getId())
                    {   
                       
                        elementAdded = true;
                        selected.addCartAmount();

                    }
                   
                }
                if(!elementAdded)
                {   
                    cartAccessories.add(selected);
                }
               
            }
           
        UpdateCart();     
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
    private void UpdateCart()
    {
         cartModel.clear();   
         for(Clothes obj : cartClothes)
         {
            cartModel.addElement(obj.toCartString()); 
         }
         for(Accessory obj : cartAccessories)
         {
            cartModel.addElement(obj.toCartString()); 
         }
         CartList.setModel(cartModel);
    }
    private void RemoveFromCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromCartButtonActionPerformed
      try{
          Item test = (Item)selectedCartItem;
          System.out.println(test.getCartAmount());
          
          UpdateCart();
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,"Item was not selected");
      }
       
    }//GEN-LAST:event_RemoveFromCartButtonActionPerformed

    private void ItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTypeActionPerformed
        if(ItemType.getSelectedIndex()==0)
               UpdateItemList(clothes);
        if(ItemType.getSelectedIndex()==1)
               UpdateItemList(accessories);
        
    }//GEN-LAST:event_ItemTypeActionPerformed
    
   //this is done at start
    public void setItems(ArrayList<Accessory> accessory,ArrayList<Clothes> clothes)
    {
        this.accessories = accessory;
        this.clothes = clothes;
        UpdateItemList(this.clothes);
        
    }
    //this is done at start
    private void initDefaultTime()
    {
        CurrentDateLabel.setText("Start time - Year:"+time.getStartYear()+" Month:"+ time.getStartMonth()+" Day:"+time.getStartDay());
       
    }
    private void UpdateItemList(ArrayList<?> object)
    {   
        model.clear();
        for(Object obj:object)
        {   
            model.addElement(obj); 
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
    private javax.swing.JComboBox<String> ItemType;
    private javax.swing.JList<String> ItemsList;
    private javax.swing.JButton PassTime;
    private javax.swing.JButton ProceedButton;
    private javax.swing.JButton RemoveFromCartButton;
    private javax.swing.JTextField StartDate;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
