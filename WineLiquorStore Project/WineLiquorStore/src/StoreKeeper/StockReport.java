/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StoreKeeper;

import javax.swing.JFrame;

/**
 *
 * @author AMIFAH
 */

import Login.LoginForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class StockReport extends javax.swing.JFrame {

    /**
     * Creates new form StockReport
     */
    public StockReport() {
        initComponents();
           Amount.setText(Double.toString( getSum()));
        
    }
    
    public double getSum(){
        
        double sum=InventoryTable.getRowCount();
        double total=0;
        for (double i=0; i<sum;i++){
            total = total + Double.parseDouble(InventoryTable.getValueAt((int) i, 8).toString());
            
        }
    
        return total;
        
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutbttn = new javax.swing.JButton();
        UserText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        SearchText = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        SelectBttn = new javax.swing.JButton();
        CustomerID1 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        BackBttn10 = new javax.swing.JButton();
        BackBttn11 = new javax.swing.JButton();
        BackBttn12 = new javax.swing.JButton();
        BackBttn13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STOCK REPORT");

        logoutbttn.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        logoutbttn.setText("Logout");
        logoutbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbttnActionPerformed(evt);
            }
        });

        UserText.setEditable(false);
        UserText.setBackground(new java.awt.Color(0, 153, 153));
        UserText.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        UserText.setForeground(new java.awt.Color(255, 255, 255));
        UserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addComponent(logoutbttn)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(logoutbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 29, 32));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        SearchText.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        SearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextKeyReleased(evt);
            }
        });

        CustomerID.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(255, 255, 255));
        CustomerID.setText("Search Products Here");

        InventoryTable.setAutoCreateRowSorter(true);
        InventoryTable.setBackground(new java.awt.Color(0, 153, 153));
        InventoryTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        InventoryTable.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        InventoryTable.setForeground(new java.awt.Color(255, 255, 255));
        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Supplier", "Category", "SubCategory", "Manuf. Year", "Supplier Price", "Demand Price", "Quantity", "Litres(l)", "Volume", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(InventoryTable);

        SelectBttn.setBackground(new java.awt.Color(0, 153, 153));
        SelectBttn.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        SelectBttn.setForeground(new java.awt.Color(255, 255, 255));
        SelectBttn.setText("Select Inventory");
        SelectBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBttnActionPerformed(evt);
            }
        });

        CustomerID1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        CustomerID1.setForeground(new java.awt.Color(255, 255, 255));
        CustomerID1.setText("Total Quantity ");

        Amount.setEditable(false);
        Amount.setBackground(new java.awt.Color(0, 29, 32));
        Amount.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        Amount.setForeground(new java.awt.Color(255, 255, 255));
        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 29, 32));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BackBttn10.setBackground(new java.awt.Color(0, 153, 153));
        BackBttn10.setFont(new java.awt.Font("Footlight MT Light", 0, 15)); // NOI18N
        BackBttn10.setForeground(new java.awt.Color(255, 255, 255));
        BackBttn10.setText("Supplier");
        BackBttn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBttn10ActionPerformed(evt);
            }
        });

        BackBttn11.setBackground(new java.awt.Color(0, 153, 153));
        BackBttn11.setFont(new java.awt.Font("Footlight MT Light", 0, 15)); // NOI18N
        BackBttn11.setForeground(new java.awt.Color(255, 255, 255));
        BackBttn11.setText("Dash Board");
        BackBttn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBttn11ActionPerformed(evt);
            }
        });

        BackBttn12.setBackground(new java.awt.Color(0, 153, 153));
        BackBttn12.setFont(new java.awt.Font("Footlight MT Light", 0, 15)); // NOI18N
        BackBttn12.setForeground(new java.awt.Color(255, 255, 255));
        BackBttn12.setText("Products");
        BackBttn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBttn12ActionPerformed(evt);
            }
        });

        BackBttn13.setBackground(new java.awt.Color(0, 153, 153));
        BackBttn13.setFont(new java.awt.Font("Footlight MT Light", 0, 15)); // NOI18N
        BackBttn13.setForeground(new java.awt.Color(255, 255, 255));
        BackBttn13.setText("Inventory");
        BackBttn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBttn13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BackBttn11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBttn10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(BackBttn12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(BackBttn13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBttn10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBttn11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBttn12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBttn13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SelectBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CustomerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbttnActionPerformed
        // TODO add your handling code here:

        LoginForm si= new LoginForm();
        si.setVisible(true);
        si.pack();
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logoutbttnActionPerformed

    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTextActionPerformed

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

    private void SearchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyPressed
        // TODO add your handling code here:

        DefaultTableModel tblModel=(DefaultTableModel) InventoryTable.getModel();
        TableRowSorter <DefaultTableModel> tr= new  TableRowSorter<DefaultTableModel>(tblModel);
        InventoryTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SearchText.getText().trim()));
        Amount.setText(Double.toString( getSum()));
    }//GEN-LAST:event_SearchTextKeyPressed

    private void SearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextKeyReleased

    private void InventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_InventoryTableMouseClicked

    private void SelectBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBttnActionPerformed
        // TODO add your handling code here:

        InventoryTable.setModel(new DefaultTableModel(null,new String[]{"Product ID","Product Name","Supplier","Category","SubCategory","Manuf. Year","Supplier Price","Demand Price","Quantity","Litres(l)","Volume","Description"}));

        try {
            // TODO add your handling code here:

            Class.forName("com.mysql.jdbc.Driver");
            Connection connectme=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/wine_liquor_store", "root","");

            PreparedStatement slt = (PreparedStatement) connectme
            .prepareStatement("select * from products join inventory on Inventory.Product_ID=Products.Product_ID join supplier on products.Supplier_ID=Supplier.Supplier_ID");

            ResultSet rslt= slt.executeQuery();
            while(rslt.next()){

                String pid=rslt.getString("Product_ID");
                String pname=rslt.getString("Product_Name");
                String sname=rslt.getString("Supplier_Name");
                String cate=rslt.getString("Category");
                String subcat=rslt.getString("SubCategory");
                String year=rslt.getString("Year_Produced");
                String litr=rslt.getString("Liters");
                String sup=rslt.getString("Supplier_Price");
                String dem=rslt.getString("Demand_Price");
                String qua=rslt.getString("Quantity_in_stock");
                String desc=rslt.getString("Product_Description");
                String vol=rslt.getString("Volume");

                String tbData []={pid,pname,sname,cate,subcat,year,sup,dem,qua,litr,vol,desc};
                DefaultTableModel tblModel= (DefaultTableModel)InventoryTable.getModel();

                tblModel.addRow(tbData);
                Amount.setText(Double.toString( getSum()));

            }
        }catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StockReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SelectBttnActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void BackBttn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBttn10ActionPerformed
        // TODO add your handling code here:

        SupplierForm si= new SupplierForm ();
        si.setVisible(true);
        si.pack();
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        SupplierForm.UserText.setText(UserText.getText());
    }//GEN-LAST:event_BackBttn10ActionPerformed

    private void BackBttn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBttn11ActionPerformed
        // TODO add your handling code here:

        StoreKeeperDashBoard si= new StoreKeeperDashBoard();
        si.setVisible(true);
        si.pack();
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        StoreKeeperDashBoard.UserText.setText(UserText.getText());

    }//GEN-LAST:event_BackBttn11ActionPerformed

    private void BackBttn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBttn12ActionPerformed
        // TODO add your handling code here:

        ProductForm si= new ProductForm ();
        si.setVisible(true);
        si.pack();
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        ProductForm.UserText.setText(UserText.getText());
    }//GEN-LAST:event_BackBttn12ActionPerformed

    private void BackBttn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBttn13ActionPerformed
        // TODO add your handling code here:
        
        InventoryForm si= new InventoryForm ();
        si.setVisible(true);
        si.pack();
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        InventoryForm.UserText.setText(UserText.getText());
        
    }//GEN-LAST:event_BackBttn13ActionPerformed

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
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JButton BackBttn10;
    private javax.swing.JButton BackBttn11;
    private javax.swing.JButton BackBttn12;
    private javax.swing.JButton BackBttn13;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel CustomerID1;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JTextField SearchText;
    public static javax.swing.JButton SelectBttn;
    public static javax.swing.JTextField UserText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutbttn;
    // End of variables declaration//GEN-END:variables
}