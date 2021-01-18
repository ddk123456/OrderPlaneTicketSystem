package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {

    void insertFlight(Flight flight, Connection conn) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime) throws SQLException;
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}