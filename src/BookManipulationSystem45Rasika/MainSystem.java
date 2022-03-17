package BookManipulationSystem45Rasika;

import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MainSystem extends javax.swing.JFrame {

    private static Scanner i;
    Functions fn;
    File File = new File("BookInfo.txt"); 
   // DefaultListModel model=new DefaultListModel();
  
    public MainSystem() {
        initComponents();
        fn = new Functions();
        FileRead();
    //  pnlDisplay.setModel( model);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlControl = new javax.swing.JPanel();
        btnBAdd = new javax.swing.JButton();
        btnBUpdate = new javax.swing.JButton();
        btnBClear = new javax.swing.JButton();
        btnBDelete = new javax.swing.JButton();
        lblISBN = new javax.swing.JLabel();
        lblBName = new javax.swing.JLabel();
        lblBEdition = new javax.swing.JLabel();
        lblBAuthor = new javax.swing.JLabel();
        lblBPrice = new javax.swing.JLabel();
        txtBISBN = new javax.swing.JTextField();
        txtBName = new javax.swing.JTextField();
        txtBEdition = new javax.swing.JTextField();
        txtBAuthor = new javax.swing.JTextField();
        txtBPrice = new javax.swing.JTextField();
        lblBFind = new javax.swing.JLabel();
        txtBFind = new javax.swing.JTextField();
        btnBFind = new javax.swing.JButton();
        cmbSort = new javax.swing.JComboBox<>();
        btnViewAll = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnClearAll = new javax.swing.JButton();
        pnlSubHeading = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(102, 0, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.red));

        pnlHeading.setBackground(new java.awt.Color(153, 255, 51));
        pnlHeading.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.red));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Manipulation System");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlControl.setBackground(new java.awt.Color(0, 204, 255));
        pnlControl.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.red));

        btnBAdd.setBackground(new java.awt.Color(204, 255, 153));
        btnBAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBAdd.setForeground(new java.awt.Color(153, 0, 0));
        btnBAdd.setText("Add");
        btnBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBAddActionPerformed(evt);
            }
        });

        btnBUpdate.setBackground(new java.awt.Color(204, 255, 153));
        btnBUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBUpdate.setText("Update");
        btnBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUpdateActionPerformed(evt);
            }
        });

        btnBClear.setBackground(new java.awt.Color(204, 255, 153));
        btnBClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBClear.setForeground(new java.awt.Color(0, 0, 153));
        btnBClear.setText("Clear");
        btnBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBClearActionPerformed(evt);
            }
        });

        btnBDelete.setBackground(new java.awt.Color(204, 255, 153));
        btnBDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBDelete.setText("Delete");
        btnBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDeleteActionPerformed(evt);
            }
        });

        lblISBN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblISBN.setText("ISBN No  :");

        lblBName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBName.setText("Title        :");

        lblBEdition.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBEdition.setText("Edition    :");

        lblBAuthor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBAuthor.setText("Author    :");

        lblBPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBPrice.setText("Price ($) :");

        txtBISBN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtBISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBISBNActionPerformed(evt);
            }
        });

        txtBName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtBEdition.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtBAuthor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtBPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblBFind.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBFind.setText("Find Book     :");

        txtBFind.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtBFind.setToolTipText("");
        txtBFind.setActionCommand("null");
        txtBFind.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBFind.setName(""); // NOI18N
        txtBFind.setPreferredSize(new java.awt.Dimension(7, 25));

        btnBFind.setBackground(new java.awt.Color(204, 255, 153));
        btnBFind.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBFind.setText("Find");
        btnBFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBFindActionPerformed(evt);
            }
        });

        cmbSort.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low - High", "High - Low" }));
        cmbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSortActionPerformed(evt);
            }
        });

        btnViewAll.setBackground(new java.awt.Color(204, 255, 153));
        btnViewAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 255, 153));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 51));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Price Sort by : ");

        btnClearAll.setBackground(new java.awt.Color(204, 204, 255));
        btnClearAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearAll.setForeground(new java.awt.Color(0, 51, 153));
        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        pnlSubHeading.setBackground(new java.awt.Color(102, 0, 102));
        pnlSubHeading.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 0)));
        pnlSubHeading.setForeground(new java.awt.Color(153, 0, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Control Panel");

        javax.swing.GroupLayout pnlSubHeadingLayout = new javax.swing.GroupLayout(pnlSubHeading);
        pnlSubHeading.setLayout(pnlSubHeadingLayout);
        pnlSubHeadingLayout.setHorizontalGroup(
            pnlSubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubHeadingLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSubHeadingLayout.setVerticalGroup(
            pnlSubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addComponent(lblBFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(btnBFind))
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlControlLayout.createSequentialGroup()
                                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBPrice)
                                    .addComponent(lblBAuthor)
                                    .addComponent(lblISBN)
                                    .addComponent(lblBEdition)
                                    .addComponent(lblBName, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtBPrice)
                                    .addComponent(txtBEdition)
                                    .addComponent(txtBName)
                                    .addComponent(txtBISBN)))
                            .addGroup(pnlControlLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                                .addComponent(btnBClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnBUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBAdd)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addGap(18, 18, 18)
                                .addComponent(btnClearAll)
                                .addGap(27, 27, 27)
                                .addComponent(btnViewAll)))))
                .addContainerGap())
            .addComponent(pnlSubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addComponent(pnlSubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(txtBISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBName)
                    .addComponent(txtBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                        .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBEdition)
                            .addComponent(txtBEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBAuthor)
                        .addComponent(txtBAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBPrice)
                    .addComponent(txtBPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBClear)
                    .addComponent(btnBUpdate)
                    .addComponent(btnBDelete)
                    .addComponent(btnBAdd))
                .addGap(26, 26, 26)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBFind, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBFind)
                    .addComponent(btnBFind))
                .addGap(39, 39, 39)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnViewAll)
                    .addComponent(btnClearAll))
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(255, 255, 204));
        Display.setColumns(20);
        Display.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(153, 0, 51));
        Display.setRows(5);
        Display.setTabSize(10);
        Display.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), java.awt.Color.black));
        Display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(Display);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBAddActionPerformed
        if(txtBISBN.getText().trim().isEmpty() || txtBName.getText().trim().
                isEmpty() || txtBEdition.getText().trim().isEmpty() && 
           txtBAuthor.getText().trim().isEmpty() || txtBPrice.getText().trim().
                   isEmpty()){ 
                 JOptionPane.showMessageDialog(null,"Some fields are empty ! "
                         + "Plese Check","Error",JOptionPane.ERROR_MESSAGE); 
                 
        }
        else{
        String ISBN = txtBISBN.getText();
        String Name = txtBName.getText();
        String Edition = txtBEdition.getText();
        String Author = txtBAuthor.getText();
        double Price = Double.parseDouble(txtBPrice.getText());
        if(!fn.FindDuplicate(ISBN)){
           
            if(txtBAuthor.getText().trim().isEmpty()){
                fn.Add(ISBN, Name, Edition, Author, Price);
                Display.setText("Added Successful"); 
            }else{
                fn.Add(ISBN, Name,Edition, Author, Price);
               Display.setText("Added Successful"); 
            }
            
        }else{
          Display.setText(ISBN +" This Book is Already Exsits");
        }           
       }
    }//GEN-LAST:event_btnBAddActionPerformed

    private void btnBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUpdateActionPerformed
        if(txtBISBN.getText().trim().isEmpty() || txtBName.getText().trim()
                .isEmpty() || txtBEdition.getText().trim().isEmpty() && 
           txtBAuthor.getText().trim().isEmpty() || txtBPrice.getText().trim()
                   .isEmpty()){ 
                 JOptionPane.showMessageDialog(null,"Some fields are empty ! "
                         + "Plese Check","Error",JOptionPane.ERROR_MESSAGE);        
        }
        else{
        String ISBN = txtBISBN.getText();
        String Name = txtBName.getText();
        String Edition = txtBEdition.getText();
        String Author = txtBAuthor.getText();
        double Price = Double.parseDouble(txtBPrice.getText());
        if(fn.Update(ISBN, Name, Edition, Author, Price)){
             Display.setText("Updated Successful"); 
        }else{
          Display.setText("Somthing Went Wrong");
        }            
        }
    }//GEN-LAST:event_btnBUpdateActionPerformed

    private void btnBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBClearActionPerformed
