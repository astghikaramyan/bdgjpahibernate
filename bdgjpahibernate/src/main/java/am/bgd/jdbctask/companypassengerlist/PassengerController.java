package am.bgd.jdbctask.companypassengerlist;

import am.bgd.jdbctask.exceptions.DatabaseException;
import am.bgd.jdbctask.model.Passenger;
import am.bgd.jdbctask.service.PassengerService;
import am.bgd.jdbctask.service.serviceimpl.PassengerServiceImpl;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 18.09.2020.
 */
public class PassengerController {
    private PassengerService passengerService;
    private CompanyPassengerList companyPassengerList;

    public PassengerController() {
        this.passengerService = new PassengerServiceImpl();
        this.companyPassengerList = new CompanyPassengerList();
    }

    public void addPassengersFromFileList() throws SQLException, DatabaseException {
        List<Passenger> passengerList = companyPassengerList.getPassengersList();
        for (Passenger p : passengerList) {
            this.passengerService.save(p);
        }
    }

    public static void main(String[] args) throws DatabaseException, SQLException {
        PassengerController passengerController = new PassengerController();
        passengerController.addPassengersFromFileList();
    }
}

