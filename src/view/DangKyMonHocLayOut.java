/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MonHocController;
import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DangKyMonHocLayOut extends javax.swing.JFrame {

    /**
     * Creates new form DangKyMonHocLayOut
     */
    Connect conn = new Connect();

    public DangKyMonHocLayOut() {
        initComponents();
        loadDataFromDB();
    }

    String mamon, tenmon, sotin, sotien, ghichu;

    void getTxt() {
        mamon = JL_mamh.getText();
        tenmon = JL_tenmh.getText();
        sotin = JL_sotinchi.getText();
        sotien = JL_sotien.getText();
        ghichu = JText_ghichu.getText();
    }

    String getDateNow() {
        Date today = new Date();
        DateFormat da = new SimpleDateFormat("dd/MM/yyyy");
        String dat = da.format(today);
        return dat;
    }

    void loadDataFromDB() {
        MonHocController.getInstance().hienThiMH(jtbData, "select * from monhoc");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangKy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbmalop = new javax.swing.JLabel();
        lbten = new javax.swing.JLabel();
        lbsotin = new javax.swing.JLabel();
        lbtengv = new javax.swing.JLabel();
        lbdiadiem = new javax.swing.JLabel();
        btnThoat = new javax.swing.JToggleButton();
        btnHuy = new javax.swing.JButton();
        JL_mamh = new javax.swing.JLabel();
        JL_tenmh = new javax.swing.JLabel();
        JL_sotien = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JL_sotinchi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JText_ghichu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 240, 254));

        btnDangKy.setBackground(new java.awt.Color(76, 139, 245));
        btnDangKy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jtbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbData);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã môn học :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên môn : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Số tín :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Bảng chọn lớp học :");

        btnThoat.setBackground(new java.awt.Color(76, 139, 245));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(76, 139, 245));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Huỷ môn học");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        JL_mamh.setText("-------");

        JL_tenmh.setText("------");

        JL_sotien.setText("------");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số tiền :");

        JL_sotinchi.setText("------");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ghi chú");

        JText_ghichu.setColumns(20);
        JText_ghichu.setRows(5);
        jScrollPane2.setViewportView(JText_ghichu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JL_tenmh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JL_mamh, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                        .addComponent(JL_sotinchi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(JL_sotien, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbten)
                                    .addComponent(lbtengv)
                                    .addComponent(lbdiadiem)
                                    .addComponent(lbsotin)))
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(lbmalop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbmalop)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_mamh)
                                .addGap(0, 0, 0)
                                .addComponent(lbten)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JL_tenmh)
                                        .addGap(14, 14, 14)
                                        .addComponent(lbsotin))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbtengv)
                                        .addGap(35, 35, 35)
                                        .addComponent(lbdiadiem)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JL_sotinchi)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JL_sotien))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnHuy)
                        .addGap(26, 26, 26)
                        .addComponent(btnThoat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDataMouseClicked
        int row = jtbData.getSelectedRow();
        String[] r = new String[5];
        for (int i = 0; i < 4; i++) {
            r[i] = jtbData.getModel().getValueAt(row, i).toString();
        }
        JL_mamh.setText(r[0]);
        JL_tenmh.setText(r[1]);
        JL_sotinchi.setText(r[2]);
        JL_sotien.setText(r[3]);
    }//GEN-LAST:event_jtbDataMouseClicked

    DangNhapLayOut dn = new DangNhapLayOut();

      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        getTxt();
        int check = 0;
        ResultSet rs = conn.queryData("select * from dangky where mamh = " + mamon + " and masv = " + dn.tk);
        int giatien = 0;
        try {
            if (!rs.next()) {
                String sql = "insert into dangky values (" + dn.tk + ", " + mamon + ", '" + dateFormat.format(date) + "','" + ghichu + "')";
                check = conn.UpdateData(sql);
                giatien = Integer.valueOf(sotien) * Integer.valueOf(sotin);
                System.out.println(sotien + "===" + sotin);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (check != 0 ) {
            JOptionPane.showMessageDialog(rootPane, "Đăng ký môn học thành công");
            conn.UpdateData("update sinhvien set congno = congno + " + giatien + " where masv  = " + dn.tk);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Không thể đăng ký môn học");
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        getTxt();
        String sql = "delete from dangky where masv = " + dn.tk + " and mamh =  " + mamon;
        System.out.println(sql);
        int check = conn.UpdateData(sql);
        ResultSet rs = conn.queryData("select * from monhoc where mamh = " + mamon);
        int giatien = 0;
        try {
            if (rs.next()) {
                giatien = rs.getInt("sotien") * rs.getInt("sotin");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (check != 0) {
            JOptionPane.showMessageDialog(rootPane, "Huỷ môn học thành công");
             conn.UpdateData("update sinhvien set congno = congno - " + giatien + " where masv  = " + dn.tk);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Không thể huỷ môn học");
        }
    }//GEN-LAST:event_btnHuyActionPerformed

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
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyMonHocLayOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_mamh;
    private javax.swing.JLabel JL_sotien;
    private javax.swing.JLabel JL_sotinchi;
    private javax.swing.JLabel JL_tenmh;
    private javax.swing.JTextArea JText_ghichu;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnHuy;
    private javax.swing.JToggleButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbData;
    private javax.swing.JLabel lbdiadiem;
    private javax.swing.JLabel lbmalop;
    private javax.swing.JLabel lbsotin;
    private javax.swing.JLabel lbten;
    private javax.swing.JLabel lbtengv;
    // End of variables declaration//GEN-END:variables
}
