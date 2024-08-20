/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author issur
 */
public class NOTWORKINGUpdateRegistory extends javax.swing.JFrame {

    Connection con;
    Statement statement;
    DefaultTableModel model;

    /**
     * Creates new form UpdateRegistory
     */
    public NOTWORKINGUpdateRegistory() {
        initComponents();
        model = (DefaultTableModel) Regtable.getModel();
        connectToDatabase();
        fetchDataFromDB();
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
        headerpanel = new javax.swing.JPanel();
        detailpanel = new javax.swing.JPanel();
        Regcid = new javax.swing.JLabel();
        Regname = new javax.swing.JLabel();
        Regtele = new javax.swing.JLabel();
        Regemail = new javax.swing.JLabel();
        RegnameTxt = new javax.swing.JTextField();
        RegteleTxt = new javax.swing.JTextField();
        RegemailTxt = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Regtable = new javax.swing.JTable();
        Regheader = new javax.swing.JLabel();
        Regexit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        headerpanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        detailpanel.setBackground(new java.awt.Color(255, 255, 255));
        detailpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Regcid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regcid.setText("CID");

        Regname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regname.setText("Name");

        Regtele.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regtele.setText("Telephone");

        Regemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regemail.setText("Email");

        RegnameTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        RegteleTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        RegemailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        updatebtn.setBackground(new java.awt.Color(0, 0, 0));
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout detailpanelLayout = new javax.swing.GroupLayout(detailpanel);
        detailpanel.setLayout(detailpanelLayout);
        detailpanelLayout.setHorizontalGroup(
            detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailpanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Regcid)
                        .addComponent(Regemail)
                        .addComponent(Regtele)
                        .addComponent(RegteleTxt)
                        .addComponent(RegemailTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Regname)
                        .addComponent(RegnameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(detailpanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailpanelLayout.setVerticalGroup(
            detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailpanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Regcid)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Regname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Regtele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegteleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Regemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegemailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Regtable.setBackground(new java.awt.Color(204, 204, 204));
        Regtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "Name", "Telephone", "Email"
            }
        ));
        Regtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Regtable.setGridColor(new java.awt.Color(0, 0, 0));
        Regtable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Regtable.setShowGrid(true);
        Regtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Regtable);

        Regheader.setBackground(new java.awt.Color(255, 255, 255));
        Regheader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Regheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regheader.setText("Update Registory");

        Regexit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        Regexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regexit.setText("X");
        Regexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegexitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(Regheader, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311)
                        .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regexit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(detailpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Regheader, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Regexit)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detailpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/mysharedb";
            String userName = "root";
            String password = "";

            con = DriverManager.getConnection(url, userName, password);
            statement = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    public void fetchDataFromDB() {
        // Retrieve remaining data and add it to the DefaultTableModel
        try {

            String query = "SELECT * FROM orders";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                // Retrieve data from the result set
                int OID = resultSet.getInt("OrderID");
                String customerName = resultSet.getString("customerName");
                String customerTelephone = resultSet.getString("customerTelephone");
                String customerEmail = resultSet.getString("customerEmail");

                // Add data to the DefaultTableModel
                model.addRow(new Object[]{OID, customerName, customerTelephone, customerEmail});
            }

            // Close the ResultSet
            resultSet.close();
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(rootPane, sqlex);
        }
    }

    private void RegexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegexitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_RegexitMouseClicked

    private void RegexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegexitMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_RegexitMouseEntered

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:

        int oid = Integer.parseInt(Regcid.getText());
        String name = RegnameTxt.getText();
        String tele = RegteleTxt.getText();
        String email = RegemailTxt.getText();

        String query = "UPDATE orders SET CustomerName = '" + name + "', CustomerTelephone = '" + tele + "', "
                + "CustomerEmail = '" + email + "' WHERE OrderID = " + oid;
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        model.setRowCount(0);
        fetchDataFromDB();

    }//GEN-LAST:event_updatebtnActionPerformed

    private void RegtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegtableMouseClicked
        // TODO add your handling code here:
        int SelectedRow = Regtable.getSelectedRow();
        jLabel1.setText(model.getValueAt(SelectedRow, 0).toString());
        RegnameTxt.setText(model.getValueAt(SelectedRow, 1).toString());
        RegteleTxt.setText(model.getValueAt(SelectedRow, 2).toString());
        RegemailTxt.setText(model.getValueAt(SelectedRow, 3).toString());
    }//GEN-LAST:event_RegtableMouseClicked

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
            java.util.logging.Logger.getLogger(NOTWORKINGUpdateRegistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NOTWORKINGUpdateRegistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NOTWORKINGUpdateRegistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NOTWORKINGUpdateRegistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NOTWORKINGUpdateRegistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Regcid;
    private javax.swing.JLabel Regemail;
    private javax.swing.JTextField RegemailTxt;
    private javax.swing.JLabel Regexit;
    private javax.swing.JLabel Regheader;
    private javax.swing.JLabel Regname;
    private javax.swing.JTextField RegnameTxt;
    private javax.swing.JTable Regtable;
    private javax.swing.JLabel Regtele;
    private javax.swing.JTextField RegteleTxt;
    private javax.swing.JPanel detailpanel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
