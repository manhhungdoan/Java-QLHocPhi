/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.MonHoc;

/**
 *
 * @author Admin
 */
public class MonHocController {

    private static MonHocController instance;
    Connect conn = new Connect();
    
//ktra xem doi tuong ton tai hay chua
    public static MonHocController getInstance() {
        if (instance == null) {
            instance = new MonHocController();
        }
        return instance;
    }

    public void hienThiMH(JTable tbl, String sql) {
        ResultSet rs = conn.queryData(sql);
        List<MonHoc> dsMonHoc = new ArrayList<>();
        try {
            while (rs.next()) {
                MonHoc mh = new MonHoc(rs.getString("mamh"), rs.getString("tenmh"), rs.getString("sotin"),rs.getString("sotien"));
                dsMonHoc.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = new DefaultTableModel();
        String header[] = {"Mã lớp học", "Tên môn học", "Số tín", "Số tiền"};
        model.setRowCount(0);
        model.setColumnIdentifiers(header);
        try {
            for (MonHoc i : dsMonHoc) {

                Object[] row = {i.getMamon(),i.getTenmon(),i.getSotin(),i.getSotien()};
                model.addRow(row);
            }
        }
        catch (Exception ex) {
            Logger.getLogger(HoaDonController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        tbl.setModel(model);
    }
}
