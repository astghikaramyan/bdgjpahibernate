package am.bgd.jdbctaskusingjpaproviderhibernate.service.serviceimpl;



import am.bgd.jdbctaskusingjpaproviderhibernate.dao.CompanyDao;
import am.bgd.jdbctaskusingjpaproviderhibernate.dao.daoImpl.CompanyDaoImpl;
import am.bgd.jdbctaskusingjpaproviderhibernate.entity.Company;
import am.bgd.jdbctaskusingjpaproviderhibernate.exceptions.DatabaseException;
import am.bgd.jdbctaskusingjpaproviderhibernate.service.CompanyService;

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
    public Company getById(long id) throws DatabaseException {
        try {
            return this.companyDao.fetchById(id);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    @Override
    public Set<Company> getAll() throws DatabaseException {
        try {
            return this.companyDao.fetchAll();
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    @Override
    public Set<Company> get(int page, int perPage, String sort) throws SQLException {
        return this.companyDao.fetch(page, perPage, sort);
    }

    @Override
    public Company save(Company company) throws DatabaseException {
        try {
            return companyDao.save(company);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    @Override
    public Company update(Company company) throws DatabaseException {
        try {
            return companyDao.update(company);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    @Override
    public void delete(long companyId) throws DatabaseException {
        try {
            companyDao.delete(companyId);

        } catch (SQLException e) {
            throw new DatabaseException(e);

        }
    }
}