txtBISBN.setText(null);
txtBName.setText(null);
txtBEdition.setText(null);
txtBAuthor.setText(null);
txtBPrice.setText(null);

    }//GEN-LAST:event_btnBClearActionPerformed

    private void btnBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDeleteActionPerformed
        if(txtBISBN.getText().trim().isEmpty()){ 
                 JOptionPane.showMessageDialog(null,"Wrong ISBN Number ! "
                         + "Plese Check","Error",JOptionPane.ERROR_MESSAGE);        
        }
        else{
        String ISBN = txtBISBN.getText();
        if(fn.Delete(ISBN)){
              Display.setText("Deleted Successfully"); 
        }else{
           Display.setText("Somthing Went Wrong");
        }            
        }
    }//GEN-LAST:event_btnBDeleteActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed

       Display.setText(fn.Display());   
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        FileWrite();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cmbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSortActionPerformed
             if(cmbSort.getSelectedIndex()== 0){
                fn.AscendingOrder();
              Display.setText(fn.Display());
        }else if(cmbSort.getSelectedIndex()== 1){
            fn.DescendingOrder();
            Display.setText(fn.Display());
        }
    }//GEN-LAST:event_cmbSortActionPerformed

    private void btnBFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBFindActionPerformed
        if(txtBFind.getText().trim().isEmpty()){ 
                 JOptionPane.showMessageDialog(null,"Please Enter the ISBN "
           + "Number or Book Name or Author","Error",JOptionPane.ERROR_MESSAGE);        
        }
        else if(txtBFind.isEnabled()){
        String ISBN = txtBFind.getText();
        String Author = txtBFind.getText();
        String Name = txtBFind.getText();
       Display.setText(fn.Find(ISBN,Name,Author));            
        }else{
         Display.setText("Not Found");
        }
       txtBFind.setText(null); 
    }//GEN-LAST:event_btnBFindActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
