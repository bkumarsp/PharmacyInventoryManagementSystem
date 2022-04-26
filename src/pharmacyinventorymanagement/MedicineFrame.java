/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacyinventorymanagement;

/**
 *
 * @author Bharath Kumar S P
 * @author B Pravena
 * @author Bhuvantej R
 */
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class MedicineFrame extends javax.swing.JFrame {

    /**
     * Creates new form MedicineFrame
     */
    public MedicineFrame() {
        initComponents();
        SelectMed();
    }
    
    Connection Con = null;
    Statement St = null, St1=null;
    ResultSet Rs =null, Rs1=null;
    java.util.Date FDate, EDate;
    java.sql.Date MyFabdate, MyExpDate;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        companyBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Title4 = new javax.swing.JLabel();
        Title5 = new javax.swing.JLabel();
        Title6 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        Title8 = new javax.swing.JLabel();
        Title9 = new javax.swing.JLabel();
        Title10 = new javax.swing.JLabel();
        m_id = new javax.swing.JTextField();
        m_name = new javax.swing.JTextField();
        m_quantity = new javax.swing.JTextField();
        m_price = new javax.swing.JTextField();
        m_company = new javax.swing.JComboBox<>();
        m_expdate = new com.toedter.calendar.JDateChooser();
        m_mftdate = new com.toedter.calendar.JDateChooser();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        sellBtn = new javax.swing.JLabel();
        agentBtn = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicine_table = new javax.swing.JTable();
        Title11 = new javax.swing.JLabel();
        closeX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));

        companyBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        companyBtn.setForeground(new java.awt.Color(255, 255, 255));
        companyBtn.setText("Company");
        companyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyBtnMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        Title4.setBackground(new java.awt.Color(255, 255, 255));
        Title4.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title4.setForeground(new java.awt.Color(51, 153, 0));
        Title4.setText("ID");

        Title5.setBackground(new java.awt.Color(255, 255, 255));
        Title5.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title5.setForeground(new java.awt.Color(51, 153, 0));
        Title5.setText("NAME");

        Title6.setBackground(new java.awt.Color(255, 255, 255));
        Title6.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title6.setForeground(new java.awt.Color(51, 153, 0));
        Title6.setText("QUANTITY");

        Title7.setBackground(new java.awt.Color(255, 255, 255));
        Title7.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title7.setForeground(new java.awt.Color(51, 153, 0));
        Title7.setText("PRICE");

        Title8.setBackground(new java.awt.Color(255, 255, 255));
        Title8.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title8.setForeground(new java.awt.Color(51, 153, 0));
        Title8.setText("EXP.DATE");

        Title9.setBackground(new java.awt.Color(255, 255, 255));
        Title9.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title9.setForeground(new java.awt.Color(51, 153, 0));
        Title9.setText("BRANCH");

        Title10.setBackground(new java.awt.Color(255, 255, 255));
        Title10.setFont(new java.awt.Font("High Tower Text", 1, 17)); // NOI18N
        Title10.setForeground(new java.awt.Color(51, 153, 0));
        Title10.setText("MFT.DATE");

        m_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_idActionPerformed(evt);
            }
        });

        m_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_nameActionPerformed(evt);
            }
        });

        m_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_quantityActionPerformed(evt);
            }
        });

        m_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_priceActionPerformed(evt);
            }
        });

        m_company.setBackground(new java.awt.Color(51, 204, 0));
        m_company.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        m_company.setForeground(new java.awt.Color(255, 255, 255));
        m_company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore south", "Chennai", "China", "Kolkata", "Delhi" }));

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 204, 0));
        btnDelete.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 204, 0));
        btnUpdate.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title4)
                            .addComponent(Title5))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title6)
                            .addComponent(Title7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_price, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Title9)
                        .addComponent(Title8)
                        .addComponent(Title10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(m_company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_expdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_mftdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Title4)
                        .addComponent(m_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Title8))
                    .addComponent(m_expdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Title5)
                        .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Title10))
                    .addComponent(m_mftdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Title6)
                            .addComponent(m_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Title7)
                            .addComponent(m_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(m_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        sellBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        sellBtn.setForeground(new java.awt.Color(255, 255, 255));
        sellBtn.setText("Seller");
        sellBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellBtnMouseClicked(evt);
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
        Title3.setText("MANAGE MEDICINE");

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );

        Title11.setFont(new java.awt.Font("High Tower Text", 1, 26)); // NOI18N
        Title11.setForeground(new java.awt.Color(255, 255, 255));
        Title11.setText("MEDICINE LIST");

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
                    .addComponent(companyBtn)
                    .addComponent(sellBtn)
                    .addComponent(agentBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeX)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Title3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(Title11)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(companyBtn)
                .addGap(18, 18, 18)
                .addComponent(agentBtn)
                .addGap(18, 18, 18)
                .addComponent(sellBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(closeX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Title11)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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

    private void m_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_idActionPerformed

    private void m_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_nameActionPerformed

    private void m_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_quantityActionPerformed

    private void m_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_priceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error 500: Internal Server Error. Please try later...");

            }
    }

    //Add button
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "User1","User1");
            
            String Id = m_id.getText();
                
            String retriveId = "select * from User1.MEDICINE where M_ID="+Id; 
            Statement select = Con.createStatement();
            ResultSet rowSet = select.executeQuery(retriveId);

            if(rowSet.next()){
                JOptionPane.showMessageDialog(this, "Medicine "+Id+" already exists! Please try another valid ID");
            }else{
            
                FDate = m_mftdate.getDate();
                MyFabdate = new java.sql.Date(FDate.getTime());
                EDate = m_expdate.getDate();
                MyExpDate = new java.sql.Date(EDate.getTime());
                PreparedStatement add = Con.prepareStatement("insert into MEDICINE values(?,?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf( m_id.getText() ));
                add.setString(2, m_name.getText());
                add.setInt(3, Integer.valueOf(m_quantity.getText()));
                add.setDouble(4, Double.valueOf(m_price.getText()));
                add.setDate(5, MyExpDate);
                add.setDate(6, MyFabdate);
                add.setString(7, m_company.getSelectedItem().toString());

                int rowAdd = add.executeUpdate();

                Con.close(); 
                SelectMed();

                JOptionPane.showMessageDialog(this, "Medicine Added Successfully!");
            }
        
        }catch(org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
                JOptionPane.showMessageDialog(this, "Error: Expiry date must not be lesser than manufacture date!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Error: A SQL exception occured");

            e.printStackTrace();
        }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error: please fill all details correctly!");

            }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if(m_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter correct ID of Medicine To be Deleted");
        }
        else{
            try{
                
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "User1","User1");
                String Id = m_id.getText();
                
                String retriveId = "Select M_ID from User1.MEDICINE where M_ID="+Id; 
                Statement select = Con.createStatement();
                ResultSet row = select.executeQuery(retriveId);
                
                if(!row.next()){
                    JOptionPane.showMessageDialog(this, "Medicine "+Id+" Unavailable! Please enter valid ID");
                }else{
                    System.out.print(row.next());
                    String Query = "Delete from User1.MEDICINE where M_ID="+Id;
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(Query);
                    SelectMed();
                    JOptionPane.showMessageDialog(this, "Medicine "+Id+" Deleted Successfully");
                }

            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, "Error: A SQL exception occured");
                e.printStackTrace();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error: please fill all details correctly!");

            }

        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (m_id.getText().isEmpty() || m_name.getText().isEmpty() || m_price.getText().isEmpty() || m_quantity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information: fill all the fiedls correctly to update");
        }
        else
        {
     
            try{
                
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "User1","User1");

                int Id = Integer.valueOf(m_id.getText());
                String retriveId = "Select M_ID from User1.MEDICINE where M_ID="+Id; 
                Statement select = Con.createStatement();
                ResultSet row = select.executeQuery(retriveId);

                if(!row.next()){
                    JOptionPane.showMessageDialog(this, "Medicine "+Id+" Unavailable! Please enter valid ID to update");
                }else{
                    FDate = m_mftdate.getDate();
                    MyFabdate = new java.sql.Date(FDate.getTime());
                    EDate = m_expdate.getDate();
                    MyExpDate = new java.sql.Date(EDate.getTime());
                    String UpdateQuery = "Update User1.MEDICINE set M_NAME = '"+m_name.getText()+"'"+",M_PRICE = "+Double.valueOf(m_price.getText())+",M_QUANTITY = "+m_quantity.getText()+",M_MFTDATE = '"+MyFabdate+"',M_EXPDATE = '"+MyExpDate+"',M_COMPANY = '"+m_company.getSelectedItem().toString()+"'"+"where M_ID = "+m_id.getText();
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(UpdateQuery);

                    SelectMed();
                    JOptionPane.showMessageDialog(this, "Medicine "+m_id.getText()+" Updated Successfully");
                }
            }catch(org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
                JOptionPane.showMessageDialog(this, "Error: Expiry date must not be lesser than manufacture date!");
            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, "Error: A SQL exception occured");
                e.printStackTrace();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error: please fill all details correctly!");

            }

        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void medicine_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)medicine_table.getModel();
        int Myindex = medicine_table.getSelectedRow();
        m_id.setText(model.getValueAt(Myindex, 0).toString());
        m_name.setText(model.getValueAt(Myindex, 1).toString());
        m_quantity.setText(model.getValueAt(Myindex, 2).toString());
        m_price.setText(model.getValueAt(Myindex, 3).toString());
        m_expdate.setDate((java.sql.Date) model.getValueAt(Myindex, 4));
        m_mftdate.setDate((java.sql.Date) model.getValueAt(Myindex, 5));

        
        
    }//GEN-LAST:event_medicine_tableMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
       
    }//GEN-LAST:event_btnClearMouseClicked

    private void closeXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeXMouseClicked
                System.exit(0);
    }//GEN-LAST:event_closeXMouseClicked

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

    private void sellBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellBtnMouseClicked

        try{
            new SellingFrame().setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Internal Server Error!");

            e.printStackTrace();
        }

    }//GEN-LAST:event_sellBtnMouseClicked

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
            java.util.logging.Logger.getLogger(MedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title10;
    private javax.swing.JLabel Title11;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JLabel Title8;
    private javax.swing.JLabel Title9;
    private javax.swing.JLabel agentBtn;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel closeX;
    private javax.swing.JLabel companyBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> m_company;
    private com.toedter.calendar.JDateChooser m_expdate;
    private javax.swing.JTextField m_id;
    private com.toedter.calendar.JDateChooser m_mftdate;
    private javax.swing.JTextField m_name;
    private javax.swing.JTextField m_price;
    private javax.swing.JTextField m_quantity;
    private javax.swing.JTable medicine_table;
    private javax.swing.JLabel sellBtn;
    // End of variables declaration//GEN-END:variables
}

