package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.ILogDao;
import cn.edu.hcnu.dao.impl.FlightDaoIml;
import cn.edu.hcnu.dao.impl.LogDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;
    ILogDao iLogDao;

    public FlightServiceImpl(){
        iFlightDao=new FlightDaoIml();
        iLogDao=new LogDaoImpl();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        //开启事务
        Connection conn=null;
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orclhc";
            String username = "opts";
            String password = "opts1234";
            conn = DriverManager.getConnection(url, username, password);

            conn.setAutoCommit(false);
            iFlightDao.insertFlight(flight,conn);
            iLogDao.insertLog("韦金龙添加了CZ3209航班",conn);
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("KKKKKKKKKKKKKKKK");
            e.printStackTrace();
            throw e;
        }
        //提交事务
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        return iFlightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {
        return iFlightDao.getFlightByDepartureTime(departureTime);
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