txtBISBN.setText(null);
txtBName.setText(null);
txtBEdition.setText(null);
txtBAuthor.setText(null);
txtBPrice.setText(null);
txtBFind.setText(null);
Display.setText(null);
//model.removeAllElements();
//pnlDisplay.setModel(model);
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void txtBISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBISBNActionPerformed

private void FileLoad(){
    try{
             i= new Scanner(new File("BookInfo.txt"));
             i.useDelimiter("[,\n]");
            while (i.hasNext()) {
                fn.ISBN[fn.elements] = i.next();
                fn.Name[fn.elements] = i.next();
                fn.Edition[fn.elements] = i.next();
                fn.Author[fn.elements] = i.next();
                fn.Price[fn.elements] = Double.parseDouble(i.next());
                fn.elements ++;
            }
            i.close(); 
    }catch (IOException ex) {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
        }
   }    
    
private void FileRead(){
    try{
        if(File.exists() && fn.isFull()){
            JOptionPane.showMessageDialog(null,"The FIle is Full ! Please Create new File");              
            FileLoad();
        }else if(File.exists() && fn.isEmpty()){
            JOptionPane.showMessageDialog(null,"Click OK to Run this Application");              
            FileLoad();
        }else{
            JOptionPane.showMessageDialog(null,"The File not Exists ! Create New");            
            File.createNewFile();
            FileLoad();
        }
        }
    catch (IOException ex) {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
 
    public void FileWrite(){
        try{
        String result="";
        for(int i=0; i<fn.elements;i++){
            result +=fn.ISBN[i] + ",";
            result +=fn.Name[i] + ",";
            result +=fn.Edition[i] + ",";
            result +=fn.Author[i] + ",";
            result +=fn.Price[i] +"\n";
        }
        File newFile = new File("temp.txt");
        FileWriter TempFile = new FileWriter(newFile,true);
        BufferedWriter writer = new BufferedWriter(TempFile);
                writer.append(result);
                writer.close();
                File.delete();
            File dump = new File("BookInfo.txt");
            newFile.renameTo(dump);
        }catch (IOException ex) {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Display;
    private javax.swing.JButton btnBAdd;
    private javax.swing.JButton btnBClear;
    private javax.swing.JButton btnBDelete;
    private javax.swing.JButton btnBFind;
    private javax.swing.JButton btnBUpdate;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> cmbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBAuthor;
    private javax.swing.JLabel lblBEdition;
    private javax.swing.JLabel lblBFind;
    private javax.swing.JLabel lblBName;
    private javax.swing.JLabel lblBPrice;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSubHeading;
    private javax.swing.JTextField txtBAuthor;
    private javax.swing.JTextField txtBEdition;
    private javax.swing.JTextField txtBFind;
    private javax.swing.JTextField txtBISBN;
    private javax.swing.JTextField txtBName;
    private javax.swing.JTextField txtBPrice;
    // End of variables declaration//GEN-END:variables
}
