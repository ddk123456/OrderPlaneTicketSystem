package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.dao.ILogDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogDaoImpl implements ILogDao {
    @Override
    public void insertLog(String log,Connection conn) throws SQLException {

        String sql = "INSERT INTO logs VALUES(?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, log);
        pstmt.executeUpdate();
    }
}
