/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import thuhocphihaui.ThuHocPhiHaUI;


public class Connect {

    public Connection connect = null;
    public static String USERNAME = "root";
    public static String PASSWORD = "";
    public static String DATABASEURL = "jdbc:mysql://localhost:3306/thuhocphisv1";
    public static String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    public void connectMysQL() {
        try {
            Class.forName(jdbcDriver);
            connect = DriverManager.getConnection(DATABASEURL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ThuHocPhiHaUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThuHocPhiHaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (connect != null) {
            System.out.println("connect thành công tới mysql ");
        } else {
            System.out.println("fail connect tới mysql ");
        }
    }
    // function này dùng để get data từ csdl về

    public ResultSet queryData(String sql) {
        ResultSet result = null;
        if (connect == null) {
            connectMysQL();
        }
        Statement statement = null;
        try {
            statement = connect.createStatement();
            result = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    // function này dùng để thêm sửa xóa data
    public int UpdateData(String sql) {
        Statement statement = null;
        if (connect == null) {
            connectMysQL();
        }
        try {
            statement = connect.createStatement();
            return statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void releaseSql() {
        try {
            connect.close();
            System.out.println("Release connect sql!");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
