package am.bgd.jdbctaskusingjpaproviderhibernate.companypassengerlist;

import am.bgd.jdbctaskusingjpaproviderhibernate.entity.Trip;
import am.bgd.jdbctaskusingjpaproviderhibernate.exceptions.DatabaseException;
import am.bgd.jdbctaskusingjpaproviderhibernate.service.TripService;
import am.bgd.jdbctaskusingjpaproviderhibernate.service.serviceimpl.TripServiceImpl;

import java.sql.SQLException;

/**
 * Created by User on 22.09.2020.
 */
public class TripController {
    private TripService tripService;
    public TripController(){
        this.tripService = new TripServiceImpl();
    }

    public static void main(String[] args) throws DatabaseException, SQLException {
//        Trip trip = new Trip();
//        trip.setTimeIn("12:12:21");
//        trip.setTimeOut("15:05:41");
//        trip.setTownTo("G");
//        trip.setTownFrom("GG");
        TripController tripController = new TripController();
        //System.out.println(tripController.tripService.save(trip));
       Trip trip =  tripController.tripService.getById(6L);

        System.out.println(trip);
    }
}
