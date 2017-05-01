/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        CartList.setFont(new Font("monospaced",Font.PLAIN,12));
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
    boolean isClothes = true;
    double price;
    ArrayList<Item> cartItems = new ArrayList();
    ArrayList<String> discountedBrands = new ArrayList();
    LoadData putToHistory = new LoadData();
    Search itemSuggestions = new Search();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        PriceLabel = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        ShowHistoryButton = new javax.swing.JButton();
        sortPrice = new javax.swing.JButton();
        SortByLabel = new javax.swing.JLabel();
        SortName = new javax.swing.JButton();
        sortSize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        DiscountLabel = new javax.swing.JLabel();
        DiscountInfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(560, 670));
        setMinimumSize(new java.awt.Dimension(560, 670));
        setName("eShopFrame"); // NOI18N
        setResizable(false);

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
        ProceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedButtonActionPerformed(evt);
            }
        });

        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Price: ");

        Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Price.setText("0");

        ShowHistoryButton.setText("Show History");
        ShowHistoryButton.setToolTipText("");
        ShowHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowHistoryButtonActionPerformed(evt);
            }
        });

        sortPrice.setText("Price");
        sortPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPriceActionPerformed(evt);
            }
        });

        SortByLabel.setText("Sort by:");

        SortName.setText("Name");
        SortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortNameActionPerformed(evt);
            }
        });

        sortSize.setText("Size");
        sortSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortSizeActionPerformed(evt);
            }
        });

        jLabel1.setText("  ID                  Name                 Brand             Model               Type        Size  Price");
        jLabel1.setToolTipText("");

        TypeLabel.setText("Select merchadise type:");

        DiscountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DiscountInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiscountInfoLabel.setText("Today we have Discounts for:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SortByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SortName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PassTime)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sortSize, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(sortPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItemType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RemoveFromCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DiscountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DiscountInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassTime)
                    .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortPrice)
                    .addComponent(SortByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SortName)
                    .addComponent(sortSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoveFromCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToCartButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProceedButton)
                            .addComponent(ShowHistoryButton))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DiscountInfoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiscountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(PriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(13, 13, 13))
        );

        CurrentDateLabel.getAccessibleContext().setAccessibleName("label1");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    TimeManager time = new TimeManager();
    private void PassTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTimeActionPerformed
            time.addDay();
            time.updateStocks(clothes, accessories);  
            checkItemsForDiscounts();
            if(isClothes)
            UpdateItemList(clothes);
            else
               UpdateItemList(accessories);
            CurrentDateLabel.setText(time.toString());
    }//GEN-LAST:event_PassTimeActionPerformed
    
    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
  try{
            boolean elementAdded = false;
               
                Item selected = (Item) selectedItem;
                for(Item obj:cartItems)
                {   
                    if(obj.getId() == selected.getId())
                    {
                        elementAdded = true;
                    }
                }
                if(!elementAdded&&selected.amount>0)
                {
                    cartItems.add(selected);
                }
                if(selected.amount>0)
                {
                    selected.putToCart();
                    price+=selected.getPrice();
                }
                else
                {
                    SuggestionsFrame sFrame = new SuggestionsFrame();
                    sFrame.setVisible(true);
                    
                    if(isClothes)
                    {
                        ArrayList<Clothes> suggestItems;
                        suggestItems =  itemSuggestions.suggestions(clothes, (Clothes) selectedItem);
                        sFrame.setSuggestionsData(suggestItems,time.daysTillStockUp(selected));
                    }
                    else
                    {   ArrayList<Accessory> suggestItems;
                        suggestItems =  itemSuggestions.suggestions(accessories, (Accessory) selectedItem);
                        sFrame.setSuggestionsData(suggestItems,time.daysTillStockUp(selected));
                    }           
                    
                }
                
                UpdateCart();
                checkForCartItemsAmount();
                
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
         Price.setText(String.format("%.2f",price)+"€");
         for(Item obj : cartItems)
         {
            cartModel.addElement(obj.toCartString()); 
         }
         CartList.setModel(cartModel);
    }
    private void RemoveFromCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromCartButtonActionPerformed
       
        try {
            String[] array = selectedCartItem.toString().split("\\s+");
            int id = Integer.parseInt(array[0]);
            Item selected = null;
            for (Item ci : cartItems) {
                if (id == ci.getId()) {
                    selected = ci;
                }
            }
            price-=selected.getPrice();
            selected.setAmount(selected.getAmount()+1);
            if (selected.cartAmount <= 1) {
                cartModel.removeElement(selected);
                cartItems.remove(selected);
            }
            selected.removeItemFromCart();
            
            UpdateCart();
            checkForCartItemsAmount();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Item was not selected");
        }

    }//GEN-LAST:event_RemoveFromCartButtonActionPerformed

    private void ItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTypeActionPerformed
        if(ItemType.getSelectedIndex()==0)
        {
            UpdateItemList(clothes);
            isClothes = true;
        }  
        if(ItemType.getSelectedIndex()==1)
        {
            UpdateItemList(accessories);
            isClothes = false;
        }
          if(isClothes)
            jLabel1.setText("  ID                  Name                 Brand             Model               Type        Size  Price");
        else
             jLabel1.setText("  ID                  Name                 Brand             Model        Size  Price");
               
        
    }//GEN-LAST:event_ItemTypeActionPerformed
    
    private void checkForCartItemsAmount()
    {
        if(cartItems.size()>0)
        {
            ProceedButton.setEnabled(true);
            PassTime.setEnabled(false);
        }
        else if(cartItems.size()<=0)
        {
            ProceedButton.setEnabled(false);
            PassTime.setEnabled(true);
        }
       
    }
    
    private void ProceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedButtonActionPerformed
         try {
            putToHistory.loadHistoryToFile(cartItems,time,price);
            for(Item i : cartItems)
            {
                i.clearCartAmount();
            }
            cartItems.clear();
            cartModel.clear();
            price = 0;
            Price.setText(String.format("%.2f",price)+"€");
            System.out.println("History was Updated successfully");
            checkForCartItemsAmount();
             JOptionPane.showMessageDialog(null, "Thank You for buying, come again!");
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProceedButtonActionPerformed

    private void ShowHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowHistoryButtonActionPerformed
        HistoryFrame historyFrame = new HistoryFrame();
        historyFrame.setVisible(true);
        try {
            historyFrame.LoadHistory();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShowHistoryButtonActionPerformed
    boolean priceUp = false;
    boolean nameUp = false;
    boolean sizeUp = false;
    private void sortPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPriceActionPerformed
        Sort sort = new Sort();
        PriceComparator cmp = new PriceComparator();
        if(isClothes)
        {
            sort.quickSort(clothes, cmp,priceUp);
            UpdateItemList(clothes);
        }
        else{
            sort.quickSort(accessories, cmp,priceUp);  
            UpdateItemList(accessories);
        }
        priceUp = !priceUp;
        
    }//GEN-LAST:event_sortPriceActionPerformed

    private void SortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortNameActionPerformed
        Sort sort = new Sort();
        NameComparator cmp = new NameComparator();
        if(isClothes)
        {
            sort.quickSort(clothes, cmp,nameUp);
            UpdateItemList(clothes);
        }
        else{
            sort.quickSort(accessories,cmp, nameUp);  
            UpdateItemList(accessories);
        }
        nameUp= !nameUp;
       
    }//GEN-LAST:event_SortNameActionPerformed

    private void sortSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSizeActionPerformed
        Sort sort = new Sort();
        if(isClothes)
        {   
            ClothesSizeComparator cmp = new ClothesSizeComparator();
            sort.quickSort(clothes, cmp,sizeUp);
            UpdateItemList(clothes);
        }
        else{
            AccessorySizeComparator cmp = new AccessorySizeComparator();
            sort.quickSort(accessories, cmp,sizeUp);  
            UpdateItemList(accessories);
        }
        sizeUp = !sizeUp;
    }//GEN-LAST:event_sortSizeActionPerformed
    
   //this is done at start
    private void setItems(ArrayList<Accessory> accessory,ArrayList<Clothes> clothes)
    {
        this.accessories = accessory;
        this.clothes = clothes;
        checkForCartItemsAmount();
        checkItemsForDiscounts();
        UpdateItemList(this.clothes);
        
    }
    //this is done at start
    private void initDefaultTime()
    {
        CurrentDateLabel.setText(time.toString());
       
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
    private void checkItemsForDiscounts()
    {   
        boolean dontAdd = false;
        for(Clothes cl: clothes)
        {
            if(time.checkIfDiscount(cl)&&!cl.isDiscounted())
            {
                 cl.setPrice(time.discountedPrice(cl));
                 cl.setDiscounted(true);
                 for(String s :discountedBrands)
                 {  
                    if(s.equals(cl.getBrand()))
                        dontAdd = true;
                 }
                 if(!dontAdd)
                     discountedBrands.add(cl.getBrand());
            }
            else if(cl.isDiscounted()&&!time.checkIfDiscount(cl))
            {
                cl.setDiscounted(false);
                cl.setPrice(cl.getPrice()*2);
                discountedBrands.remove(cl.getBrand());
            }
      
        }
        dontAdd = false;
        for(Accessory ac: accessories)
        {
            if(time.checkIfDiscount(ac)&&!ac.isDiscounted())
            {
                 ac.setPrice(time.discountedPrice(ac));
                 ac.setDiscounted(true);
                 for(String s :discountedBrands)
                 {  
                    if(s.equals(ac.getBrand()))
                        dontAdd = true;
                 }
                 if(!dontAdd)
                     discountedBrands.add(ac.getBrand());
            }
            else if(ac.isDiscounted()&&!time.checkIfDiscount(ac))
            {
                ac.setDiscounted(false);
                ac.setPrice(ac.getPrice()*2);
                discountedBrands.remove(ac.getBrand());
            }
        }
        if(!discountedBrands.isEmpty())
        {   
            DiscountInfoLabel.setText("Today we have 50% Discounts for : ");
            DiscountLabel.setText(Arrays.toString(discountedBrands.toArray()));
        }
        else
        {
            DiscountLabel.setText("");
            DiscountInfoLabel.setText("We don't have discounts for today");
        }
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {

        /* Create and display the form */
        GUI graphicalInterface = new GUI();
        graphicalInterface.setVisible(true);
        ArrayList<Clothes> clothes = new ArrayList(); // creating clothes arraylist
        ArrayList<Accessory> accessories = new ArrayList(); // creating accessories arraylist
        LoadData data = new LoadData();
        data.loadAccessoriesData(accessories); // loads dada into arraylists
        data.loadClothesData(clothes);  // loads clothes data
        graphicalInterface.setItems(accessories, clothes); // sending both arraylists to GUI class
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartButton;
    private javax.swing.JList<String> CartList;
    private javax.swing.JLabel CurrentDateLabel;
    private javax.swing.JLabel DiscountInfoLabel;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JComboBox<String> ItemType;
    private javax.swing.JList<String> ItemsList;
    private javax.swing.JButton PassTime;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JButton ProceedButton;
    private javax.swing.JButton RemoveFromCartButton;
    private javax.swing.JButton ShowHistoryButton;
    private javax.swing.JLabel SortByLabel;
    private javax.swing.JButton SortName;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sortPrice;
    private javax.swing.JButton sortSize;
    // End of variables declaration//GEN-END:variables
}
