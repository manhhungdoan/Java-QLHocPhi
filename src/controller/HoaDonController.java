/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HoaDonController {

    Connect conn = new Connect();

    public HoaDonController() {
    }

    public void hienThiHD(JTable tbl, String sql) {
        ResultSet rs = conn.queryData(sql);
        DefaultTableModel model = new DefaultTableModel();
        String header[] = {"Mã hoá đơn", "Mã sinh viên", "Số tiền nộp", "Ngày nộp", "Học kì"};
        model.setColumnIdentifiers(header);
        try {
            while (rs.next()) {
                String row[] = new String[5];
                row[0] = String.valueOf(rs.getInt("mahd"));
                row[1] = String.valueOf(rs.getInt("masv"));
                row[2] = String.valueOf(rs.getInt("sotiennop"));
                row[3] = rs.getString("ngaynop");
                row[4] = String.valueOf(rs.getInt("hocky"));
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonController.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbl.setModel(model);
    }
}
