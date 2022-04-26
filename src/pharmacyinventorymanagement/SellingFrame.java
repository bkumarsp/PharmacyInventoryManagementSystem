/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacyinventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Bharath Kumar S P
 */
public class SellingFrame extends javax.swing.JFrame {

    /**
     * Creates new form MedicineFrame
     */
    public SellingFrame() {
        initComponents();
        ShowDate();
        SelectMed();
    }
    
    public void ShowDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        date_text.setText(sdf.format(d));
    }
    
    Connection Con = null;
    Statement St = null, St1=null;
    ResultSet Rs =null, Rs1=null;
    double price=0;
    int medId = 0, mQty;
    
    @SuppressWarnings("unchecked")
    
    public void SelectMed()
    {
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "User1","User1");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.MEDICINE");
            medicine_table.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Error: A SQL exception occured");
            e.printStackTrace();
        }
    }
    
    public boolean updateQty(){
            int orderQty = Integer.valueOf(b_quantity.getText());
            if(mQty >= orderQty){
                try{
                    int newQty = mQty - orderQty;
                    mQty = newQty;
                    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "User1","User1");

                    String UpdateQuery = "Update User1.MEDICINE set M_QUANTITY = "+newQty+" where M_ID = "+medId;
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(UpdateQuery);

                    SelectMed();
                    Con.close();
                    return true;

                }catch(org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
                    JOptionPane.showMessageDialog(this, "Error: Expiry date must not be lesser than manufacture date!");
                }catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(this, "Error: A SQL exception occured");
                    e.printStackTrace();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Error:Internal server error");

                }
            }else{
                JOptionPane.showMessageDialog(this, "Insufficient stock!\n  Available: "+mQty+"\n  Ordered: "+b_quantity.getText());
                return false;
            }
            return false;
            

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        medicineBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Title4 = new javax.swing.JLabel();
        Title5 = new javax.swing.JLabel();
        b_id = new javax.swing.JTextField();
        b_medName = new javax.swing.JTextField();
        btnAddToBill = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Title9 = new javax.swing.JLabel();
        date_text = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicine_table = new javax.swing.JTable();
        Title11 = new javax.swing.JLabel();
        Title6 = new javax.swing.JLabel();
        b_quantity = new javax.swing.JTextField();
        companyBtn = new javax.swing.JLabel();
        agentBtn = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        Title12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        b_textArea = new javax.swing.JTextArea();
        closeX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));

        medicineBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        medicineBtn.setForeground(new java.awt.Color(255, 255, 255));
        medicineBtn.setText("MEDICINE");
        medicineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineBtnMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        Title4.setBackground(new java.awt.Color(255, 255, 255));
        Title4.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title4.setForeground(new java.awt.Color(51, 153, 0));
        Title4.setText("BILL ID");

        Title5.setBackground(new java.awt.Color(255, 255, 255));
        Title5.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title5.setForeground(new java.awt.Color(51, 153, 0));
        Title5.setText("MEDICINE");

        b_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idActionPerformed(evt);
            }
        });

        b_medName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_medNameActionPerformed(evt);
            }
        });

        btnAddToBill.setBackground(new java.awt.Color(0, 204, 0));
        btnAddToBill.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnAddToBill.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToBill.setText("ADD TO BILL");
        btnAddToBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToBillMouseClicked(evt);
            }
        });
        btnAddToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToBillActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 204, 0));
        btnClear.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        Title9.setBackground(new java.awt.Color(255, 255, 255));
        Title9.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 51, 51));
        Title9.setText("SELLER");

        date_text.setBackground(new java.awt.Color(255, 255, 255));
        date_text.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        date_text.setForeground(new java.awt.Color(255, 51, 51));
        date_text.setText("DATE");

        medicine_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Unit Price", "Quantity", "MFT.Date", "EXP.Date", "Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        medicine_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicine_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicine_table);

        Title11.setFont(new java.awt.Font("High Tower Text", 1, 26)); // NOI18N
        Title11.setForeground(new java.awt.Color(51, 153, 0));
        Title11.setText("MEDICINE STOCK");

        Title6.setBackground(new java.awt.Color(255, 255, 255));
        Title6.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title6.setForeground(new java.awt.Color(51, 153, 0));
        Title6.setText("QTY.");

        b_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Title5)
                            .addComponent(Title4)
                            .addComponent(Title6))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_id, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(b_medName)
                            .addComponent(b_quantity)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Title9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnAddToBill)
                                .addGap(75, 75, 75)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Title11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_text)
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title11)
                    .addComponent(date_text)
                    .addComponent(Title9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Title4)
                            .addComponent(b_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Title5)
                            .addComponent(b_medName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Title6)
                            .addComponent(b_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        companyBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        companyBtn.setForeground(new java.awt.Color(255, 255, 255));
        companyBtn.setText("COMPANY");
        companyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyBtnMouseClicked(evt);
            }
        });

        agentBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        agentBtn.setForeground(new java.awt.Color(255, 255, 255));
        agentBtn.setText("Agent");
        agentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentBtnMouseClicked(evt);
            }
        });

        Title3.setFont(new java.awt.Font("High Tower Text", 1, 26)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("BILLING");

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        btnPrint.setBackground(new java.awt.Color(0, 204, 0));
        btnPrint.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("PRINT");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        Title12.setFont(new java.awt.Font("High Tower Text", 1, 26)); // NOI18N
        Title12.setForeground(new java.awt.Color(51, 153, 0));
        Title12.setText("INVOICE");

        b_textArea.setColumns(20);
        b_textArea.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        b_textArea.setRows(5);
        b_textArea.setText("********************** PHARMA-EASY ************************");
        b_textArea.setToolTipText("");
        jScrollPane2.setViewportView(b_textArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(Title12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(btnPrint)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeX.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        closeX.setForeground(new java.awt.Color(255, 153, 153));
        closeX.setText("x");
        closeX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeXMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(medicineBtn)
                    .addComponent(companyBtn)
                    .addComponent(agentBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Title3)
                        .addGap(360, 360, 360)
                        .addComponent(closeX)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(medicineBtn)
                .addGap(18, 18, 18)
                .addComponent(agentBtn)
                .addGap(18, 18, 18)
                .addComponent(companyBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeX)
                    .addComponent(Title3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void b_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_quantityActionPerformed

    private void medicine_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)medicine_table.getModel();
        int Myindex = medicine_table.getSelectedRow();
        b_medName.setText(model.getValueAt(Myindex, 1).toString());

        medId = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        mQty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        price = Double.valueOf(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_medicine_tableMouseClicked

    private void btnAddToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToBillActionPerformed

    private void b_medNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_medNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_medNameActionPerformed

    private void b_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_idActionPerformed

    int billID = 0;
    private void btnAddToBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToBillMouseClicked
        boolean updateResult = updateQty();
        
        if(b_medName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill medicine name");
        }else if(updateResult){
            billID++;
            b_id.setText(Integer.toString(billID));
            
            
            String billHeader = "";
            try{
                if(billID==1){
                    billHeader = "***************** PHARMA-EASY ********************";
                    billHeader += "\n ID  Name\tPrice     Qty     Net";
                    billHeader += "\n "+billID+"  "+b_medName.getText()+"\t"+price+"       "+b_quantity.getText()+"       "+Integer.valueOf(b_quantity.getText())*price;
                }else
                {
                    billHeader += b_textArea.getText();
                    billHeader+= "\n "+billID+"  "+b_medName.getText()+"\t"+price+"       "+b_quantity.getText()+"        "+Integer.valueOf(b_quantity.getText())*price;
                }

                b_textArea.setText(billHeader);


            }catch(NullPointerException npe){
                JOptionPane.showMessageDialog(this, "Error: A Null exception occured");
            }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Please fill quantity");
                billID-=1;
            }
        }else{
            //no stock
        }
               
    }//GEN-LAST:event_btnAddToBillMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        try{
            b_textArea.print();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    private void closeXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeXMouseClicked

                System.exit(0);


    }//GEN-LAST:event_closeXMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        b_id.setText("");
        b_medName.setText("");
        b_quantity.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void companyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyBtnMouseClicked

        try{
            new CompanyFrame().setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Internal Server Error!");

            e.printStackTrace();
        }
        
    }//GEN-LAST:event_companyBtnMouseClicked

    private void agentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentBtnMouseClicked
        try{
            new AgentsFrame().setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Internal Server Error!");

            e.printStackTrace();
        }

    }//GEN-LAST:event_agentBtnMouseClicked

    private void medicineBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineBtnMouseClicked
        
        try{
            new MedicineFrame().setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Internal Server Error!");

            e.printStackTrace();
        }
        
    }//GEN-LAST:event_medicineBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SellingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title11;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title9;
    private javax.swing.JLabel agentBtn;
    private javax.swing.JTextField b_id;
    private javax.swing.JTextField b_medName;
    private javax.swing.JTextField b_quantity;
    private javax.swing.JTextArea b_textArea;
    private javax.swing.JButton btnAddToBill;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel closeX;
    private javax.swing.JLabel companyBtn;
    private javax.swing.JLabel date_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel medicineBtn;
    private javax.swing.JTable medicine_table;
    // End of variables declaration//GEN-END:variables
}
