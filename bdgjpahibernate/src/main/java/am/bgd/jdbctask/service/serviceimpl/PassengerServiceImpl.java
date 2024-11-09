package am.bgd.jdbctask.service.serviceimpl;

import am.bgd.jdbctask.dao.PassengerDao;
import am.bgd.jdbctask.dao.daoImpl.PassengerDaoImpl;
import am.bgd.jdbctask.exceptions.DatabaseException;
import am.bgd.jdbctask.model.Passenger;
import am.bgd.jdbctask.model.Trip;
import am.bgd.jdbctask.service.PassengerService;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * Created by User on 17.09.2020.
 */
public class PassengerServiceImpl implements PassengerService {

    private PassengerDao passengerDao;

    public PassengerServiceImpl() {
        this.passengerDao = new PassengerDaoImpl();
    }

    @Override
    public Passenger getById(long id) throws DatabaseException {
        try {
            return passengerDao.fetchById(id);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public Set<Passenger> getAll() throws DatabaseException {
        try {
            return passengerDao.fetchAll();

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public Set<Passenger> get(int page, int perPage, String sort) throws SQLException {
        return null;
    }

    @Override
    public Passenger save(Passenger passenger) throws DatabaseException {
        try {
            return passengerDao.save(passenger);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public Passenger update(Passenger passenger) throws DatabaseException {
        try {
            return passengerDao.update(passenger);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public void delete(long passengerId) throws DatabaseException {
        try {
            passengerDao.delete(passengerId);
        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public List<Passenger> getPassengersOfTrip(long tripNumber) throws DatabaseException {
        try {
            return passengerDao.getPassengersOfTrip(tripNumber);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public void registerTrip(Trip trip, Passenger passenger) throws DatabaseException {
        try {
            passengerDao.registerTrip(trip, passenger);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }

    @Override
    public void cancelTrip(long passengerId, long tripNumber) throws DatabaseException {
        try {
            passengerDao.cancelTrip(passengerId, tripNumber);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }
}
