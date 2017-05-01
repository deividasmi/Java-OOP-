/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author WildsG
 */
public class SuggestionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form SuggestionsFrame
     */
    public SuggestionsFrame() {
        initComponents();
    }

    public void setSuggestionsData(ArrayList<?> arrList,int daysUntilDeliver)
    {   System.out.println(daysUntilDeliver); 
        if(arrList.size()==0)
            suggestionsLabel.setText("<html>Sorry, we do not have any similar items at the moment, close this window and continue shopping. Your item will be delivered after:"+daysUntilDeliver+"</html>");
         else
            suggestionsLabel.setText("<html>We dont have your selected item right now. Here are similar items suggested for you</html>");
         DefaultListModel model = new DefaultListModel();
         model.clear();
         suggestionsList.setFont(new Font("monospaced",Font.PLAIN,12));
         for(Object obj : arrList)
         {
            model.addElement(obj); 
         }
         suggestionsList.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suggestionsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        suggestionsList = new javax.swing.JList<>();

        setResizable(false);

        suggestionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suggestionsLabel.setText("We dont have your selected item right now. Here are similar items suggested for you");

        jScrollPane2.setViewportView(suggestionsList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suggestionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suggestionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel suggestionsLabel;
    private javax.swing.JList<String> suggestionsList;
    // End of variables declaration//GEN-END:variables
}
