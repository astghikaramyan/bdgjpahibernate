package am.bgd.jdbctask.service.serviceimpl;

import am.bgd.jdbctask.dao.CompanyDao;
import am.bgd.jdbctask.dao.daoImpl.CompanyDaoImpl;
import am.bgd.jdbctask.model.Company;
import am.bgd.jdbctask.service.CompanyService;
import java.sql.SQLException;
import java.util.Set;

/**
 * Created by User on 17.09.2020.
 */
public class CompanyServiceImpl implements CompanyService {

    private CompanyDao companyDao;

    public CompanyServiceImpl() {
        this.companyDao = new CompanyDaoImpl();
    }

    @Override
    public Company getById(long id) throws am.bgd.jdbctask.exceptions.DatabaseException {
        try {
            return this.companyDao.fetchById(id);
        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);
        }
    }

    @Override
    public Set<Company> getAll() throws am.bgd.jdbctask.exceptions.DatabaseException {
        try {
            return this.companyDao.fetchAll();
        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);
        }
    }

    @Override
    public Set<Company> get(int page, int perPage, String sort) throws SQLException {
        return null;
    }

    @Override
    public Company save(Company company) throws am.bgd.jdbctask.exceptions.DatabaseException {
        try {
            return companyDao.save(company);
        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);
        }
    }

    @Override
    public Company update(Company company) throws am.bgd.jdbctask.exceptions.DatabaseException {
        try {
            return companyDao.update(company);
        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);
        }
    }

    @Override
    public void delete(long companyId) throws am.bgd.jdbctask.exceptions.DatabaseException {
        try {
            companyDao.delete(companyId);

        } catch (SQLException e) {
            throw new am.bgd.jdbctask.exceptions.DatabaseException(e);

        }
    }
}
