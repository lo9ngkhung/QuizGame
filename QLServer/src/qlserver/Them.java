/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author longp
 */
public class Them extends javax.swing.JFrame {

    /**
     * Creates new form Them
     */
    ConnectDth dbconn = new ConnectDth();
    Connection dbConnection = null;

    public Them() {
        initComponents();
        setResizable(false);
        setSize(750, 380);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        txtA = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        txtCauHoi = new javax.swing.JTextField();
        txtTrinhDo = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtA = new javax.swing.JRadioButton();
        rbtC = new javax.swing.JRadioButton();
        rbtB = new javax.swing.JRadioButton();
        rbtD = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        txtNoiDung.setColumns(20);
        txtNoiDung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(23, 73, 703, 91);

        txtA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtA);
        txtA.setBounds(20, 220, 278, 30);

        txtC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtC);
        txtC.setBounds(20, 290, 278, 30);

        txtB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtB);
        txtB.setBounds(400, 220, 297, 30);

        txtD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtD);
        txtD.setBounds(400, 290, 297, 30);

        txtCauHoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCauHoi);
        txtCauHoi.setBounds(220, 20, 84, 30);

        txtTrinhDo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTrinhDo);
        txtTrinhDo.setBounds(480, 20, 89, 30);

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-30.png"))); // NOI18N
        btnLuu.setText("Th??m");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu);
        btnLuu.setBounds(620, 13, 110, 40);

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-exit-30.png"))); // NOI18N
        btnThoat.setText("Tho??t");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(23, 13, 110, 39);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C??u:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 47, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("????? Kh??:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 20, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("N???i dung:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 50, 68, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C??u A:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(23, 203, 40, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C??u B:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(406, 203, 40, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C??u D:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(406, 268, 50, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("C??u C:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(23, 268, 40, 15);
        getContentPane().add(rbtA);
        rbtA.setBounds(300, 220, 20, 30);
        getContentPane().add(rbtC);
        rbtC.setBounds(300, 290, 20, 30);
        getContentPane().add(rbtB);
        rbtB.setBounds(700, 220, 21, 30);
        getContentPane().add(rbtD);
        rbtD.setBounds(700, 290, 20, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlserver/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(4, 0, 750, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        dbConnection = dbconn.getSqlConnection();
        if (txtCauHoi.getText().equals("") || txtTrinhDo.getText().equals("") || txtNoiDung.getText().equals("") || txtA.getText().equals("") || txtB.getText().equals("") || txtC.getText().equals("") || txtD.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"VUI L??NG ??I???N ?????Y ????? TH??NG TIN! ","Message Dialog",JOptionPane.WARNING_MESSAGE);
        } else {
            int cauhoi = Integer.parseInt(txtCauHoi.getText());
            String trinhdo = txtTrinhDo.getText();
            String noidung = txtNoiDung.getText();
            String a = txtA.getText();
            String b = txtB.getText();
            String c = txtC.getText();
            String d = txtD.getText();
            String dapan = "";
            if (rbtA.isSelected()) {
                dapan = "A";
            } else if (rbtB.isSelected()) {
                dapan = "B";
            } else if (rbtC.isSelected()) {
                dapan = "C";
            } else if (rbtD.isSelected()) {
                dapan = "D";
            }
            String them = "INSERT INTO BODE(CAUHOI,TRINHDO,NOIDUNG,A,B,C,D,DAP_AN) VALUES (" + cauhoi + ",'" + trinhdo + "',N'" + noidung + "',N'" + a + "',N'" + b + "',N'" + c + "',N'" + d + "','" + dapan + "')";
            try {

                PreparedStatement pst = dbConnection.prepareStatement(them);
                int rs = pst.executeUpdate();
                if (rs != 0) {
                    JOptionPane.showMessageDialog(null, "TH??M TH??NH C??NG C??U H???I","Information",JOptionPane.INFORMATION_MESSAGE);
                    clearAllInputField();
                } else {

                    JOptionPane.showMessageDialog(null, "TH??M TH???T B???I","Information",JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Them.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Them().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtA;
    private javax.swing.JRadioButton rbtB;
    private javax.swing.JRadioButton rbtC;
    private javax.swing.JRadioButton rbtD;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCauHoi;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtTrinhDo;
    // End of variables declaration//GEN-END:variables

    private void clearAllInputField() {
        txtCauHoi.setText("");
        txtTrinhDo.setText("");
        txtNoiDung.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");

    }
}
