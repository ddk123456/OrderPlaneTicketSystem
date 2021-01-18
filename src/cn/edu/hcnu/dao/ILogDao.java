package cn.edu.hcnu.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ILogDao {
    void insertLog(String log, Connection conn) throws SQLException;
}
