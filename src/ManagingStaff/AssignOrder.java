/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagingStaff;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thapa
 */
public class AssignOrder extends javax.swing.JFrame {
    String did,dfirstname,dlastname,daddress,dpassword,demail,dgender,ddate;
    String oid,ofirstname,olastname,oname,onumber,oaddress,oemail,odate;
    private boolean isFound;
    String UID,StoreName;
    /**
     * Creates new form AssignOrder
     */
    public AssignOrder() {
        initComponents();
        AssignTheTask();
        backspace();
    }

    AssignOrder(String StoreName, String UID) {
        this.StoreName = StoreName;
        this.UID = UID;
        initComponents();
        backspace();
        AssignTheTask();
             
    }
      private void backspace(){
        ImageIcon icon = new ImageIcon("E:\\3rd sem\\java\\Assignment work\\images for GUI\\previous.PNG");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        back.setIcon(scaledIcon);
    }
    private void AssignTheTask(){
        String filePath ="C:\\Java\\DeliveryStaff\\Staffregister.txt";
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(" ");
            DefaultTableModel model = (DefaultTableModel)asd.getModel();
            model.addRow(columnsName);
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            br.close();
            
             
            
     // extratct data from lines
     // set data to jtable model
     for (Object tableLine : tableLines) {
        String line = tableLine.toString().trim();
        String[] dataRow = line.split(" ");
        model.addRow(dataRow);
        
     }
            
            
        } catch (IOException ex) {
           System.out.print(ex);
        }
        String filePath1 ="C:\\Java\\OrderList.txt";
        File file1 = new File(filePath1);
        
        
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            
            String firstLine1 = br1.readLine().trim();
            String[] columnsName1 = firstLine1.split(" ");
            DefaultTableModel model1 = (DefaultTableModel)deliveryTable.getModel();
            model1.addRow(columnsName1);
            // get lines from txt file
            Object[] tableLines1 = br1.lines().toArray();
            br1.close();
            
             
            
     // extratct data from lines
     // set data to jtable model
     for (Object tableLine : tableLines1) {
        String line1 = tableLine.toString().trim();
        String[] dataRow1 = line1.split(" ");
        model1.addRow(dataRow1);
        
     }
            
            
        } catch (IOException ex) {
            }

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
        Username = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        rSButtonHover2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        asd = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryTable = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        Username.setBackground(new java.awt.Color(25, 118, 211));
        Username.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        Username.setText("ORDER LIST");

        Username1.setBackground(new java.awt.Color(25, 118, 211));
        Username1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        Username1.setText("Delivery Staff List");

        rSButtonHover2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButtonHover2.setForeground(new java.awt.Color(25, 118, 211));
        rSButtonHover2.setText("Assign Order");
        rSButtonHover2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        asd.setBackground(new java.awt.Color(255, 255, 255));
        asd.setForeground(new java.awt.Color(0, 0, 0));
        asd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FirstName", "LastName", "Address", "Email", "Password", "Date", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        asd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asdMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(asd);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        deliveryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Last Name", "Order Name", "Number", "Delivery Address", "Email", "Date"
            }
        ));
        deliveryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(deliveryTable);

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(Username)))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(Username1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username1)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
              //Getting the current date value
      LocalDate currentdate = LocalDate.now();
      //Getting the current day
      int currentDay = currentdate.getDayOfMonth();
//      System.out.println("Current day: "+currentDay);
      //Getting the current month
     int currentMonth = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
//      System.out.println("Current month: "+currentMonth);
      //getting the current year
      int currentYear = currentdate.getYear();
//      System.out.println("Current month: "+currentYear);
        
        try {
            FileWriter Writer = new FileWriter("C:\\Java\\AssignTask.txt",true);
            
            Writer.write(oid+" "+ofirstname+" "+ olastname + " " + oname + " " + onumber + " " + oaddress + " " + oemail + " " + odate + " " + did + " " + currentDay + " " + currentMonth + " " +currentYear);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null, "Order Assigned Successfully");
            delete();
            this.setVisible(false);
            new AssignOrder(StoreName,UID).setVisible(true);
        } catch (IOException ex) {
         
        }
          try {
            FileWriter Writer = new FileWriter("C:\\Java\\StoreAssignTask.txt",true);
            
            Writer.write(oid+" "+ofirstname+" "+ olastname + " " + oname + " " + onumber + " " + oaddress + " " + oemail + " " + odate + " " + did + " " + currentDay + " " + currentMonth + " " +currentYear);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            this.setVisible(false);
            new AssignOrder().setVisible(true);
        } catch (IOException ex) {
         
        }
          
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void asdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asdMouseClicked
        int row1=asd.getSelectedRow();
        did=asd.getValueAt(row1, 0).toString();
        dfirstname=asd.getValueAt(row1, 1).toString();
        dlastname=asd.getValueAt(row1, 2).toString();
        daddress=asd.getValueAt(row1, 3).toString();
        demail=asd.getValueAt(row1, 4).toString();
        dpassword=asd.getValueAt(row1, 5).toString();
        ddate=asd.getValueAt(row1, 6).toString();
        dgender=asd.getValueAt(row1, 7).toString();
    }//GEN-LAST:event_asdMouseClicked

    private void deliveryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryTableMouseClicked
        int row=deliveryTable.getSelectedRow();
        oid=deliveryTable.getValueAt(row, 0).toString();
        ofirstname=deliveryTable.getValueAt(row, 1).toString();
        olastname=deliveryTable.getValueAt(row, 2).toString();
        oname = deliveryTable.getValueAt(row,3).toString();
        onumber = deliveryTable.getValueAt(row,4).toString();
        oaddress=deliveryTable.getValueAt(row, 5).toString();
        oemail=deliveryTable.getValueAt(row, 6).toString();
        odate=deliveryTable.getValueAt(row, 7).toString();
    }//GEN-LAST:event_deliveryTableMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
        new ViewOrder(StoreName, UID).setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseEntered

    
     private void delete(){
       String delete_id = oid;

        ArrayList<Order> userList = new ArrayList<>();
        System.out.println(userList);
        isFound = true;
        if (!isFound) {
         
        } else {
            System.out.println("yoo");
            File file = new File("C:\\Java\\OrderList.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    Order tempOrder;

                    while ((data = br.readLine()) != null) {
                        tempOrder = new Order(data);
                        if (!tempOrder.getId().equals(delete_id)) {
                            userList.add(tempOrder);

                        }
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((order) -> {
                        pw.println(order.toString());
                    });

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
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
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Username1;
    private javax.swing.JTable asd;
    private javax.swing.JLabel back;
    private javax.swing.JTable deliveryTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton rSButtonHover2;
    // End of variables declaration//GEN-END:variables
}
