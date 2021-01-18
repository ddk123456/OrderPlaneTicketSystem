package cn.edu.hcnu.test;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.impl.FlightDaoIml;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.UUID;

public class FlightTest {

    @Test
    public void testAddFlight(){
        String id= UUID.randomUUID().toString().replace("-","");
        Flight flight = new Flight(id, "CZ3509", "737", 198,
                "河池机场", "广州白云国际机场", "12:00");
        IFlightDao iFlightDao=new FlightDaoIml();
        try {
            iFlightDao.insertFlight(flight);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetFlightByDepartureTime(){
        IFlightDao iFlightDao=new FlightDaoIml();
        try {
            Flight flight=iFlightDao.getFlightByDepartureTime("17:30");
            Assert.assertEquals(null,flight);//断言
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}