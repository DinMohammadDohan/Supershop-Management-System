
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Product extends javax.swing.JFrame {

  Connection conn;
  private Statement st;
    public Product() {
        initComponents();
         createconnection();
    }

  void createconnection()  {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supershop", "root", "");
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jaddpro = new javax.swing.JButton();
        jremove = new javax.swing.JButton();
        jproid = new javax.swing.JTextField();
        jproname = new javax.swing.JTextField();
        jdisplay = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jquan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jprice = new javax.swing.JTextField();
        jsearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product Details");

        jLabel2.setText("Product ID");

        jLabel3.setText("Product Name");

        jaddpro.setText("Add");
        jaddpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddproActionPerformed(evt);
            }
        });

        jremove.setText("Remove");
        jremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jremoveActionPerformed(evt);
            }
        });

        jdisplay.setText("Display");
        jdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdisplayActionPerformed(evt);
            }
        });

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText("Quantity");

        jquan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquanActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(31, 31, 31))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(47, 47, 47)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(64, 64, 64)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jquan)
                                    .addComponent(jproid, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(jproname, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jremove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jaddpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jdisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(83, 83, 83)
                                        .addComponent(jprice)
                                        .addGap(200, 200, 200))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 89, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jaddpro)
                            .addComponent(jproid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jproname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jremove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jupdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdisplay)
                    .addComponent(jLabel4)
                    .addComponent(jquan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jaddproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddproActionPerformed
       
      try {
     int id,quantity,price;
     
 id = Integer.parseInt(jproid.getText());    
 String name = jproname.getText();
 quantity  = Integer.parseInt(jquan.getText());
 price = Integer.parseInt(jprice.getText());
 
         //insert query
         PreparedStatement stat;
         String query ="INSERT INTO product (id,name,quantity,price)" +"  values (? , ?, ? ,? )";
            stat = conn.prepareStatement(query);
            stat.setInt(1, id);
             stat.setString(2,name);
              stat.setInt(3, quantity);
               stat.setInt(4, price);
               
                
                 if (jproid.getText().isEmpty()){
                     
                     System.out.println("Plz Fill up blanks");
                  
                 }
                 else if (jproname.getText().isEmpty()){
                   System.out.println("Plz Fill up blanks");
                 }
                 
                 
                 else if (jquan.getText().isEmpty()){
                   System.out.println("Plz Fill up blanks");
                 }
                 else if (jprice.getText().isEmpty()){
                   System.out.println("Plz Fill up blanks");
                 }
                     
                 else {
                     stat.execute();
                  
                  jproid.setText(" ");
                  jproname.setText(" ");
                  jquan.setText(" ");
                  jprice.setText(" ");
                  
                  conn.close();
                 }
            
     } catch (SQLException ex) {
         Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
     }     
        
    }//GEN-LAST:event_jaddproActionPerformed

    private void jquanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jquanActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        
         try{
           
        Class.forName("com.mysql.jdbc.Driver");
        
         conn = DriverManager.getConnection("jdbc:mysql://localhost/supershop", "root", "");
        // String sql="update product set id=?,name=?,quantity=?,price=? where id=?";
        // PreparedStatement stat=conn.prepareStatement(sql);
        st=conn.createStatement();
        // st.setInt(1,Integer.parseInt(jproid.getText()));
        // st.setString(2,jproname.getText());
        // st.setInt(3,Integer.parseInt(jquan.getText()));
       //  st.setInt(4,Integer.parseInt(jprice.getText()));
         int ID = Integer.parseInt(jproid.getText());
         String Name =jproname.getText();
         int Quantity = Integer.parseInt(jquan.getText());
         int Price = Integer.parseInt(jprice.getText());
         
         String q1 = "update product set id='"+ID+"', name='"+Name+"', quantity='"+Quantity+"', price='"+Price+"' where id='"+ID+"'";
           st.executeUpdate(q1);
          
        // st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Updated Successfully");
      this.jdisplay.enable();
       // conn.close();
        
        }
        
        catch(  Exception ex){
            
      JOptionPane.showMessageDialog(null,ex);
      
        
        }
        
        
        
    }//GEN-LAST:event_jupdateActionPerformed

    private void jdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdisplayActionPerformed
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
       
        try {
            
             
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from product");
            while (rs.next()) {
             int  i;  
                i = rs.getInt("id");
            String n = rs.getString("name");
            int q = rs.getInt("quantity");
            int p = rs.getInt("price");
            tableModel.addRow(new Object[] {i,n,q,p});
           
            }
           stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jdisplayActionPerformed

    private void jremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jremoveActionPerformed
       try{
           
        Class.forName("com.mysql.jdbc.Driver");
        
         conn = DriverManager.getConnection("jdbc:mysql://localhost/supershop", "root", "");
         String sql="delete from product  where id=?";
         PreparedStatement stat=conn.prepareStatement(sql);
         stat.setInt(1,Integer.parseInt(jproid.getText()) );
         stat.executeUpdate();
         JOptionPane.showMessageDialog (null," Deleted Successfully");
         conn.close();
         
         jproid.setText("");
         jproname.setText("");
         jquan.setText("");
         jprice.setText("");

    
    }


catch(Exception e)

{
JOptionPane.showMessageDialog (null,"Something is Wrong.Please check again.");

} 
    }//GEN-LAST:event_jremoveActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
       
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
         conn = DriverManager.getConnection("jdbc:mysql://localhost/supershop", "root", "");
        
        String sql="select * from product where id=?";
        
        
       PreparedStatement stat=conn.prepareStatement(sql);
       stat.setInt(1,Integer.parseInt(jproid.getText()));
       ResultSet rs=stat.executeQuery();
       if(rs.next())
       {
       jproid.setText(rs.getString("ID"));
        jproname.setText(rs.getString("Name"));
        jquan.setText(rs.getString("Quantity"));
        jprice.setText(rs.getString("Price"));
       
       }
       else{
       
         JOptionPane.showMessageDialog(null, "Not Found");
       }
       
       conn.close();
      }
        
        catch(Exception e){
            
            
            JOptionPane.showMessageDialog(null, e);
            
        
        
        
        
        
        }
        
        
    }//GEN-LAST:event_jsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admin rg=new Admin();
       rg.setVisible(true);
       rg.pack();
       rg.setLocationRelativeTo(null);
       rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jaddpro;
    private javax.swing.JButton jdisplay;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField jproid;
    private javax.swing.JTextField jproname;
    private javax.swing.JTextField jquan;
    private javax.swing.JButton jremove;
    private javax.swing.JButton jsearch;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}
