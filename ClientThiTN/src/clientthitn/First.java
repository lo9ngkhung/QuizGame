
package clientthitn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class First extends javax.swing.JFrame {

    public String SERVER_IP;

    public First() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(635, 450);
        setLocationRelativeTo(null);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnKetnoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        getContentPane().setLayout(null);
        getContentPane().add(txtIp);
        txtIp.setBounds(230, 150, 220, 43);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NHẬP ĐỊA CHỈ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(102, 150, 110, 43);
        getContentPane().add(txtPort);
        txtPort.setBounds(230, 230, 220, 43);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NHẬP PORT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 230, 102, 43);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUIZ GAME VIETNAM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 40, 620, 56);

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(344, 350, 110, 34);

        btnKetnoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKetnoi.setText("KẾT NỐI");
        btnKetnoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetnoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnKetnoi);
        btnKetnoi.setBounds(174, 350, 100, 34);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientthitn/unnamed.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(3840, 2160));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        JFrame Frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(Frame, "BẠN CÓ CHẮC CHẮN MUỐN THOÁT KHÔNG!", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnKetnoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetnoiActionPerformed

        String str = "";
        str += txtIp.getText();
        str += "///";
        str += txtPort.getText();
        System.out.println(str);
    
        if (txtIp.getText().equals("") || txtPort.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "VUI LÒNG NHẬP VÀO ĐỊA CHỈ IP VÀ PORT", "Warning", JOptionPane.WARNING_MESSAGE);
            txtIp.requestFocus();
            return;
        } else {
            SERVER_IP = txtIp.getText();
            thongtinsv.ServerIP = SERVER_IP;
            int SERVER_PORT = Integer.parseInt(txtPort.getText());
            Socket socket = null;
            if (SERVER_PORT < 0 || SERVER_PORT > 65535) {
                JOptionPane.showMessageDialog(null, "KẾT NỐI VỚI SERVER THẤT BẠI!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    socket = new Socket(SERVER_IP, SERVER_PORT); // Connect to server
                    DataInputStream dis = new DataInputStream((socket.getInputStream()));
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                    JOptionPane.showMessageDialog(null, "THÀNH CÔNG KẾT NỐI VỚI SERVER!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    THONGTIN tt = new THONGTIN();
                    tt.setVisible(true);
                    socket.close();

                } catch (IOException ie) {
                    JOptionPane.showMessageDialog(null, "KẾT NỐI VỚI SERVER THẤT BẠI!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtIp.requestFocus();
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "LỖI KẾT NỐI TỚI SERVER", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }

        }

    }//GEN-LAST:event_btnKetnoiActionPerformed

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
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new First().setVisible(true);

                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetnoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
